/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-06-05 09:06:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Process_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-6.0.7.jar", Long.valueOf(1679902023841L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1680670021423L));
    _jspx_dependants.put("jar:file:/F:/DUT/HK8/Project/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CapstoneProject/WEB-INF/lib/spring-webmvc-6.0.7.jar!/META-INF/spring-form.tld", Long.valueOf(1679280252000L));
    _jspx_dependants.put("jar:file:/F:/DUT/HK8/Project/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/CapstoneProject/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c-1_2.tld", Long.valueOf(1664428278000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("	margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1{\r\n");
      out.write("	margin-top: 100px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 640px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .div1{\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("	top: 50%;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	transform: translateY(-50%);\r\n");
      out.write("	\r\n");
      out.write("	border-top-left-radius: 30%;\r\n");
      out.write("	border-bottom-right-radius: 30%;\r\n");
      out.write("	background-color: lightblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .img{\r\n");
      out.write("	width: auto;\r\n");
      out.write("	height: auto;\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 8%;\r\n");
      out.write("	top: 50%;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	transform: translateY(-50%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form{\r\n");
      out.write("	width: 45%;\r\n");
      out.write("	height: 500px;\r\n");
      out.write("	/* float: right;\r\n");
      out.write("	margin-right: 5%; */\r\n");
      out.write("	margin-left:48%;\r\n");
      out.write("	top: 50%;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	transform: translateY(-55%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .img img {\r\n");
      out.write("	width: :505px;\r\n");
      out.write("	height: 405px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .schedule-section1 .form input:last-child{\r\n");
      out.write("	transition: 0.5s;\r\n");
      out.write("} */\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form .button input{\r\n");
      out.write("	margin-top: 50px;\r\n");
      out.write("	width: 120px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	color: black;\r\n");
      out.write("	border: none;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	\r\n");
      out.write("	background: #ecf0f3;\r\n");
      out.write("	border-radius: 50px;\r\n");
      out.write("  	box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;\r\n");
      out.write("\r\n");
      out.write("	background-color: lightblue;\r\n");
      out.write("	border: 1px solid lightblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form .button input:hover{\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	background-color: red;\r\n");
      out.write("	transition: 0.5s;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	background-color: #528B8B;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form .text input{\r\n");
      out.write("	margin-top: 110px;\r\n");
      out.write("	width: 400px;\r\n");
      out.write("	height: 50px;\r\n");
      out.write("	color: black;\r\n");
      out.write("	border: /* 1px solid #003366 */ none;\r\n");
      out.write("	padding-left: 30px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	\r\n");
      out.write("	/* box-shadow: 7px 7px 3px 1px lightblue;\r\n");
      out.write("	border-radius: 20px;\r\n");
      out.write("	 */\r\n");
      out.write("	background: #ecf0f3;\r\n");
      out.write("	border-radius: 50px;\r\n");
      out.write("  	box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form input:focus {\r\n");
      out.write("	border: 1px solid #0af; \r\n");
      out.write("	outline: none; \r\n");
      out.write("	-moz-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);\r\n");
      out.write("	-webkit-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);\r\n");
      out.write("	box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);  */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .form{\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .title h1{\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("	color: #528B8B;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".schedule-section1 .title {\r\n");
      out.write("	margin-top: 150px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"schedule-section1\">\r\n");
      out.write("	<div class=\"title\"><h1>Bạn Cần Tra Thông Tin</h1> </div>\r\n");
      out.write("	<div class=\"div1\">\r\n");
      out.write("		<div class=\"img\">\r\n");
      out.write("			<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1685936172/capstoneproject/process/search_srbdum.jpg\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form\">\r\n");
      out.write("			<form action=\"customercontract\" method=\"post\">\r\n");
      out.write("				<div class=\"text\"><input type=\"text\" name=\"phone\" placeholder=\"Nhập SĐT...\" /></div>\r\n");
      out.write("				<div class=\"button\"><input type=\"submit\" value=\"Tìm Kiếm\"/></div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
