/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-27 08:15:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class InformationFly_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/style-customer-information-detail.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section1\">\r\n");
      out.write("		<div class=\"s1-div1\">\r\n");
      out.write("			<div class=\"s1-d1-img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<div class=\"info-title\">\r\n");
      out.write("					<h1>RUỒI</h1>\r\n");
      out.write("					<h5>(Tên khoa học: Diptera)</h5>\r\n");
      out.write("					<p> <span>Đặc điểm:</span> Ruồi trưởng thành dài 5-8 mm. Phủ đầy lông nhỏ đóng vai trò là cơ quan vị giác.\r\n");
      out.write("					Mắt kép phức tạp - với hàng ngàn thấu kính giúp ruồi có một trường quan sát rộng.\r\n");
      out.write("					Và có khả năng tránh chướng ngoại vật rất tốt.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section2\">\r\n");
      out.write("		<div class=\"s2-div1\">\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<h1>VÒNG ĐỜI</h1>\r\n");
      out.write("				<p> Trứng được đẻ thành các mẻ từ 120 đến 150 trứng và có thể nở trong vòng 8 - 72 tiếng. \r\n");
      out.write("				Ấu trùng Ruồi nhà có thể mất 3 - 60 ngày để trưởng thành. Nhộng trưởng thành trong 3 - 28 ngày.\r\n");
      out.write("				Khi đã vào trong nhà, ruồi nhà có thể đậu trên tường, sàn nhà hay trần nhà. \r\n");
      out.write("				Ở ngoài trời chúng ở trên cây, mặt đất, hàng rào, đống phân trộn và thùng rác.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681983913/capstoneproject/pest/lifecycle/flylifecycle_jwp9uh.png\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section3\">\r\n");
      out.write("		<div class=\"s3-div1\">\r\n");
      out.write("			<div class=\"s3-d1-img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681984163/capstoneproject/pest/fact/flyfact_n11u3l.png\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<div class=\"info-title\">\r\n");
      out.write("					<h1>FACT</h1>\r\n");
      out.write("					<h2>Tuổi Thọ</h2>\r\n");
      out.write("					<p>Tùy thuộc vào loài, tuổi thọ của ruồi là tám ngày đến hai tháng hoặc trong một số trường hợp, lên đến một năm.</p>\r\n");
      out.write("					<h2>Sinh Sản</h2>\r\n");
      out.write("					<p>Một cặp ruồi có thể tạo ra hơn 1 triệu con thông qua con cái của chúng trong vài tuần.</p>\r\n");
      out.write("					<h2>Ruồi Trâu Cắn</h2>\r\n");
      out.write("					<p>Vết cắn của ruồi trâu có thể rất đau đối với con người. Chúng có phần miệng giống như con dao thu nhỏ \r\n");
      out.write("					mà chúng dùng để rạch da bằng một chuyển động như cây kéo.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"session4\">\r\n");
      out.write("		<div class=\"s4-div1\">\r\n");
      out.write("			<div class=\"s4-d1-title\"><h2>NHỮNG LOÀI ĐỘNG VẬT GÂY HẠI THƯỜNG GẶP TẠI VIỆT NAM</h2></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"s4-content\">\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationmouse\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681722144/capstoneproject/pest/chuot_vlvoo2.png\"> </a>\r\n");
      out.write("				<h4>Chuột</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationcockroach\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/gian_jqs058.jpg\"> </a>\r\n");
      out.write("				<h4>Gián</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationant\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/kien_y7jees.jpg\"> </a>\r\n");
      out.write("				<h4>Kiến</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg\"> </a>\r\n");
      out.write("				<h4>Ruồi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationmosquito\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/muoi_jbi12x.png\"> </a>\r\n");
      out.write("				<h4>Muỗi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationgrasshopper\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731151/capstoneproject/pest/chauchau_jemzxe.jpg\"> </a>\r\n");
      out.write("				<h4>Châu Chấu</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationbee\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg\"> </a>\r\n");
      out.write("				<h4>Ong</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationdragonfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731159/capstoneproject/pest/chuonchuon_uy54qe.jpg\"> </a>\r\n");
      out.write("				<h4>Chuồn Chuồn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationcricket\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731363/capstoneproject/pest/de_sygmo7.jpg\"> </a>\r\n");
      out.write("				<h4>Dế</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationspider\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/nhen_eysnxi.jpg\"> </a>\r\n");
      out.write("				<h4>Nhện</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationsnake\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/ran_qj8lp1.jpg\"> </a>\r\n");
      out.write("				<h4>Rắn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationtermite\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732231/capstoneproject/pest/moi_re4gmk.jpg\"> </a>\r\n");
      out.write("				<h4>Mối</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationwoodborer\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/mot_z6yu8r.png\"> </a>\r\n");
      out.write("				<h4>Mọt</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationbug\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/rep_ycqajr.png\"> </a>\r\n");
      out.write("				<h4>Rẹp</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"informationflea\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/bochet_ydbxpn.jpg\"> </a>\r\n");
      out.write("				<h4>Bọ Chét</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section5\">\r\n");
      out.write("		<div class=\"s5-div1\">\r\n");
      out.write("			<div class=\"s5-d1-title\">\r\n");
      out.write("				<h2><span>BẠN CẦN XỬ LÝ </span><br/>ĐÁM RUỒI ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>\r\n");
      out.write("				<a href=\"schedule\"><input type=\"submit\" value=\"LIÊN HỆ TƯ VẤN\"> </a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s5-d1-image\">\r\n");
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