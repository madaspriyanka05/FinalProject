/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-11-23 05:51:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>JAN DHAN BANK</title>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <link href=\"index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"header_resize\">\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                    <h1><a href=\"index.html\">JAN DHAN <span>BANK</span></a>\r\n");
      out.write("                        <small>Online Banking Services</small></h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"menu_nav\">\r\n");
      out.write("                    <!-- Navigation -->\r\n");
      out.write("\r\n");
      out.write("                    <ul>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"W3-BAR\"><a href=\"index.html\">My Accounts</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"\">Account Statement</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"f_Index.jsp\">Funds Transfer</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"\">My Profile</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"\">Change UserId/Password</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"Register.jsp\">Register</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"Login.jsp\">Login</a></li>\r\n");
      out.write("                        <li class=\"w3-bar-item\"><a href=\"LogOut.jsp\">LogOut</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"content_resize\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sidebar\">\r\n");
      out.write("                    <div class=\"gadget\">\r\n");
      out.write("                        <h2 class=\"star \"><span>Quick Links</span></h2>\r\n");
      out.write("                        <div class=\"clr\"></div>\r\n");
      out.write("                        <ul class=\"sb_menu\">\r\n");
      out.write("                            <li><a href=\"#\">Account Details</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Account Summary</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Fund Transfer</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Account Statement</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mainbar\">\r\n");
      out.write("                    <div class=\"article\">\r\n");
      out.write("                        <h2>Online Banking Services</h2>\r\n");
      out.write("                        <div class=\"clr\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <img src=\"images.jpg\" width=\"201\" height=\"146\" alt=\"\" class=\"fl\" />\r\n");
      out.write("                        <p>As a value network, BaaS aims at seamlessly integrating as many service providers as needed into one comprehensive process to complete a financial service in an effective and timely manner. It is implied that a BaaS would include\r\n");
      out.write("                            certain features in addition to providing a financial service. There must be means for managing, deploying and delivery of the services' environment. The services must of course be in legal compliance with the banking laws\r\n");
      out.write("                            in the regions where it is made available, with (at least) one entity within the process possessing a banking license. Of utmost importance is the assurance that proper mechanisms are in place to provide security, such as strong\r\n");
      out.write("                            authentication and additional measures to protect sensitive information from unauthorized access throughout the entire process. These security mechanisms must be in compliance with laws of data protection for the jurisdictions\r\n");
      out.write("                            involved. With the proliferation and acceptance of BaaS, the emergence and rapid growth of FinTech can be expected. FinTech is âa business that aims at providing financial services by making use of software and modern technology.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"article\">\r\n");
      out.write("                        <h2>Online Banking Services</h2>\r\n");
      out.write("                        <div class=\"clr\"></div>\r\n");
      out.write("                        <img src=\"images.jpg\" width=\"201\" height=\"146\" alt=\"\" class=\"fl\" />\r\n");
      out.write("                        <p>As a value network, BaaS aims at seamlessly integrating as many service providers as needed into one comprehensive process to complete a financial service in an effective and timely manner. It is implied that a BaaS would include\r\n");
      out.write("                            certain features in addition to providing a financial service. There must be means for managing, deploying and delivery of the services' environment. The services must of course be in legal compliance with the banking laws\r\n");
      out.write("                            in the regions where it is made available, with (at least) one entity within the process possessing a banking license. Of utmost importance is the assurance that proper mechanisms are in place to provide security, such as strong\r\n");
      out.write("                            authentication and additional measures to protect sensitive information from unauthorized access throughout the entire process. These security mechanisms must be in compliance with laws of data protection for the jurisdictions\r\n");
      out.write("                            involved. With the proliferation and acceptance of BaaS, the emergence and rapid growth of FinTech can be expected. FinTech is âa business that aims at providing financial services by making use of software and modern technology.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"clr\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"footer_resize\">\r\n");
      out.write("                <p class=\"lf\">Copyright &copy; <a href=\"#\">Net Banking</a>. All Rights Reserved</p>\r\n");
      out.write("                <p class=\"rf\">Design by <a target=\"_blank\" href=\"http://www.freewebsitetemplatez.com/\">FreeWebsiteTemplatez</a></p>\r\n");
      out.write("                <div class=\"clr\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}