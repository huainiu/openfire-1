package org.jivesoftware.openfire.plugin.messageHistory.util;

import org.dom4j.DocumentHelper;
import org.jivesoftware.database.DbConnectionManager;
import org.slf4j.LoggerFactory;
import org.xmpp.packet.Message;
import org.xmpp.packet.PacketExtension;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




/**
 * User: John Kuo
 * Date: 5/9/12
 * Time: 1:52 PM
 * DbUtil provides static access to the native db with functions like insertion and retrieval based on time frames
 */
public class DbUtil {
    //Const
    final private static String HISTORY_MESSAGE = "HistoryMessage";
    final private static String CREATION_DATE = "CreationDate";
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(DbUtil.class);
    /*
    *  This connection has to be a static level
    * */
    private static Connection connection = null; //This connection
    //CONST SQL with plain SQL statement
    protected static final String INSERT = "INSERT INTO ofmessagehistory (fromUser, toUser, subject,threadID, creationDate, messageBody) VALUES (?, ?, ?, ? ,?,?)";
    protected static final String SELECT_7_DAY_HISTORY = "SELECT * FROM ofmessagehistory WHERE (((fromUser=?) AND (toUser=?)) OR ((fromUser=?) AND (toUser=?))) AND (current_timestamp - interval '7 days') <= creationDate ORDER BY creationDate ASC";
    protected static final String SELECT_SUBJECT_HISTORY = "SELECT * FROM ofmessagehistory WHERE (((fromUser=?) AND (toUser=?)) OR ((fromUser=?) AND (toUser=?))) AND (subject=?) AND (current_timestamp - interval '7 days') <= creationDate ORDER BY creationDate ASC";



    public DbUtil() {
    }

    public static void main(String[] args){

//        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Timestamp timestamp = null;
//            timestamp = new Timestamp(simple.parse(String.valueOf(Calendar.getInstance().getTimeInMillis())).getTime());
//            String strDate = simple.format(new java.util.Date());
//            timestamp = Timestamp.valueOf(strDate);
//        timestamp = Timestamp.valueOf(Calendar.getInstance().getTime().toString());

          test();
//        System.out.println("UserEmail = " + sanitizeUserEmail("john.ichat@rides.openfire/edbbeb61"));

    }

    /**
     * Method for testing
     */
    public static void test() {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = simple.format(new java.util.Date());
        Timestamp timestamp = Timestamp.valueOf(strDate);
        insertMessage(2222, "from@1234", "to@1234","VEHICLE ID", timestamp, "HI");
    }

    /**
     * Method to return current db time in Timestamp formate
     *
     * @return Timestamp db timestamp format
     */
    public static Timestamp getCurrentDBTimestamp() {
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strDate = simple.format(new java.util.Date());
        Timestamp timestamp = Timestamp.valueOf(strDate);
        return timestamp;
    }

    /**
     * Method insertMessage provides the basic function for inserting a typical message into the db
     *
     * @param treadId     a unique 8 digits and character mix of identifier for a given conversion, there can only be one unique treadId at a time.
     * @param fromUser    the JID of the message sender
     * @param toUser      the JID of the message receiver
     * @param timestamp   the time of the db in timestamp format
     * @param messageBody the context of the message
     */
    public static void insertMessage(int treadId, String fromUser, String toUser, String subject, Timestamp timestamp, String messageBody) {
        PreparedStatement preparedStatement = null;

        try {
            connection = DbConnectionManager.getConnection();
            preparedStatement = connection.prepareStatement(INSERT, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            preparedStatement.setString(1, sanitizeUserEmail(fromUser));
            preparedStatement.setString(2, sanitizeUserEmail(toUser));

            if(subject == null){
                preparedStatement.setString(3, "");
            }else {
                preparedStatement.setString(3, subject);
            }

            preparedStatement.setInt(4, treadId);
            preparedStatement.setTimestamp(5, timestamp);
            preparedStatement.setString(6, messageBody);

            preparedStatement.execute();

        } catch (SQLException e) {
            logger.error("Error while executing insertMessage with error code of  = " + e.getMessage());
        }
    }

    /**
     * Method sanitizeUserEmail cleans the userEmail from something like "john.ichat@rides.openfire/edbbeb61" to
     * "john.ichat@rides.openfire"
     * @param userEmail the User's Email for Ride.ca account
     * @return a sanitized Email String
     */
    public static String sanitizeUserEmail(String userEmail){
        String sanitizedUserEmail = null;
        if(userEmail.contains("/")){
            sanitizedUserEmail = userEmail.substring(0, userEmail.indexOf("/"));
        }else{
            sanitizedUserEmail = userEmail;
        }
        return sanitizedUserEmail;
    }

    /**
     * Method retrieve7DayHistory retrieves A given user's conversation history in a time frame of 7 days
     * @param userName the query user's Openfire account like "john.ichat@rides.openfire"
     * @param targetName the target's openfire account name
     * @return a ArrayList of HistoryMessage in JSON form
     */
    public static ArrayList<Message> retrieve7DayHistory(String userName, String targetName){
        return retrieveHistory(userName, targetName, SELECT_7_DAY_HISTORY);
    }

    public static ArrayList<Message> retrieveMessageOnSubject(String userName, String targetName, String subject){
        return retrieveSubjectiveConversation(userName, targetName, subject, SELECT_SUBJECT_HISTORY);
    }


    private static ArrayList<Message> retrieveSubjectiveConversation(String userName, String targetName, String subject
            ,String sql){
        // retrieve the histories from db
		ArrayList<Message> historyMessages = new ArrayList<Message>();
		PreparedStatement statement = null;
		ResultSet result = null;
		try
		{
            connection = DbConnectionManager.getConnection();

			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            statement.setString(1, targetName);
			statement.setString(2, userName);
            statement.setString(3, userName);
			statement.setString(4, targetName);
            statement.setString(5, subject);
			result = statement.executeQuery();

			// place into array list
			while (result.next())
			{
                Message historyMessage = new Message();
                historyMessage.setThread(String.valueOf(result.getInt("threadID")));
                historyMessage.setBody(result.getString("messageBody"));
                historyMessage.setSubject(result.getString("subject"));
                historyMessage.setType(Message.Type.headline);

                //HistoryFlag
                org.dom4j.Element historyTag = DocumentHelper.createElement("HistoryMessage");
                historyTag.setText("true");
                historyMessage.addExtension(new PacketExtension(historyTag));
                //Creation From and To in the ExtendedPacket
                org.dom4j.Element fromUserTag = DocumentHelper.createElement("fromUser");
                fromUserTag.setText(result.getString("fromUser").toString());
                org.dom4j.Element toUserTag = DocumentHelper.createElement("toUser");
                toUserTag.setText(result.getString("toUser").toString());
                historyMessage.addExtension(new PacketExtension(fromUserTag));
                historyMessage.addExtension(new PacketExtension(toUserTag));
                //Creation date has to be in an ExtendedPacket
                org.dom4j.Element creationTimeTag = DocumentHelper.createElement("CreationDate");
                creationTimeTag.setText(result.getTimestamp("creationDate").toString());
                historyMessage.addExtension(new PacketExtension(creationTimeTag));
                historyMessages.add(historyMessage);


			}
		}
		catch (SQLException e)
		{
            logger.error("can't retrieve DB connection in retrieveHistory with error message of : " + e.getMessage());
		}
		finally
		{
			DbConnectionManager.closeConnection(result, statement, connection);
		}

		return historyMessages;
    }

    /**
	 * retrieves the history message between the two user, the duration is
	 * specified by the sql
	 *
	 * @return HistoryMessage in our custom format like this
     *
     * <message from="john.web@rides.openfire" to="john.iphone@rides.openfire">
     *     <thread>1</thread>
     *     <body>ghjg</body>
     *     <HistoryMessage>true</HistoryMessage>
     *     <CreationDate>2012-08-15 15:34:56.0</CreationDate>
     * </message>
	 */
	private static ArrayList<Message> retrieveHistory(String userName, String targetName, String sql)
	{
		// retrieve the histories from db
		ArrayList<Message> historyMessages = new ArrayList<Message>();
		PreparedStatement statement = null;
		ResultSet result = null;
		try
		{
            connection = DbConnectionManager.getConnection();

			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			statement.setString(1, userName);
			statement.setString(2, targetName);
            statement.setString(3, targetName);
			statement.setString(4, userName);
			result = statement.executeQuery();

			// place into array list
			while (result.next())
			{
                Message historyMessage = new Message();
                historyMessage.setThread(String.valueOf(result.getInt("threadID")));
                historyMessage.setBody(result.getString("messageBody"));
                
                historyMessage.setType(Message.Type.headline);

                //HistoryFlag
                org.dom4j.Element historyTag = DocumentHelper.createElement("HistoryMessage");
                historyTag.setText("true");
                historyMessage.addExtension(new PacketExtension(historyTag));
                //Creation From and To in the ExtendedPacket
                org.dom4j.Element fromUserTag = DocumentHelper.createElement("fromUser");
                fromUserTag.setText(result.getString("fromUser").toString());
                org.dom4j.Element toUserTag = DocumentHelper.createElement("toUser");
                toUserTag.setText(result.getString("toUser").toString());
                historyMessage.addExtension(new PacketExtension(fromUserTag));
                historyMessage.addExtension(new PacketExtension(toUserTag));
                //Creation date has to be in an ExtendedPacket
                org.dom4j.Element creationTimeTag = DocumentHelper.createElement("CreationDate");
                creationTimeTag.setText(result.getTimestamp("creationDate").toString());
                historyMessage.addExtension(new PacketExtension(creationTimeTag));
                historyMessages.add(historyMessage);


			}
		}
		catch (SQLException e)
		{
            logger.error("can't retrieve DB connection in retrieveHistory with error message of : " + e.getMessage());
		}
		finally
		{
			DbConnectionManager.closeConnection(result, statement, connection);
		}

		return historyMessages;
	}
}
