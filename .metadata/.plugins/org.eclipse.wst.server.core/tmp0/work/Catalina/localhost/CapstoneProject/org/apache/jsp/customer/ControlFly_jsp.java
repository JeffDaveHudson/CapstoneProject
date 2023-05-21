/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-27 08:02:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.customer;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class ControlFly_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("	href=\"resources/css/style-customer-control-detail.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"cm-section1\">\r\n");
      out.write("		<div class=\"div1\">\r\n");
      out.write("			<div class=\"img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682486363/capstoneproject/controldetail/pest/controlfly_fvekee.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<h1>MỐI NGUY HẠI</h1>\r\n");
      out.write("				<div class=\"dangerous1\">\r\n");
      out.write("					<h4>Truyền Bệnh</h4>\r\n");
      out.write("					<p>Ruồi là vật chủ phát tán các căn bệnh truyền nhiễm nguy hiểm như kiết lỵ, thương hàn, nhiễm trùng đường ruột, sán dây,...</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"dangerous2\">\r\n");
      out.write("					<h4>Ảnh Hưởng Cuộc Sống</h4>\r\n");
      out.write("					<p>Tiếng kêu \"vo ve\" phát ra từ đôi cánh của ruồi gây suy giảm tập trung, ảnh hướng đến chất lượng cuộc sống.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"dangerous3\">\r\n");
      out.write("					<h4>Bệnh Về Mắt</h4>\r\n");
      out.write("					<p>Ruồi là tác nhân chính gây ra các bệnh về mắt như mắt hột, nhiễm khuẩn mắt, bệnh giun mắt Thelazia,...</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"cm-section2\">\r\n");
      out.write("		<div class=\"div1\">\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<h1>DẤU HIỆU XÂM NHẬP</h1>\r\n");
      out.write("				<div class=\"content-detail\">\r\n");
      out.write("					<h4>* Âm Thanh</h4>\r\n");
      out.write("					<p>Tiếng kêu vo ve phát ra từ đôi cánh là dấu hiệu dễ nhận biết nhất cho sự xâm nhập của loài ruồi.</p>\r\n");
      out.write("					<h4>* Nhìn Thấy</h4>\r\n");
      out.write("					<p>Loài ruồi có kích thước đủ to để bạn có thể dễ dàng phát hiện bằng mắt thường.</p>\r\n");
      out.write("					<h4>* Trứng</h4>\r\n");
      out.write("					<p>Ruồi thường chọn những nơi có độ ẩm cao để đẻ trứng như: nhà tắm, cống rãnh, nhà bếp, giẻ lau,...</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682414148/capstoneproject/controldetail/magnifier_pxs7fn.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"cm-section3\">\r\n");
      out.write("		<div class=\"div1\">\r\n");
      out.write("			<div class=\"img\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682483085/capstoneproject/controldetail/pest/preventfrompest/preventfly_d2xnz5.jpg\">\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"content\">\r\n");
      out.write("				<h1>NGĂN CHẶN</h1>\r\n");
      out.write("				<div class=\"content-detail\">\r\n");
      out.write("					<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682416529/capstoneproject/logo/tinylogo_sq5t6z.jpg\">\r\n");
      out.write("					<div class=\"detail\"><p>Bảo quản nguồn thức ăn chưa sử dụng.</p></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"content-detail\">\r\n");
      out.write("					<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682416529/capstoneproject/logo/tinylogo_sq5t6z.jpg\">\r\n");
      out.write("					<div class=\"detail\"><p>Xử lý rác thải</p></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"content-detail\">\r\n");
      out.write("					<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682416529/capstoneproject/logo/tinylogo_sq5t6z.jpg\">\r\n");
      out.write("					<div class=\"detail\"><p>Kiểm soát tốt các lỗ hỏng và ô cửa mở.</p></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"cm-section4\">\r\n");
      out.write("		<div class=\"s4-div1\">\r\n");
      out.write("			<div class=\"s4-d1-title\"><h2>MỘT SỐ LOÀI ĐỘNG VẬT GÂY HẠI BẠN CẦN KIỂM SOÁT</h2></div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"s4-content\">\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlmouse\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681722144/capstoneproject/pest/chuot_vlvoo2.png\"> </a>\r\n");
      out.write("				<h4>Chuột</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlcockroach\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/gian_jqs058.jpg\"> </a>\r\n");
      out.write("				<h4>Gián</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlant\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/kien_y7jees.jpg\"> </a>\r\n");
      out.write("				<h4>Kiến</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg\"> </a>\r\n");
      out.write("				<h4>Ruồi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlmosquito\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/muoi_jbi12x.png\"> </a>\r\n");
      out.write("				<h4>Muỗi</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlgrasshopper\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731151/capstoneproject/pest/chauchau_jemzxe.jpg\"> </a>\r\n");
      out.write("				<h4>Châu Chấu</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlbee\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg\"> </a>\r\n");
      out.write("				<h4>Ong</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controldragonfly\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731159/capstoneproject/pest/chuonchuon_uy54qe.jpg\"> </a>\r\n");
      out.write("				<h4>Chuồn Chuồn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlcricket\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731363/capstoneproject/pest/de_sygmo7.jpg\"> </a>\r\n");
      out.write("				<h4>Dế</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlspider\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/nhen_eysnxi.jpg\"> </a>\r\n");
      out.write("				<h4>Nhện</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlsnake\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/ran_qj8lp1.jpg\"> </a>\r\n");
      out.write("				<h4>Rắn</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controltermite\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732231/capstoneproject/pest/moi_re4gmk.jpg\"> </a>\r\n");
      out.write("				<h4>Mối</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlwoodborer\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/mot_z6yu8r.png\"> </a>\r\n");
      out.write("				<h4>Mọt</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlbug\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/rep_ycqajr.png\"> </a>\r\n");
      out.write("				<h4>Rẹp</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s4-s4content-pest\">\r\n");
      out.write("				<a href=\"controlflea\"> <img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/bochet_ydbxpn.jpg\"> </a>\r\n");
      out.write("				<h4>Bọ Chét</h4>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<section class=\"cm-section5\">\r\n");
      out.write("		<div class=\"s5-div1\">\r\n");
      out.write("			<div class=\"s5-d1-title\">\r\n");
      out.write("				<h2>BẠN ĐANG ĐAU ĐẦU <br/> VỚI<span> ĐÁM ĐỘNG VẬT GÂY HẠI</span> ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>\r\n");
      out.write("				<a href=\"#\"><input type=\"submit\" value=\"LIÊN HỆ TƯ VẤN\"> </a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"s5-d1-image\">\r\n");
      out.write("				<img src=\"https://res.cloudinary.com/dedbfm0dk/image/upload/v1682221256/capstoneproject/homepage/headache_hyvw65.jpg\">\r\n");
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
