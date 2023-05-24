/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-27 08:15:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class InformationBee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<div class=\"info-title\">\r\n");
      out.write("					<h1>ONG</h1>\r\n");
      out.write("					<h5>(Tên khoa học: Anthophila)</h5>\r\n");
      out.write("					<p> <span>Đặc điểm:</span> Ong là loài côn trùng có tổ chức xã hội cao như kiến, mối. \r\n");
      out.write("					Ong sống theo đàn, mỗi đàn đều có ong chúa, ong thợ, ong non... và có sự phân công \r\n");
      out.write("					công việc rõ ràng. Ong có nhiều loài khác nhau hình dạng mầu sắc cũng sẽ khác nhau. \r\n");
      out.write("					Ong thường sống thành đàn, nhiều nhất có khi tới 25.000 – 50.000 con, trong các tổ ở hốc cây, \r\n");
      out.write("					văn phòng nhà xưởng cột điện, bụi rậm.... </p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section2\">\r\n");
      out.write("		<div class=\"s2-div1\">\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<h1>VÒNG ĐỜI</h1>\r\n");
      out.write("				<p> Cũng tương tự như những loài côn trùng khác, ong là côn trùng biến thái \r\n");
      out.write("				hoàn toàn. Chúng trải qua 4 giai đoạn để phát triển thành con ong trưởng thành. \r\n");
      out.write("				Các giai đoạn vòng đời của ong bao gồm: Giai đoạn trứng, ấu trùng, nhộng, con trưởng thành.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681980097/capstoneproject/pest/lifecycle/beelifecycle_nfdjrd.png\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"section3\">\r\n");
      out.write("		<div class=\"s3-div1\">\r\n");
      out.write("			<div class=\"s3-d1-img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681981036/capstoneproject/pest/fact/beefact_wyvocf.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"info\">\r\n");
      out.write("				<div class=\"info-title\">\r\n");
      out.write("					<h1>FACT</h1>\r\n");
      out.write("					<h2>Tấn Công</h2>\r\n");
      out.write("					<p>Côn trùng đốt như ong\r\n");
      out.write("					sử dụng vết đốt của chúng để hạ gục con mồi (chủ yếu là côn trùng và nhện) \r\n");
      out.write("					và để tự vệ hoặc xâm nhật địa bàn của chúng.</p>\r\n");
      out.write("					<h2>Tổ Ong Bắp Cày</h2>\r\n");
      out.write("					<p>Được xây dựng bằng vật liệu giống như giấy do \r\n");
      out.write("					côn trùng trộn nước bọt của chúng với các sợi gỗ mà chúng thu thập được.</p>\r\n");
      out.write("					<h2>Thụ Phấn</h2>\r\n");
      out.write("					<p>Có nhiều loài ong bắp cày là loài thụ phấn quan trọng. Tuy nhiên, \r\n");
      out.write("					nếu xét theo nhóm, ong bắp cày thụ phấn nhưng không thụ phấn hiệu quả như ong vò vẽ.</p>\r\n");
      out.write("					<h2>Bầy Ong</h2>\r\n");
      out.write("					<p>Có hai loại đàn ong: sơ cấp và thứ cấp. Ong chúa dẫn đầu bầy sơ cấp. \r\n");
      out.write("					Bầy thứ cấp được dẫn dắt bởi một số ong cái, trinh nữ. Kết quả là những bầy này có \r\n");
      out.write("					kích thước bằng một nửa so với bầy sơ cấp và không thường xuyên xảy ra.</p>\r\n");
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
      out.write("				<h2><span>BẠN CẦN XỬ LÝ </span><br/>ĐÁM ONG ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>\r\n");
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