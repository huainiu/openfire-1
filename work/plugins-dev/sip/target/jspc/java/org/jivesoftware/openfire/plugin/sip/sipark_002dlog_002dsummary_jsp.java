package org.jivesoftware.openfire.plugin.sip;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jivesoftware.openfire.sip.calllog.CallLog;
import org.jivesoftware.openfire.sip.calllog.CallLogDAO;
import java.util.Collection;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.jivesoftware.util.*;
import java.text.DateFormat;
import java.net.URLEncoder;
import org.jivesoftware.openfire.sip.calllog.CallFilter;

public final class sipark_002dlog_002dsummary_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    final int DEFAULT_RANGE = 15;
    final int[] RANGE_PRESETS = {15, 25, 50, 75, 100};

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n\n\n\n\n\n\n\n\n\n\n");
      out.write('\n');
      out.write('\n');
      org.jivesoftware.util.WebManager webManager = null;
      synchronized (_jspx_page_context) {
        webManager = (org.jivesoftware.util.WebManager) _jspx_page_context.getAttribute("webManager", PageContext.PAGE_SCOPE);
        if (webManager == null){
          webManager = new org.jivesoftware.util.WebManager();
          _jspx_page_context.setAttribute("webManager", webManager, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
 webManager.init(request, response, session, application, out); 
      out.write("\n\n<html>\n<head>\n    <title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title>\n    <meta name=\"pageID\" content=\"sipark-log-summary\"/>\n    <script src=\"/js/prototype.js\" type=\"text/javascript\"></script>\n    <script src=\"/js/scriptaculous.js\" type=\"text/javascript\"></script>\n    <script type=\"text/javascript\" language=\"javascript\" src=\"/js/tooltips/domLib.js\"></script>\n    <script type=\"text/javascript\" language=\"javascript\" src=\"/js/tooltips/domTT.js\"></script>\n    <style type=\"text/css\">@import url( /js/jscalendar/calendar-win2k-cold-1.css );</style>\n    <script type=\"text/javascript\" src=\"/js/jscalendar/calendar.js\"></script>\n    <script type=\"text/javascript\" src=\"/js/jscalendar/i18n.jsp\"></script>\n    <script type=\"text/javascript\" src=\"/js/jscalendar/calendar-setup.js\"></script>\n    <style type=\"text/css\">\n        .jive-current {\n            font-weight: bold;\n            text-decoration: none;\n        }\n\n        .stat {\n            margin: 0px 0px 8px 0px;\n            border: 1px solid #cccccc;\n            -moz-border-radius: 3px;\n        }\n\n        .stat td table {\n            margin: 5px 10px 5px 10px;\n");
      out.write("        }\n        .stat div.verticalrule {\n            display: block;\n            width: 1px;\n            height: 110px;\n            background-color: #cccccc;\n            overflow: hidden;\n            margin-left: 3px;\n            margin-right: 3px;\n        }\n    </style>\n\n    <script type=\"text/javascript\">\n        function hover(oRow) {\n            oRow.style.background = \"#A6CAF0\";\n            oRow.style.cursor = \"pointer\";\n        }\n\n        function noHover(oRow) {\n            oRow.style.background = \"white\";\n        }\n\n        function submitFormAgain(start, range){\n            document.f.start.value = start;\n            document.f.range.value = range;\n            document.f.parseRange.value = \"true\";\n            document.f.submit();\n        }\n    </script>\n    <style type=\"text/css\">\n        .stat {\n            margin: 0px 0px 8px 0px;\n            border: 1px solid #cccccc;\n            -moz-border-radius: 3px;\n        }\n\n        .stat td table {\n            margin: 5px 10px 5px 10px;\n        }\n        .stat div.verticalrule {\n");
      out.write("            display: block;\n            width: 1px;\n            height: 110px;\n            background-color: #cccccc;\n            overflow: hidden;\n            margin-left: 3px;\n            margin-right: 3px;\n        }\n\n        .content {\n            border-color: #bbb;\n            border-style: solid;\n            border-width: 0px 0px 1px 0px;\n        }\n\n        /* Default DOM Tooltip Style */\n        div.domTT {\n            border: 1px solid #bbb;\n            background-color: #FFFBE2;\n            font-family: Arial, Helvetica sans-serif;\n            font-size: 9px;\n            padding: 5px;\n        }\n\n        div.domTT .caption {\n            font-family: serif;\n            font-size: 12px;\n            font-weight: bold;\n            padding: 1px 2px;\n            color: #FFFFFF;\n        }\n\n        div.domTT .contents {\n            font-size: 12px;\n            font-family: sans-serif;\n            padding: 3px 2px;\n        }\n\n        .textfield {\n            font-size: 11px;\n            font-family: Verdana, Arial, sans-serif;\n");
      out.write("            height: 20px;\n            background: #efefef;\n        }\n\n        #searchResults h3 {\n            font-size: 14px;\n            padding: 0px;\n            margin: 0px 0px 2px 0px;\n            color: #104573;\n        }\n\n        #searchResults p.resultDescription {\n            margin: 0px 0px 12px 0px;\n        }\n    </style>\n    <script type=\"text/javascript\">\n        function grayOut(ele) {\n            if (ele.value == 'Any') {\n                ele.style.backgroundColor = \"#FFFBE2\";\n            }\n            else {\n                ele.style.backgroundColor = \"#ffffff\";\n            }\n        }\n    </script>\n    <script type=\"text/javascript\" src=\"/js/behaviour.js\"></script>\n</head>\n<body>\n");
 // Get parameters
    int start = ParamUtils.getIntParameter(request, "start", 0);
    int range = ParamUtils.getIntParameter(request, "range", webManager.getRowsPerPage("user-summary", DEFAULT_RANGE));
    String username = ParamUtils.getParameter(request, "username");
    String numa = ParamUtils.getParameter(request, "numa");
    String numb = ParamUtils.getParameter(request, "numb");
    String type = ParamUtils.getParameter(request, "type");
    String startDate = request.getParameter("startDate");
    String endDate = request.getParameter("endDate");

    CallFilter filter = null;
    if (request.getParameter("submit") != null) {

        Date fromDate = null;
        Date uptoDate = null;

        String anyText = LocaleUtils.getLocalizedString("archive.settings.any", "sip");

        if (anyText.equals(startDate)) {
            startDate = null;
        }

        if (anyText.equals(endDate)) {
            endDate = null;
        }

        if (startDate != null && startDate.length() > 0) {
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            try {
                fromDate = formatter.parse(startDate);
            }
            catch (Exception e) {
                // TODO: mark as an error in the JSP instead of logging..
                Log.error(e);
            }
        }

        if (endDate != null && endDate.length() > 0) {
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            try {
                Date date = formatter.parse(endDate);
                // The user has chosen an end date and expects that any conversation
                // that falls on that day will be included in the search results. For
                // example, say the user choose 6/17/2006 as an end date. If a conversation
                // occurs at 5:33 PM that day, it should be included in the results. In
                // order to make this possible, we need to make the end date one millisecond
                // before the next day starts.
                uptoDate = new Date(date.getTime() + JiveConstants.DAY - 1);
            }
            catch (Exception e) {
                // TODO: mark as an error in the JSP instead of logging..
                Log.error(e);
            }
        }

        filter = CallLogDAO.createSQLFilter(username, numa, numb, type, fromDate, uptoDate);
    }

    if (request.getParameter("range") != null) {
        webManager.setRowsPerPage("user-summary", range);
    }

      out.write("\n\n<form name=\"jid\" action=\"sipark-log-summary.jsp\" method=\"post\">\n    <div>\n    <table class=\"stat\">\n        <tr valign=\"top\">\n            <td>\n            <table cellpadding=\"3\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n                <tbody>\n                    <tr>\n                        <td align=\"left\" width=\"150\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write(":&nbsp\n                        </td>\n                        <td align=\"left\">\n                            <input type=\"text\" size=\"20\" maxlength=\"100\" name=\"username\" value=\"");
      out.print( username != null ? username : "");
      out.write("\">\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"left\" width=\"150\">");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write(":&nbsp\n                        </td>\n                        <td align=\"left\">\n                            <input type=\"text\" size=\"20\" maxlength=\"100\" name=\"numa\" value=\"");
      out.print( numa != null ? numa : "");
      out.write("\">\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"left\" width=\"150\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write(":&nbsp\n                        </td>\n                        <td align=\"left\">\n                            <input type=\"text\" size=\"20\" maxlength=\"100\" name=\"numb\" value=\"");
      out.print( numb != null ? numb : "");
      out.write("\">\n                        </td>\n                    </tr>\n                    <tr>\n                        <td align=\"left\" width=\"150\">");
      if (_jspx_meth_fmt_message_4(_jspx_page_context))
        return;
      out.write(":&nbsp\n                        </td>\n                        <td align=\"left\">\n                            <select name=\"type\" size=\"1\">\n                                <option value=\"all\" ");
      out.print( "all".equals(type) || type == null ? "selected" : "");
      out.write('>');
      if (_jspx_meth_fmt_message_5(_jspx_page_context))
        return;
      out.write("\n                                <option value=\"received\" ");
      out.print( "received".equals(type)? "selected" : "");
      out.write('>');
      if (_jspx_meth_fmt_message_6(_jspx_page_context))
        return;
      out.write("\n                                <option value=\"loss\" ");
      out.print( "missed".equals(type)? "selected" : "");
      out.write('>');
      if (_jspx_meth_fmt_message_7(_jspx_page_context))
        return;
      out.write("\n                                <option value=\"dialed\" ");
      out.print( "dialed".equals(type)? "selected" : "");
      out.write('>');
      if (_jspx_meth_fmt_message_8(_jspx_page_context))
        return;
      out.write("\n                            </select>\n                        </td>\n                    </tr>\n                </tbody>\n            </table>\n            </td>\n            <td width=\"0\" height=\"100%\" valign=\"middle\">\n                <div class=\"verticalrule\"></div>\n            </td>\n            <td>\n                <table>\n                    <tr>\n                        <td colspan=\"3\">\n                            <img src=\"images/icon_daterange.gif\" align=\"absmiddle\" alt=\"\" style=\"margin: 0px 4px 0px 2px;\"/>\n                            <b>");
      if (_jspx_meth_fmt_message_9(_jspx_page_context))
        return;
      out.write("</b>\n                            <a onmouseover=\"domTT_activate(this, event, 'content',\n                                '");
      if (_jspx_meth_fmt_message_10(_jspx_page_context))
        return;
      out.write("',\n                                'trail', true, 'direction', 'northeast', 'width', '220');\"><img src=\"images/icon_help_14x14.gif\" vspace=\"2\" align=\"texttop\"/></a>\n                        </td>\n                    </tr>\n                    <tr valign=\"top\">\n                        <td>");
      if (_jspx_meth_fmt_message_11(_jspx_page_context))
        return;
      out.write("</td>\n                        <td>\n                            <input type=\"text\" id=\"startDate\" name=\"startDate\" size=\"13\"\n                                   value=\"");
      out.print( startDate != null ? startDate :
                                   LocaleUtils.getLocalizedString("archive.search.daterange.any", "sip"));
      out.write("\" class=\"textfield\"/><br/>\n                            <span class=\"jive-description\">");
      if (_jspx_meth_fmt_message_12(_jspx_page_context))
        return;
      out.write("</span>\n                        </td>\n                        <td>\n                            <img src=\"images/icon_calendarpicker.gif\" vspace=\"3\" id=\"startDateTrigger\">\n                        </td>\n                    </tr>\n                    <tr valign=\"top\">\n                        <td>");
      if (_jspx_meth_fmt_message_13(_jspx_page_context))
        return;
      out.write("</td>\n                        <td>\n                            <input type=\"text\" id=\"endDate\" name=\"endDate\" size=\"13\"\n                                   value=\"");
      out.print( endDate != null ? endDate :
                                   LocaleUtils.getLocalizedString("archive.search.daterange.any", "sip") );
      out.write("\" class=\"textfield\"/><br/>\n                            <span class=\"jive-description\">");
      if (_jspx_meth_fmt_message_14(_jspx_page_context))
        return;
      out.write("</span>\n                        </td>\n                        <td>\n                            <img src=\"images/icon_calendarpicker.gif\" vspace=\"3\" id=\"endDateTrigger\">\n                        </td>\n                    </tr>\n                </table>\n            </td>\n        </tr>\n    </table>\n    </div>\n    <input type=\"hidden\" name=\"submit\" value=\"true\">\n    <input type=\"submit\" name=\"get\" value=\"");
      if (_jspx_meth_fmt_message_15(_jspx_page_context))
        return;
      out.write("\">\n</form>\n\n");

    if (filter != null) {
        // Get the user manager
        int logCount = CallLogDAO.getLogCount(filter);

        // paginator vars
        int numPages = (int) Math.ceil((double) logCount / (double) range);
        int curPage = (start / range) + 1;

        StringBuffer sb = new StringBuffer();
        if (username != null)
            sb.append("&username=").append(URLEncoder.encode(username, "utf-8"));
        if (numa != null)
            sb.append("&numa=").append(URLEncoder.encode(numa, "utf-8"));
        if (numb != null)
            sb.append("&numb=").append(URLEncoder.encode(numb, "utf-8"));
        if (type != null)
            sb.append("&type=").append(URLEncoder.encode(type, "utf-8"));
        if (startDate != null)
            sb.append("&startDate=").append(URLEncoder.encode(startDate, "utf-8"));
        if (endDate != null)
            sb.append("&endDate=").append(URLEncoder.encode(endDate, "utf-8"));
        String urlParams = sb.toString();

      out.write("\n<p>\n    ");
      if (_jspx_meth_fmt_message_16(_jspx_page_context))
        return;
      out.write("\n    :\n    <b>");
      out.print( LocaleUtils.getLocalizedNumber(logCount) );
      out.write("\n    </b> --\n\n    ");
 if (numPages > 1) { 
      out.write("\n\n    ");
      if (_jspx_meth_fmt_message_17(_jspx_page_context))
        return;
      out.write("\n    ");
      out.print( LocaleUtils.getLocalizedNumber(start + 1) );
      out.write('-');
      out.print( LocaleUtils
        .getLocalizedNumber(start + range) );
      out.write("\n\n    ");
 } 
      out.write("\n\n   -");
      if (_jspx_meth_fmt_message_18(_jspx_page_context))
        return;
      out.write(":\n    <select size=\"1\"\n            onchange=\"location.href='sipark-log-summary.jsp?submit=true&start=0");
      out.print( urlParams );
      out.write("&range=' + this.options[this.selectedIndex].value;\">\n\n        ");
 for (int i = 0; i < RANGE_PRESETS.length; i++) { 
      out.write("\n\n        <option value=\"");
      out.print( RANGE_PRESETS[i] );
      out.write("\"\n                ");
      out.print( (RANGE_PRESETS[i] == range ? "selected" : "") );
      out.write('>');
      out.print( RANGE_PRESETS[i] );
      out.write("\n        </option>\n\n        ");
 } 
      out.write("\n\n    </select>\n</p>\n\n");
 if (numPages > 1) { 
      out.write("\n\n<p>\n    ");
      if (_jspx_meth_fmt_message_19(_jspx_page_context))
        return;
      out.write("\n    :\n    [\n    ");
 int num = 15 + curPage;
        int s = curPage - 1;
        if (s > 5) {
            s -= 5;
        }
        if (s < 5) {
            s = 0;
        }
        if (s > 2) {
    
      out.write("\n    <a href=\"sipark-log-summary.jsp?submit=true&start=0&range=");
      out.print( range );
      out.print( urlParams );
      out.write("\">1</a> ...\n\n    ");

        }
        int i;
        for (i = s; i < numPages && i < num; i++) {
            String sep = ((i + 1) < numPages) ? " " : "";
            boolean isCurrent = (i + 1) == curPage;
    
      out.write("\n    <a href=\"sipark-log-summary.jsp?submit=true&start=");
      out.print( (i*range) );
      out.write("&range=");
      out.print( range );
      out.print( urlParams );
      out.write("\"\n       class=\"");
      out.print( ((isCurrent) ? "jive-current" : "") );
      out.write("\"\n            >");
      out.print( (i + 1) );
      out.write("\n    </a>");
      out.print( sep );
      out.write("\n\n    ");
 } 
      out.write("\n\n    ");
 if (i < numPages) { 
      out.write("\n\n    ... <a\n        href=\"sipark-log-summary.jsp?submit=true&start=");
      out.print( ((numPages-1)*range) );
      out.write("&range=");
      out.print( range );
      out.write('"');
      out.write('>');
      out.print( numPages );
      out.print( urlParams );
      out.write("\n</a>\n\n    ");
 } 
      out.write("\n\n    ]\n\n</p>\n\n");
 } 
      out.write("\n\n<div class=\"jive-table\">\n    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n        <thead>\n            <tr>\n                <th>&nbsp;</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_20(_jspx_page_context))
        return;
      out.write("</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_21(_jspx_page_context))
        return;
      out.write("</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_22(_jspx_page_context))
        return;
      out.write("</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_23(_jspx_page_context))
        return;
      out.write("</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_24(_jspx_page_context))
        return;
      out.write("</th>\n                <th nowrap>");
      if (_jspx_meth_fmt_message_25(_jspx_page_context))
        return;
      out.write("</th>\n            </tr>\n        </thead>\n        <tbody>\n\n            ");
 // Print the list of users
                Collection<CallLog> calls = CallLogDAO.getCalls(filter, start, range);
                if (calls.isEmpty()) {
            
      out.write("\n            <tr>\n                <td align=\"center\" colspan=\"7\">\n                    ");
      if (_jspx_meth_fmt_message_26(_jspx_page_context))
        return;
      out.write("\n                </td>\n            </tr>\n\n            ");

                }
                int i = start;
                for (CallLog call : calls) {
                    i++;
            
      out.write("\n            <tr class=\"jive-");
      out.print( (((i%2)==0) ? "even" : "odd") );
      out.write("\">\n                <td width=\"1%\">\n                    ");
      out.print( i );
      out.write("\n                </td>\n                <td width=\"30%\">\n                    ");
      out.print(JiveGlobals.formatDateTime(new Date(call.getDateTime())));
      out.write("\n                </td>\n                <td width=\"10%\" align=\"center\" valign=\"middle\">\n                    ");
      out.print(call.getUsername());
      out.write("&nbsp;\n                </td>\n                <td width=\"20%\" align=\"left\">\n                    ");
      out.print(call.getNumA());
      out.write("&nbsp;\n                </td>\n                <td width=\"20%\" align=\"left\">\n                    ");
      out.print(call.getNumB());
      out.write("&nbsp;\n                </td>\n                <td width=\"5%\" align=\"left\">\n                    ");
      out.print(call.getDuration());
      out.write("\n                </td>\n                <td width=\"5%\" align=\"left\">\n                    ");
      out.print(call.getType());
      out.write("\n                </td>\n            </tr>\n\n            ");

                }
            
      out.write("\n        </tbody>\n    </table>\n</div>\n\n");
 if (numPages > 1) { 
      out.write("\n\n<p>\n    ");
      if (_jspx_meth_fmt_message_27(_jspx_page_context))
        return;
      out.write("\n    :\n    [\n    ");
 int num = 15 + curPage;
        int s = curPage - 1;
        if (s > 5) {
            s -= 5;
        }
        if (s < 5) {
            s = 0;
        }
        if (s > 2) {
    
      out.write("\n    <a href=\"sipark-log-summary.jsp?submit=true&start=0&range=");
      out.print( range );
      out.print( urlParams );
      out.write("\">1</a> ...\n\n    ");

        }
        for (i = s; i < numPages && i < num; i++) {
            String sep = ((i + 1) < numPages) ? " " : "";
            boolean isCurrent = (i + 1) == curPage;
    
      out.write("\n    <a href=\"sipark-log-summary.jsp?submit=true&start=");
      out.print( (i*range) );
      out.write("&range=");
      out.print( range );
      out.print( urlParams );
      out.write("\"\n       class=\"");
      out.print( ((isCurrent) ? "jive-current" : "") );
      out.write("\"\n            >");
      out.print( (i + 1) );
      out.write("\n    </a>");
      out.print( sep );
      out.write("\n\n    ");
 } 
      out.write("\n\n    ");
 if (i < numPages) { 
      out.write("\n\n    ... <a\n        href=\"sipark-log-summary.jsp?submit=true&start=");
      out.print( ((numPages-1)*range) );
      out.write("&range=");
      out.print( range );
      out.write('"');
      out.write('>');
      out.print( numPages );
      out.print( urlParams );
      out.write("\n</a>\n\n    ");
 } 
      out.write("\n\n    ]\n\n</p>\n\n");
 } } 
      out.write("\n\n<script type=\"text/javascript\">\n    grayOut(jid.startDate);\n    grayOut(jid.endDate);\n\n     function catcalc(cal) {\n        var endDateField = $('endDate');\n        var startDateField = $('startDate');\n\n        var endTime = new Date(endDateField.value);\n        var startTime = new Date(startDateField.value);\n        if(endTime.getTime() < startTime.getTime()){\n            alert(\"");
      if (_jspx_meth_fmt_message_28(_jspx_page_context))
        return;
      out.write("\");\n            startDateField.value = \"");
      if (_jspx_meth_fmt_message_29(_jspx_page_context))
        return;
      out.write("\";\n        }\n    }\n\n    Calendar.setup(\n    {\n        inputField  : \"startDate\",         // ID of the input field\n        ifFormat    : \"%m/%d/%y\",    // the date format\n        button      : \"startDateTrigger\",       // ID of the button\n        onUpdate    :  catcalc\n    });\n\n    Calendar.setup(\n    {\n        inputField  : \"endDate\",         // ID of the input field\n        ifFormat    : \"%m/%d/%y\",    // the date format\n        button      : \"endDateTrigger\",       // ID of the button\n        onUpdate    :  catcalc\n    });\n</script>\n</body>\n</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("call.summary.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("call.summary.username");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("call.summary.from");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("call.summary.destination");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(null);
    _jspx_th_fmt_message_4.setKey("call.summary.type");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(null);
    _jspx_th_fmt_message_5.setKey("call.type.all");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(null);
    _jspx_th_fmt_message_6.setKey("call.type.received");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(null);
    _jspx_th_fmt_message_7.setKey("call.type.missed");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(null);
    _jspx_th_fmt_message_8.setKey("call.type.dialed");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(null);
    _jspx_th_fmt_message_9.setKey("archive.search.daterange");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(null);
    _jspx_th_fmt_message_10.setKey("archive.search.daterange.tooltip");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(null);
    _jspx_th_fmt_message_11.setKey("archive.search.daterange.start");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(null);
    _jspx_th_fmt_message_12.setKey("archive.search.daterange.format");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(null);
    _jspx_th_fmt_message_13.setKey("archive.search.daterange.end");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(null);
    _jspx_th_fmt_message_14.setKey("archive.search.daterange.format");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent(null);
    _jspx_th_fmt_message_15.setKey("call.summary.filter");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent(null);
    _jspx_th_fmt_message_16.setKey("call.summary.total_calls");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent(null);
    _jspx_th_fmt_message_17.setKey("global.showing");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(null);
    _jspx_th_fmt_message_18.setKey("call.summary.calls_per_page");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(null);
    _jspx_th_fmt_message_19.setKey("global.pages");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent(null);
    _jspx_th_fmt_message_20.setKey("call.summary.time");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent(null);
    _jspx_th_fmt_message_21.setKey("call.summary.username");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent(null);
    _jspx_th_fmt_message_22.setKey("call.summary.from");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent(null);
    _jspx_th_fmt_message_23.setKey("call.summary.destination");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent(null);
    _jspx_th_fmt_message_24.setKey("call.summary.duration");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent(null);
    _jspx_th_fmt_message_25.setKey("call.summary.type");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent(null);
    _jspx_th_fmt_message_26.setKey("call.summary.no-entries");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent(null);
    _jspx_th_fmt_message_27.setKey("global.pages");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent(null);
    _jspx_th_fmt_message_28.setKey("archive.search.daterange.error");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(null);
    _jspx_th_fmt_message_29.setKey("archive.search.daterange.any");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }
}
