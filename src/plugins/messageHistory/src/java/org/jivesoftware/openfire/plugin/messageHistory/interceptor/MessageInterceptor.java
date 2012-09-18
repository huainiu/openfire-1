package org.jivesoftware.openfire.plugin.messageHistory.interceptor;

import org.dom4j.tree.DefaultElement;
import org.jivesoftware.openfire.SessionManager;
import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.interceptor.PacketInterceptor;
import org.jivesoftware.openfire.interceptor.PacketRejectedException;
import org.jivesoftware.openfire.plugin.messageHistory.util.DbUtil;
import org.jivesoftware.openfire.session.Session;
import org.slf4j.LoggerFactory;
import org.xmpp.packet.IQ;
import org.xmpp.packet.JID;
import org.xmpp.packet.Message;
import org.xmpp.packet.Packet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * User: John Kuo
 * Date: 5/9/12
 * Time: 11:40 AM
 * Class MessageInterceptor intercepts incoming Packets.  In this particular scenario, Message type is our interest.
 * At the same time it inserts the Message into the DB for persistence.
 */
public class MessageInterceptor implements PacketInterceptor {
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MessageInterceptor.class);
    final private static String HISTORY_MESSAGE = "HistoryMessage";
    final private static int TWO_SECS = 1;
    Timer timer = new Timer();


    public MessageInterceptor(){
    }

    public void interceptPacket(Packet packet, Session session, boolean incoming, boolean processed) throws PacketRejectedException {
//        logger("-------------------Packet----------------------- ");
//        logger("Element  =  " + packet.getElement());
        logger("XML = " + packet.toXML());

        //IQ request from User for HistoryMessage
        if(packet instanceof IQ && incoming == true && processed == true){

            final IQ iq = (IQ) packet;
            //Need to check here if the IQ packet ID is null
            if(iq.getID() != null && iq.getID().contains(HISTORY_MESSAGE)){
                final String fromJID = iq.getFrom().toBareJID();
                final DefaultElement targetElement = (DefaultElement)iq.getElement().content().get(1);
                final String targetJID = targetElement.getText();





                logger("*********RequestForHistoryMessage*************");
                logger("*********RequestForHistoryMessage*************");

                logger("Request for the target JID = " + targetJID);
                logger("Request for the from JID = " + iq.getFrom().toBareJID());
                logger("Full JID = " + iq.getFrom().toFullJID());
                logger("Bare JID = " + iq.getFrom().toBareJID());
                logger("From JID = " + fromJID);
                logger("Target JID = " + targetJID);


                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {

                        //From should be the target of query
                        //To should be the requester
                        DefaultElement subjectElement = null;
                        String subject = null;
                        try{
                            subjectElement = (DefaultElement)iq.getElement().content().get(2);
                            subject = subjectElement.getText();
                        }catch (Exception e){
                            this.userHistoryMessageDispatcher(DbUtil.retrieve7DayHistory(targetJID, fromJID));
                            logger.error("Not able to retrieve subject line of IQ packet");
                        }

                        if(subject != null){
                            this.userHistoryMessageDispatcher(DbUtil.retrieveMessageOnSubject(targetJID, fromJID, subject));
                        }
                    }

                    private void userHistoryMessageDispatcher(ArrayList<Message> historyMessages){
                        for(Message historyMessage : historyMessages){
                            logger("HistoryMessage = " + historyMessage.toXML());
                            SessionManager.getInstance().sendServerMessage(new JID(fromJID),"History",historyMessage.toString());

                        }
                    }
                }, TWO_SECS);
            }

//                XMPPServer.getInstance().getPacketRouter().route(message);

        }

        if (packet instanceof Message) {
            Message message = (Message) packet;
            String vehicleId = message.getSubject();
            String to = message.getTo().toString().substring(0,message.getTo().toString().lastIndexOf("@"));
            String from = message.getFrom().toString().substring(0,message.getFrom().toString().lastIndexOf("@"));

            logger("------------------Message Packet-------------------");
            logger("message packet = " + message.toXML());
//            logger("Subject : " + message.getSubject());
//            logger("Type : " + message.getType());
//            logger("Body : " + message.getBody());
//            logger("From : " + message.getFrom());
//            logger("To : " + message.getTo());
//            logger("ID : " + message.getID());
//            logger("Incoming : " + incoming);
//            logger("Processed : " + processed);

            //Ken's bidLead
            try
            {
                URL url = new URL("http://localhost:8080/bidLead/makeLead");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "text/plain");

                String data = vehicleId+","+to+","+from+","+message.getBody();
                logger("Posting "+data+"to: http://localhost:8080/bidLead/makeLead");
                OutputStream os = conn.getOutputStream();
                os.write(data.getBytes());
                os.flush();

                String line;
                StringBuilder results = new StringBuilder();

                if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(
                        (conn.getInputStream())));

                String output;
                logger("Output from Server .... \n");
                while ((output = br.readLine()) != null) {
                    logger(output);
                }

                conn.disconnect();
            }

            catch (Exception e) {
                logger(e.getMessage());
            }


            //TODO We first check if there is a ThreadID attached to it
//            if(message.getThread() == null){
//                message.setThread(DbUtil.getCurrectDBTimestam().toString());
//            }

            //only store when incoming and processed are TRUE
            if (incoming == true && processed == true ) {
                //Make sure it's not for History message
                String subject = null;
                if(message.getSubject() != null){
                    subject = message.getSubject();
                }

                DbUtil.insertMessage(1, message.getFrom().toString(), message.getTo().toString(), subject,
                        DbUtil.getCurrentDBTimestamp(), message.getBody());
            }

//            logger("Thread : " + message.getThread());
//            logger("XML format : " + message.toXML());
//            logger("------------------END of Message Packet-------------------");
        }
        logger("------------------PACKET-HIT-------------------");
    }



    /**
     * class logger
     *
     * @param message message to log
     */
    private void logger(String message) {
        logger.info(message);
        System.out.println(message);
    }

}
