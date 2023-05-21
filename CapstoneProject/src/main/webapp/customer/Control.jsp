<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/style-customer-control.css">
<style type="text/css">
@charset "UTF-8";


body{
	margin-top: 0px;
	margin: 0px;
}

h1{
	color: #FFF;
	font-size: 50px;
	font-family: inherit;
	margin-left: 55%;
	font-style: oblique;
	font-weight: bold;
}

/* ----- */
.image-title{
	background-image: url("https://res.cloudinary.com/dedbfm0dk/image/upload/v1682334957/capstoneproject/control/imagetitle_a7jmk3.jpg");
	width: 100%;
	height: 650px;
	background-size: 100% 100%;
	background-repeat: no-repeat;
	margin-top: 90px;
	
	padding-top: 0.25px;
	filter:brightness(85%);
} 

.session1{
	margin-top: 60px;
	width: 100%;
	height: 650px;
}
 h2{
	font-size: 30px;
	font-weight: bold;
	line-height: 50px;	
}
.s1-d1-img img{
	width: 520px;
	height: 590px;
	margin-right: 100px;
}
.s1-d1-title h2 span{
	color: #528B8B;
}
.s1-d1-img {
	float: right;
	width: auto;
	margin-right: 60px;
}

.s1-d1-title{
	float: left;
	width: 600px;
	margin-left: 120px;
}

.session1-text{
	margin-top: 40px;
	line-height: 30px;
	font-size: 20px;
	line-height: 40px;
}

/* .s1-div1{
	clear: both;
} */

.session2{
	margin-top: 60px;
	background-color: #99CCCC;
	width: 100%;
	height: 1100px;
	padding-top: 10px;
}

.s2-d1-title h2{
	margin-left: 20%;
}

.s2-content {
	padding-top: 40px;
	padding-left: 60px;
}

.s2-content a img{
	width: 200px;
	height: 200px;
	
	border: 2px solid;
	
	border-radius: 100px;
	box-sizing: border-box;
}

.s2-content a img:hover {
	cursor: pointer;
	border: 10px solid #5F9EA0;
	transition:0.3s ease-in-out;
}

.s2-s2content-pest{
	float: left;
	margin-right: 80px;
	margin-top: 40px;
}

.s2-s2content-pest h4{
	margin-top: 10px;
	margin-left: 70px;
	
}

.section3{
	width: 100%;
	height: 620px;
	margin-top: 80px;
}

.s3-d1-image img{
	width: 660px;
	height: 600px;
}

.s3-d1-title{
	float: left;
	margin-left: 180px;
}

.s3-d1-title h2 span{
	color: #528B8B;
}

.s3-d1-title input{
	width: 200px;
	height: 40px;
	border-radius: 10px;
	background-color: #528B8B;
	color: white;
	border: 1px solid #333366;
	cursor: pointer;
}

.s3-d1-title input:hover {
	font-size: 17px;
} 

</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="image-title">
		<h1>KIỂM SOÁT ĐỘNG VẬT</h1>
	</div>
	
	<section class="session1">
		<div class="s1-div1">
			<div class="s1-d1-title">
				<h2><span>CÓ KIẾN THỨC</span><br/> VỀ PHƯƠNG THỨC KIỂM SOÁT <br/> GIÚP NHÀ BẠN VẮNG BÓNG KẺ ĐỊCH</h2>
				<div class="session1-text">
					Việc sử dụng hóa chất không có kế hoạch giúp côn trùng gia tăng khả năng miễn dịch và tiếp tục sinh sôi mạnh mẽ hơn. 
					Hiểu được điều đó, công ty luôn dựa trên các nguyên lý khoa học, sinh học để xây dựng ra những giải pháp có tính bền vững, 
					lâu dài nhằm kiểm soát côn trùng dịch hại tối ưu.
				</div>
			</div>
			<div class="s1-d1-img">
				<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1682335711/capstoneproject/control/control_vqeq5v.png">
			</div>
		</div>
	</section>
	
	<section class="session2">
		<div class="s2-div1">
			<div class="s2-d1-title"><h2>MỘT SỐ LOÀI ĐỘNG VẬT GÂY HẠI BẠN CẦN KIỂM SOÁT</h2></div>
		</div>
		<div class="s2-content">
			<div class="s2-s2content-pest">
				<a href="controlmouse"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681722144/capstoneproject/pest/chuot_vlvoo2.png"> </a>
				<h4>Chuột</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlcockroach"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/gian_jqs058.jpg"> </a>
				<h4>Gián</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlant"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/kien_y7jees.jpg"> </a>
				<h4>Kiến</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlfly"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg"> </a>
				<h4>Ruồi</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlmosquito"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/muoi_jbi12x.png"> </a>
				<h4>Muỗi</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlgrasshopper"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731151/capstoneproject/pest/chauchau_jemzxe.jpg"> </a>
				<h4>Châu Chấu</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlbee"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg"> </a>
				<h4>Ong</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controldragonfly"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731159/capstoneproject/pest/chuonchuon_uy54qe.jpg"> </a>
				<h4>Chuồn Chuồn</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlcricket"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731363/capstoneproject/pest/de_sygmo7.jpg"> </a>
				<h4>Dế</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlspider"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/nhen_eysnxi.jpg"> </a>
				<h4>Nhện</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlsnake"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/ran_qj8lp1.jpg"> </a>
				<h4>Rắn</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controltermite"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732231/capstoneproject/pest/moi_re4gmk.jpg"> </a>
				<h4>Mối</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlwoodborer"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/mot_z6yu8r.png"> </a>
				<h4>Mọt</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlbug"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/rep_ycqajr.png"> </a>
				<h4>Rẹp</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="controlflea"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/bochet_ydbxpn.jpg"> </a>
				<h4>Bọ Chét</h4>
			</div>
			
			
		</div>
	</section>
	
	<section class="section3">
		<div class="s3-div1">
			<div class="s3-d1-title">
				<h2><span>BẠN CẦN XỬ LÝ </span><br/>ĐÁM ĐỘNG VẬT GÂY HẠI ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>
				<a href="schedule"><input type="submit" value="LIÊN HỆ TƯ VẤN"> </a>
			</div>
			<div class="s3-d1-image">
				<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681718962/capstoneproject/information/pest-control_qthlxe.jpg">
			</div>
		</div>
	</section>
	
	<jsp:include page="footer.jsp" />
</body>
</html>