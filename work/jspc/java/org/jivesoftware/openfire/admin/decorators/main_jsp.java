package org.jivesoftware.openfire.admin.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jivesoftware.util.StringUtils;
import org.jivesoftware.admin.AdminConsole;
import org.jivesoftware.util.LocaleUtils;
import org.xmpp.packet.JID;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/admin.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_usePage_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setBundle_basename_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_title_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_head_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_admin_tabs_currentcss_css;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_admin_subnavbar_currentcss_css;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_admin_sidebar_headercss_currentcss_css;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_admin_subsidebar_currentcss_css;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_title_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_decorator_body_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_admin_tabs_justlinks_currentcss_css;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_decorator_usePage_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_setBundle_basename_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_title_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_head_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_admin_tabs_currentcss_css = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_admin_subnavbar_currentcss_css = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_admin_sidebar_headercss_currentcss_css = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_admin_subsidebar_currentcss_css = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_title_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_decorator_body_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_admin_tabs_justlinks_currentcss_css = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_decorator_usePage_id_nobody.release();
    _jspx_tagPool_fmt_setBundle_basename_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_decorator_title_nobody.release();
    _jspx_tagPool_decorator_head_nobody.release();
    _jspx_tagPool_fmt_message_key.release();
    _jspx_tagPool_fmt_param_value_nobody.release();
    _jspx_tagPool_admin_tabs_currentcss_css.release();
    _jspx_tagPool_admin_subnavbar_currentcss_css.release();
    _jspx_tagPool_admin_sidebar_headercss_currentcss_css.release();
    _jspx_tagPool_admin_subsidebar_currentcss_css.release();
    _jspx_tagPool_decorator_title_default_nobody.release();
    _jspx_tagPool_decorator_body_nobody.release();
    _jspx_tagPool_admin_tabs_justlinks_currentcss_css.release();
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
      			"../error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n\n\n\n\n\n\n\n");
      org.jivesoftware.admin.AdminPageBean info = null;
      synchronized (request) {
        info = (org.jivesoftware.admin.AdminPageBean) _jspx_page_context.getAttribute("info", PageContext.REQUEST_SCOPE);
        if (info == null){
          info = new org.jivesoftware.admin.AdminPageBean();
          _jspx_page_context.setAttribute("info", info, PageContext.REQUEST_SCOPE);
        }
      }
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
      out.write('\n');
      out.write('\n');
      //  decorator:usePage
      com.opensymphony.module.sitemesh.taglib.decorator.UsePageTag _jspx_th_decorator_usePage_0 = (com.opensymphony.module.sitemesh.taglib.decorator.UsePageTag) _jspx_tagPool_decorator_usePage_id_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.UsePageTag.class);
      _jspx_th_decorator_usePage_0.setPageContext(_jspx_page_context);
      _jspx_th_decorator_usePage_0.setParent(null);
      _jspx_th_decorator_usePage_0.setId("decoratedPage");
      int _jspx_eval_decorator_usePage_0 = _jspx_th_decorator_usePage_0.doStartTag();
      if (_jspx_th_decorator_usePage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_decorator_usePage_id_nobody.reuse(_jspx_th_decorator_usePage_0);
        return;
      }
      _jspx_tagPool_decorator_usePage_id_nobody.reuse(_jspx_th_decorator_usePage_0);
      com.opensymphony.module.sitemesh.Page decoratedPage = null;
      decoratedPage = (com.opensymphony.module.sitemesh.Page) _jspx_page_context.findAttribute("decoratedPage");
      out.write('\n');
      out.write('\n');

    String path = request.getContextPath();
    // Decorated pages will typically must set a pageID and optionally set a subPageID
    // and extraParams. Store these values as request attributes so that the tab and sidebar
    // handling tags can get at the data.
    request.setAttribute("pageID", decoratedPage.getProperty("meta.pageID"));
    request.setAttribute("subPageID", decoratedPage.getProperty("meta.subPageID"));
    request.setAttribute("extraParams", decoratedPage.getProperty("meta.extraParams"));

    // Message HTML can be passed in:
    String message = decoratedPage.getProperty("page.message");

      out.write("\n\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n\n");
      if (_jspx_meth_fmt_setBundle_0(_jspx_page_context))
        return;
      out.write("\n<html>\n<head>\n    <title>");
      out.print( AdminConsole.getAppName() );
      out.write(' ');
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      if (_jspx_meth_decorator_title_0(_jspx_page_context))
        return;
      out.write("</title>\n    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( path );
      out.write("/style/global.css\">\n    <script language=\"JavaScript\" type=\"text/javascript\" src=\"");
      out.print( path );
      out.write("/js/prototype.js\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\" src=\"");
      out.print( path );
      out.write("/js/scriptaculous.js\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\" src=\"");
      out.print( path );
      out.write("/js/cookies.js\"></script>\n    <script language=\"JavaScript\" type=\"text/javascript\">\n\n    </script>\n    <script type=\"text/javascript\" src=\"");
      out.print( path );
      out.write("/js/behaviour.js\"></script>\n    <script type=\"text/javascript\">\n    // Add a nice little rollover effect to any row in a jive-table object. This will help\n    // visually link left and right columns.\n    /*\n    var myrules = {\n        '.jive-table TBODY TR' : function(el) {\n            el.onmouseover = function() {\n                this.style.backgroundColor = '#ffffee';\n            }\n            el.onmouseout = function() {\n                this.style.backgroundColor = '#ffffff';\n            }\n        }\n    };\n    Behaviour.register(myrules);\n    */\n    </script>\n    ");
      if (_jspx_meth_decorator_head_0(_jspx_page_context))
        return;
      out.write("\n</head>\n\n<body id=\"jive-body\">\n\n<!-- BEGIN main -->\n<div id=\"main\">\n\n    <div id=\"jive-header\">\n        <div id=\"jive-logo\">\n            <a href=\"/index.jsp\"><img src=\"/images/login_logo.gif\" alt=\"Openfire\" width=\"179\" height=\"53\" /></a>\n        </div>\n        <div id=\"jive-userstatus\">\n            ");
      out.print( AdminConsole.getAppName() );
      out.write(' ');
      out.print( AdminConsole.getVersionString() );
      out.write("<br/>\n            ");
      //  fmt:message
      org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
      _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_message_1.setParent(null);
      _jspx_th_fmt_message_1.setKey("admin.logged_in_as");
      int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
      if (_jspx_eval_fmt_message_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_fmt_message_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_fmt_message_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_fmt_message_1.doInitBody();
        }
        do {
          //  fmt:param
          org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_param_0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _jspx_tagPool_fmt_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
          _jspx_th_fmt_param_0.setPageContext(_jspx_page_context);
          _jspx_th_fmt_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_message_1);
          _jspx_th_fmt_param_0.setValue( "<strong>"+StringUtils.escapeHTMLTags(JID.unescapeNode(webManager.getUser().getUsername()))+"</strong>" );
          int _jspx_eval_fmt_param_0 = _jspx_th_fmt_param_0.doStartTag();
          if (_jspx_th_fmt_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
            return;
          }
          _jspx_tagPool_fmt_param_value_nobody.reuse(_jspx_th_fmt_param_0);
          int evalDoAfterBody = _jspx_th_fmt_message_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_fmt_message_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_1);
        return;
      }
      _jspx_tagPool_fmt_message_key.reuse(_jspx_th_fmt_message_1);
      out.write(" - <a href=\"");
      out.print( path );
      out.write("/index.jsp?logout=true\">");
      out.print( LocaleUtils.getLocalizedString("global.logout") );
      out.write("</a>\n        </div>\n        <div id=\"jive-nav\">\n            <div id=\"jive-nav-left\"></div>\n            ");
      if (_jspx_meth_admin_tabs_0(_jspx_page_context))
        return;
      out.write("\n            <div id=\"jive-nav-right\"></div>\n        </div>\n        <div id=\"jive-subnav\">\n            ");
      if (_jspx_meth_admin_subnavbar_0(_jspx_page_context))
        return;
      out.write("\n        </div>\n    </div>\n\n    <div id=\"jive-main\">\n    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n    <tbody>\n        <tr valign=\"top\">\n            <td width=\"1%\">\n                <div id=\"jive-sidebar-container\">\n                    <div id=\"jive-sidebar-box\">\n                        <div id=\"jive-sidebar\">\n                            ");
      if (_jspx_meth_admin_sidebar_0(_jspx_page_context))
        return;
      out.write("\n                            <br>\n                            <img src=\"");
      out.print( path );
      out.write("/images/blank.gif\" width=\"150\" height=\"1\" border=\"0\" alt=\"\">\n                        </div>\n                    </div>\n                </div>\n            </td>\n            <td width=\"99%\" id=\"jive-content\">\n\n\n                ");
  if (message != null) { 
      out.write("\n\n                    ");
      out.print( message );
      out.write("\n\n                ");
  } 
      out.write("\n\n                <h1>\n                    ");
      if (_jspx_meth_decorator_title_1(_jspx_page_context))
        return;
      out.write("\n                </h1>\n\n                <div id=\"jive-main-content\">\n                    ");
      if (_jspx_meth_decorator_body_0(_jspx_page_context))
        return;
      out.write("\n                </div>\n            </td>\n        </tr>\n    </tbody>\n    </table>\n    </div>\n\n</div>\n<!-- END main -->\n\n<!-- BEGIN footer -->\n\t<div id=\"jive-footer\">\n        <div class=\"jive-footer-nav\">\n            ");
      if (_jspx_meth_admin_tabs_1(_jspx_page_context))
        return;
      out.write("\n        </div>\n        <div class=\"jive-footer-copyright\">\n            Built by <a href=\"http://www.jivesoftware.com\">Jive Software</a> and the <a href=\"http://www.igniterealtime.org\">IgniteRealtime.org</a> community\n        </div>\n    </div>\n<!-- END footer -->\n\n</body>\n</html>\n");
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

  private boolean _jspx_meth_fmt_setBundle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag _jspx_th_fmt_setBundle_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag) _jspx_tagPool_fmt_setBundle_basename_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetBundleTag.class);
    _jspx_th_fmt_setBundle_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setBundle_0.setParent(null);
    _jspx_th_fmt_setBundle_0.setBasename("openfire_i18n");
    int _jspx_eval_fmt_setBundle_0 = _jspx_th_fmt_setBundle_0.doStartTag();
    if (_jspx_th_fmt_setBundle_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
      return true;
    }
    _jspx_tagPool_fmt_setBundle_basename_nobody.reuse(_jspx_th_fmt_setBundle_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("login.title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_decorator_title_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_title_0 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_decorator_title_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_title_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_title_0.setParent(null);
    int _jspx_eval_decorator_title_0 = _jspx_th_decorator_title_0.doStartTag();
    if (_jspx_th_decorator_title_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_title_nobody.reuse(_jspx_th_decorator_title_0);
      return true;
    }
    _jspx_tagPool_decorator_title_nobody.reuse(_jspx_th_decorator_title_0);
    return false;
  }

  private boolean _jspx_meth_decorator_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_head_0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _jspx_tagPool_decorator_head_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_head_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_head_0.setParent(null);
    int _jspx_eval_decorator_head_0 = _jspx_th_decorator_head_0.doStartTag();
    if (_jspx_th_decorator_head_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_head_nobody.reuse(_jspx_th_decorator_head_0);
      return true;
    }
    _jspx_tagPool_decorator_head_nobody.reuse(_jspx_th_decorator_head_0);
    return false;
  }

  private boolean _jspx_meth_admin_tabs_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  admin:tabs
    org.jivesoftware.admin.TabsTag _jspx_th_admin_tabs_0 = (org.jivesoftware.admin.TabsTag) _jspx_tagPool_admin_tabs_currentcss_css.get(org.jivesoftware.admin.TabsTag.class);
    _jspx_th_admin_tabs_0.setPageContext(_jspx_page_context);
    _jspx_th_admin_tabs_0.setParent(null);
    _jspx_th_admin_tabs_0.setCss("");
    _jspx_th_admin_tabs_0.setCurrentcss("currentlink");
    int _jspx_eval_admin_tabs_0 = _jspx_th_admin_tabs_0.doStartTag();
    if (_jspx_eval_admin_tabs_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_admin_tabs_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_admin_tabs_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_admin_tabs_0.doInitBody();
      }
      do {
        out.write("\n            <a href=\"[url]\" title=\"[description]\" onmouseover=\"self.status='[description]';return true;\" onmouseout=\"self.status='';return true;\">[name]</a>\n            ");
        int evalDoAfterBody = _jspx_th_admin_tabs_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_admin_tabs_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_admin_tabs_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_admin_tabs_currentcss_css.reuse(_jspx_th_admin_tabs_0);
      return true;
    }
    _jspx_tagPool_admin_tabs_currentcss_css.reuse(_jspx_th_admin_tabs_0);
    return false;
  }

  private boolean _jspx_meth_admin_subnavbar_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  admin:subnavbar
    org.jivesoftware.admin.SubnavTag _jspx_th_admin_subnavbar_0 = (org.jivesoftware.admin.SubnavTag) _jspx_tagPool_admin_subnavbar_currentcss_css.get(org.jivesoftware.admin.SubnavTag.class);
    _jspx_th_admin_subnavbar_0.setPageContext(_jspx_page_context);
    _jspx_th_admin_subnavbar_0.setParent(null);
    _jspx_th_admin_subnavbar_0.setCss("");
    _jspx_th_admin_subnavbar_0.setCurrentcss("current");
    int _jspx_eval_admin_subnavbar_0 = _jspx_th_admin_subnavbar_0.doStartTag();
    if (_jspx_eval_admin_subnavbar_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_admin_subnavbar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_admin_subnavbar_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_admin_subnavbar_0.doInitBody();
      }
      do {
        out.write("\n                <a href=\"[url]\" title=\"[description]\"\n                  onmouseover=\"self.status='[description]';return true;\" onmouseout=\"self.status='';return true;\"\n                  >[name]</a>\n            ");
        int evalDoAfterBody = _jspx_th_admin_subnavbar_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_admin_subnavbar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_admin_subnavbar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_admin_subnavbar_currentcss_css.reuse(_jspx_th_admin_subnavbar_0);
      return true;
    }
    _jspx_tagPool_admin_subnavbar_currentcss_css.reuse(_jspx_th_admin_subnavbar_0);
    return false;
  }

  private boolean _jspx_meth_admin_sidebar_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  admin:sidebar
    org.jivesoftware.admin.SidebarTag _jspx_th_admin_sidebar_0 = (org.jivesoftware.admin.SidebarTag) _jspx_tagPool_admin_sidebar_headercss_currentcss_css.get(org.jivesoftware.admin.SidebarTag.class);
    _jspx_th_admin_sidebar_0.setPageContext(_jspx_page_context);
    _jspx_th_admin_sidebar_0.setParent(null);
    _jspx_th_admin_sidebar_0.setCss("");
    _jspx_th_admin_sidebar_0.setCurrentcss("currentlink");
    _jspx_th_admin_sidebar_0.setHeadercss("category");
    int _jspx_eval_admin_sidebar_0 = _jspx_th_admin_sidebar_0.doStartTag();
    if (_jspx_eval_admin_sidebar_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_admin_sidebar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_admin_sidebar_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_admin_sidebar_0.doInitBody();
      }
      do {
        out.write("\n                                <a href=\"[url]\" title=\"[description]\"\n                                  onmouseover=\"self.status='[description]';return true;\" onmouseout=\"self.status='';return true;\"\n                                  >[name]</a>\n                                 ");
        if (_jspx_meth_admin_subsidebar_0(_jspx_th_admin_sidebar_0, _jspx_page_context))
          return true;
        out.write("\n                            ");
        int evalDoAfterBody = _jspx_th_admin_sidebar_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_admin_sidebar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_admin_sidebar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_admin_sidebar_headercss_currentcss_css.reuse(_jspx_th_admin_sidebar_0);
      return true;
    }
    _jspx_tagPool_admin_sidebar_headercss_currentcss_css.reuse(_jspx_th_admin_sidebar_0);
    return false;
  }

  private boolean _jspx_meth_admin_subsidebar_0(javax.servlet.jsp.tagext.JspTag _jspx_th_admin_sidebar_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  admin:subsidebar
    org.jivesoftware.admin.SubSidebarTag _jspx_th_admin_subsidebar_0 = (org.jivesoftware.admin.SubSidebarTag) _jspx_tagPool_admin_subsidebar_currentcss_css.get(org.jivesoftware.admin.SubSidebarTag.class);
    _jspx_th_admin_subsidebar_0.setPageContext(_jspx_page_context);
    _jspx_th_admin_subsidebar_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_admin_sidebar_0);
    _jspx_th_admin_subsidebar_0.setCss("");
    _jspx_th_admin_subsidebar_0.setCurrentcss("currentlink");
    int _jspx_eval_admin_subsidebar_0 = _jspx_th_admin_subsidebar_0.doStartTag();
    if (_jspx_eval_admin_subsidebar_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_admin_subsidebar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_admin_subsidebar_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_admin_subsidebar_0.doInitBody();
      }
      do {
        out.write("\n                                    <a href=\"[url]\" title=\"[description]\"\n                                     onmouseover=\"self.status='[description]';return true;\" onmouseout=\"self.status='';return true;\"\n                                     >[name]</a>\n                                 ");
        int evalDoAfterBody = _jspx_th_admin_subsidebar_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_admin_subsidebar_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_admin_subsidebar_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_admin_subsidebar_currentcss_css.reuse(_jspx_th_admin_subsidebar_0);
      return true;
    }
    _jspx_tagPool_admin_subsidebar_currentcss_css.reuse(_jspx_th_admin_subsidebar_0);
    return false;
  }

  private boolean _jspx_meth_decorator_title_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:title
    com.opensymphony.module.sitemesh.taglib.decorator.TitleTag _jspx_th_decorator_title_1 = (com.opensymphony.module.sitemesh.taglib.decorator.TitleTag) _jspx_tagPool_decorator_title_default_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.TitleTag.class);
    _jspx_th_decorator_title_1.setPageContext(_jspx_page_context);
    _jspx_th_decorator_title_1.setParent(null);
    _jspx_th_decorator_title_1.setDefault("&nbsp;");
    int _jspx_eval_decorator_title_1 = _jspx_th_decorator_title_1.doStartTag();
    if (_jspx_th_decorator_title_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_title_default_nobody.reuse(_jspx_th_decorator_title_1);
      return true;
    }
    _jspx_tagPool_decorator_title_default_nobody.reuse(_jspx_th_decorator_title_1);
    return false;
  }

  private boolean _jspx_meth_decorator_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_body_0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _jspx_tagPool_decorator_body_nobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_body_0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_body_0.setParent(null);
    int _jspx_eval_decorator_body_0 = _jspx_th_decorator_body_0.doStartTag();
    if (_jspx_th_decorator_body_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
      return true;
    }
    _jspx_tagPool_decorator_body_nobody.reuse(_jspx_th_decorator_body_0);
    return false;
  }

  private boolean _jspx_meth_admin_tabs_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  admin:tabs
    org.jivesoftware.admin.TabsTag _jspx_th_admin_tabs_1 = (org.jivesoftware.admin.TabsTag) _jspx_tagPool_admin_tabs_justlinks_currentcss_css.get(org.jivesoftware.admin.TabsTag.class);
    _jspx_th_admin_tabs_1.setPageContext(_jspx_page_context);
    _jspx_th_admin_tabs_1.setParent(null);
    _jspx_th_admin_tabs_1.setCss("");
    _jspx_th_admin_tabs_1.setCurrentcss("currentlink");
    _jspx_th_admin_tabs_1.setJustlinks(new Boolean(true));
    int _jspx_eval_admin_tabs_1 = _jspx_th_admin_tabs_1.doStartTag();
    if (_jspx_eval_admin_tabs_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_admin_tabs_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_admin_tabs_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_admin_tabs_1.doInitBody();
      }
      do {
        out.write("\n            <a href=\"[url]\" title=\"[description]\" onmouseover=\"self.status='[description]';return true;\" onmouseout=\"self.status='';return true;\">[name]</a>\n            ");
        int evalDoAfterBody = _jspx_th_admin_tabs_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_admin_tabs_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_admin_tabs_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_admin_tabs_justlinks_currentcss_css.reuse(_jspx_th_admin_tabs_1);
      return true;
    }
    _jspx_tagPool_admin_tabs_justlinks_currentcss_css.reuse(_jspx_th_admin_tabs_1);
    return false;
  }
}
