/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-27 08:18:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Control_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"resources/css/style-customer-control.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@charset \"UTF-8\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("	margin-top: 0px;\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("	color: #FFF;\r\n");
      out.write("	font-size: 50px;\r\n");
      out.write("	font-family: inherit;\r\n");
      out.write("	margin-left: 55%;\r\n");
      out.write("	font-style: oblique;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ----- */\r\n");
      out.write(".image-title{\r\n");
      out.write("	background-image: url(\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682334957/capstoneproject/control/imagetitle_a7jmk3.jpg\");\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 650px;\r\n");
      out.write("	background-size: 100% 100%;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	margin-top: 90px;\r\n");
      out.write("	\r\n");
      out.write("	padding-top: 0.25px;\r\n");
      out.write("	filter:brightness(85%);\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".session1{\r\n");
      out.write("	margin-top: 60px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 650px;\r\n");
      out.write("}\r\n");
      out.write(" h2{\r\n");
      out.write("	font-size: 30px;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	line-height: 50px;	\r\n");
      out.write("}\r\n");
      out.write(".s1-d1-img img{\r\n");
      out.write("	width: 520px;\r\n");
      out.write("	height: 590px;\r\n");
      out.write("	margin-right: 100px;\r\n");
      out.write("}\r\n");
      out.write(".s1-d1-title h2 span{\r\n");
      out.write("	color: #528B8B;\r\n");
      out.write("}\r\n");
      out.write(".s1-d1-img {\r\n");
      out.write("	float: right;\r\n");
      out.write("	width: auto;\r\n");
      out.write("	margin-right: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s1-d1-title{\r\n");
      out.write("	float: left;\r\n");
      out.write("	width: 600px;\r\n");
      out.write("	margin-left: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".session1-text{\r\n");
      out.write("	margin-top: 40px;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	font-size: 20px;\r\n");
      out.write("	line-height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .s1-div1{\r\n");
      out.write("	clear: both;\r\n");
      out.write("} */\r\n");
      out.write("\r\n");
      out.write(".session2{\r\n");
      out.write("	margin-top: 60px;\r\n");
      out.write("	background-color: #99CCCC;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 1100px;\r\n");
      out.write("	padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-d1-title h2{\r\n");
      out.write("	margin-left: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-content {\r\n");
      out.write("	padding-top: 40px;\r\n");
      out.write("	padding-left: 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-content a img{\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 200px;\r\n");
      out.write("	\r\n");
      out.write("	border: 2px solid;\r\n");
      out.write("	\r\n");
      out.write("	border-radius: 100px;\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-content a img:hover {\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	border: 10px solid #5F9EA0;\r\n");
      out.write("	transition:0.3s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-s2content-pest{\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-right: 80px;\r\n");
      out.write("	margin-top: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s2-s2content-pest h4{\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	margin-left: 70px;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".section3{\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 620px;\r\n");
      out.write("	margin-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s3-d1-image img{\r\n");
      out.write("	width: 660px;\r\n");
      out.write("	height: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s3-d1-title{\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-left: 180px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s3-d1-title h2 span{\r\n");
      out.write("	color: #528B8B;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s3-d1-title input{\r\n");
      out.write("	width: 200px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	background-color: #528B8B;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: 1px solid #333366;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".s3-d1-title input:hover {\r\n");
      out.write("	font-size: 17px;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"image-title\">\r\n");
      out.write("		<h1>KIỂM SOÁT ĐỘNG VẬT</h1>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"session1\">\r\n");
      out.write("		<div class=\"s1-div1\">\r\n");
      out.write("			<div class=\"s1-d1-title\">\r\n");
      out.write("				<h2><span>CÓ KIẾN THỨC</span><br/> VỀ PHƯƠNG THỨC KIỂM SOÁT <br/> GIÚP NHÀ BẠN VẮNG BÓNG KẺ ĐỊCH</h2>\r\n");
      out.write("				<div class=\"session1-text\">\r\n");
      out.write("					Việc sử dụng hóa chất không có kế hoạch giúp côn trùng gia tăng khả năng miễn dịch và tiếp tục sinh sôi mạnh mẽ hơn. \r\n");
      out.write("					Hiểu được điều đó, công ty luôn dựa trên các nguyên lý khoa học, sinh học để xây dựng ra những giải pháp có tính bền vững, \r\n");
      out.write("					lâu dài nhằm kiểm soát côn trùng dịch hại tối ưu.\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s1-d1-img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682335711/capstoneproject/control/control_vqeq5v.png\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"session2\">\r\n");
      out.write("		<div class=\"s2-div1\">\r\n");
      out.write("			<div class=\"s2-d1-title\"><h2>MỘT SỐ LOÀI ĐỘNG VẬT GÂY HẠI BẠN CẦN KIỂM SOÁT</h2></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"s2-content\">\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlmouse\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681722144/capstoneproject/pest/chuot_vlvoo2.png\"> </a>\r\n");
      out.write("				<h4>Chuột</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlcockroach\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/gian_jqs058.jpg\"> </a>\r\n");
      out.write("				<h4>Gián</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlant\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/kien_y7jees.jpg\"> </a>\r\n");
      out.write("				<h4>Kiến</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg\"> </a>\r\n");
      out.write("				<h4>Ruồi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlmosquito\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/muoi_jbi12x.png\"> </a>\r\n");
      out.write("				<h4>Muỗi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlgrasshopper\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731151/capstoneproject/pest/chauchau_jemzxe.jpg\"> </a>\r\n");
      out.write("				<h4>Châu Chấu</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlbee\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg\"> </a>\r\n");
      out.write("				<h4>Ong</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controldragonfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731159/capstoneproject/pest/chuonchuon_uy54qe.jpg\"> </a>\r\n");
      out.write("				<h4>Chuồn Chuồn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlcricket\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731363/capstoneproject/pest/de_sygmo7.jpg\"> </a>\r\n");
      out.write("				<h4>Dế</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlspider\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/nhen_eysnxi.jpg\"> </a>\r\n");
      out.write("				<h4>Nhện</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlsnake\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/ran_qj8lp1.jpg\"> </a>\r\n");
      out.write("				<h4>Rắn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controltermite\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732231/capstoneproject/pest/moi_re4gmk.jpg\"> </a>\r\n");
      out.write("				<h4>Mối</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlwoodborer\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/mot_z6yu8r.png\"> </a>\r\n");
      out.write("				<h4>Mọt</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlbug\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/rep_ycqajr.png\"> </a>\r\n");
      out.write("				<h4>Rẹp</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s2-s2content-pest\">\r\n");
      out.write("				<a href=\"controlflea\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/bochet_ydbxpn.jpg\"> </a>\r\n");
      out.write("				<h4>Bọ Chét</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section3\">\r\n");
      out.write("		<div class=\"s3-div1\">\r\n");
      out.write("			<div class=\"s3-d1-title\">\r\n");
      out.write("				<h2><span>BẠN CẦN XỬ LÝ </span><br/>ĐÁM ĐỘNG VẬT GÂY HẠI ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>\r\n");
      out.write("				<a href=\"schedule\"><input type=\"submit\" value=\"LIÊN HỆ TƯ VẤN\"> </a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s3-d1-image\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681718962/capstoneproject/information/pest-control_qthlxe.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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