package org.jivesoftware.openfire.plugin.fastpath;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.beans.*;
import org.jivesoftware.xmpp.workgroup.dispatcher.AgentSelector;
import org.jivesoftware.util.ParamUtils;
import java.util.List;
import org.jivesoftware.util.StringUtils;
import org.jivesoftware.openfire.fastpath.util.WorkgroupUtils;
import org.jivesoftware.util.ClassUtils;
import org.jivesoftware.util.Log;

public final class agent_002dselectors_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
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
      			"workgroup-error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 try { 
      out.write('\n');
      out.write('\n');
 // Get parameters
    boolean addAlgorithm = ParamUtils.getBooleanParameter(request, "addAlgorithm");
    String newClassname = ParamUtils.getParameter(request, "newClassname");

    String error = "";
    String errorMessage = ParamUtils.getParameter(request, "errorMessage");

    // Add a new interceptor to the list of installable algorithms
    if (addAlgorithm) {
        try {
            if (newClassname != null) {
                // Load the specified class, make sure it's an insance of the interceptor class:
                Class c = ClassUtils.forName(newClassname.trim());
                Object obj = c.newInstance();
                if (obj instanceof AgentSelector) {
                    WorkgroupUtils.addAgentSelectorClass(c);
                }
                else {
                    error = newClassname.trim() + " is not an AgentSelector";
                }
            }
            else {
                error = "You must specify an AgentSelector class to load.";
            }
        }
        catch (ClassNotFoundException cnfe) {
            error = newClassname.trim() + " is not a valid classname";
        }

        catch (InstantiationException ie) {
            error = newClassname.trim() + " must have a valid constructor";
        }
        catch (Exception e) {
            Log.error(e);
            error = "Could not load class " + newClassname.trim();
        }
        String redirect = "agent-selectors.jsp?errorMessage=" + error;
        response.sendRedirect(redirect);
        return;
    }


      out.write("\n\n<html>\n    <head>\n        <title>Dispatcher Settings</title>\n        <meta name=\"pageID\" content=\"member-selectors\"/>\n        <!--<meta name=\"helpPage\" content=\"configure_global_dispatcher_settings.html\"/>-->\n\n        <script language=\"JavaScript\" type=\"text/javascript\">\n        var algorithmInfo = new Array(\n");
	    int i = 0;
        List<AgentSelector> availableAgentSelectors = WorkgroupUtils.getAvailableAgentSelectors();
        for(AgentSelector agentSelector : availableAgentSelectors){

            try {
                BeanDescriptor descriptor = (Introspector.getBeanInfo(agentSelector.getClass())).getBeanDescriptor();

      out.write("\n            new Array(\n                \"");
      out.print( descriptor.getBeanClass().getName() );
      out.write("\",\n                \"");
      out.print( descriptor.getValue("version") );
      out.write("\",\n                \"");
      out.print( descriptor.getValue("author") );
      out.write("\",\n                \"");
      out.print( StringUtils.replace(descriptor.getShortDescription(), "\"", "\\\"") );
      out.write("\"\n            )\n");
          if ((availableAgentSelectors.size() - i) > 1) { 
      out.write("\n                ,\n");
	        }
                } catch (Exception e) {}
                 i++;
            }

      out.write("\n        );\n        function properties(theForm) {\n            var className = theForm.algorithms.options[theForm.algorithms.selectedIndex].value;\n            var selected = 0;\n            for (selected=0; selected<algorithmInfo.length; selected++) {\n                if (algorithmInfo[selected][0] == className) {\n                    var version = algorithmInfo[selected][1];\n                    var author = algorithmInfo[selected][2];\n                    var description = algorithmInfo[selected][3];\n                    theForm.version.value = ((version==\"null\")?\"\":version);\n                    theForm.author.value = ((author==\"null\")?\"\":author);\n                    theForm.description.value = ((description==\"null\")?\"\":description);\n                    break;\n                }\n            }\n        }\n        </script>\n    </head>\n    <body>\n\n<span>\n\n<p>Below is a list of available algorithms for choosing the best agent in a queue that may\nreceive an offer. Use the form below to install new algorithms.\n</p>\n\n</span>\n");
      out.write("\n<p>\n\n");
  // Print out a message if one exists
    String oneTimeMessage = errorMessage;
    if (oneTimeMessage != null) {

      out.write("\n    <font size=\"-1\" color=\"#ff0000\">\n    <p><i>");
      out.print( oneTimeMessage );
      out.write("</i></p>\n\n");
  }

      out.write("\n\n<p>\n\n<form action=\"agent-selectors.jsp\" method=\"post\">\n\n<span class=\"jive-install-interceptor\">\n\n<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n<tr><td>\n    <b>Available Algorithms</b>\n    </td>\n    <td>\n    <a href=\"#\" onclick=\"helpwin('algorithms','install_interceptor');return false;\"\n     title=\"Click for help\"\n     ><img src=\"images/help-16x16.gif\" width=\"16\" height=\"16\" border=\"0\" hspace=\"8\" alt=\"\" /></a>\n    </td>\n</tr>\n</table><br>\n\n<ul>\n\t<table bgcolor=\"#aaaaaa\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"1%\">\n    <tr><td>\n        <table cellpadding=\"4\" cellspacing=\"1\" border=\"0\" width=\"100%\">\n        <tr bgcolor=\"#eeeeee\">\n            <td align=\"center\">\n                <font size=\"-2\" face=\"verdana\"><b>AVAILABLE ALGORITHMS</b></font>\n            </td>\n        </tr>\n        <tr bgcolor=\"#ffffff\">\n            <td>\n                <table cellpadding=\"1\" cellspacing=\"0\" border=\"0\">\n                <tr>\n                    <td width=\"48%\" valign=\"top\">\n                        <select size=\"8\" name=\"algorithms\" onchange=\"properties(this.form);\">\n");
      out.write("                        ");
  for(AgentSelector agentSelector : WorkgroupUtils.getAvailableAgentSelectors()) {
                            BeanDescriptor descriptor = (Introspector.getBeanInfo(agentSelector.getClass())).getBeanDescriptor();
                        
      out.write("\n                            <option value=\"");
      out.print( descriptor.getBeanClass().getName() );
      out.write("\"\n                             >");
      out.print( descriptor.getDisplayName() );
      out.write("\n\n                        ");
  } 
      out.write("\n                        </select>\n                        <br>\n                    </td>\n                    <td width=\"2%\"><img src=\"images/blank.gif\" width=\"5\" height=\"1\" border=\"0\" alt=\"\" /></td>\n                    <td width=\"48%\" valign=\"top\">\n\n                        <table cellpadding=\"2\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n                        <tr>\n                            <td><font size=\"-2\">VERSION</font></td>\n                            <td><input type=\"text\" size=\"20\" name=\"version\" style=\"width:100%\"></td>\n                        </tr>\n                        <tr>\n                            <td><font size=\"-2\">AUTHOR</font></td>\n                            <td><input type=\"text\" size=\"20\" name=\"author\" style=\"width:100%\"></td>\n                        </tr>\n                        <tr>\n                            <td valign=\"top\"><font size=\"-2\">DESCRIPTION</font></td>\n                            <td><textarea name=\"description\" cols=\"20\" rows=\"5\" wrap=\"virtual\"></textarea></td>\n                        </tr>\n");
      out.write("                        </table>\n\n                    </td>\n                </tr>\n                </table>\n            </td>\n        </tr>\n        </table>\n    </td></tr>\n    </table>\n</ul>\n\n</span>\n\n</form>\n\n<form action=\"agent-selectors.jsp\">\n<input type=\"hidden\" name=\"addAlgorithm\" value=\"true\">\n<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n<tr><td>\n    <b>Add Algorithm Class</b>\n    </td>\n    <td>\n    <a href=\"#\" onclick=\"helpwin('algorithms','add_algorithm_class');return false;\"\n     title=\"Click for help\"\n     ><img src=\"images/help-16x16.gif\" width=\"16\" height=\"16\" border=\"0\" hspace=\"8\" alt=\"\" /></a>\n    </td>\n</tr>\n</table><br>\n<ul>\n    <table cellpadding=\"2\" cellspacing=\"0\" border=\"0\">\n    <tr>\n    \t<td>Class Name:</td>\n    \t<td><input type=\"text\" name=\"newClassname\" value=\"\" size=\"30\" maxlength=\"100\"></td>\n    \t<td><input type=\"submit\" value=\"Add Algorithm\"></td>\n    </tr>\n    </table>\n</ul>\n</form>\n\n<p>\n\n\n</body>\n</html>\n");
 } catch(Exception ex){ex.printStackTrace(); } 
      out.write('\n');
      out.write('\n');
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
}
