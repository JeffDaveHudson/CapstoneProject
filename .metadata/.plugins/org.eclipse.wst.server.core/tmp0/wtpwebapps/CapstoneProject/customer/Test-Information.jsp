<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" type="text/css"
	href="resources/css/style-page-customer.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/style-page-customer-main.css">
<link rel="stylesheet" type="text/css"
	href="resources/css/style-page-information.css">
	
<style>
html,body,h1,h2,h3,h4 {margin-top:70px;"Lato", sans-serif}
.mySlides {display:none}
.w3-tag, .fa {cursor:pointer}
.w3-tag {height:15px;width:15px;padding:0;margin-top:6px}
.w3-top{
	box-shadow: 0 8px 7px lightgrey;
	
}

h1{
	color: #FFF;
	font-size: 50px;
	font-family: inherit;
	margin-left: 55%;
	font-style: oblique;
	font-weight: bold;
}

#menu{
	margin-top: 25px;
}

#img-logo{
	background-color: white;
}


/* ----- */
.image-title{
	background-image: url("https://res.cloudinary.com/dedbfm0dk/image/upload/v1681705585/capstoneproject/information/chuot_qgzekp.png");
	width: 100%;
	height: 650px;
	background-size: 100% 100%;
	background-repeat: no-repeat;
	margin-top: -50px;
	
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
	width: 660px;
	height: 600px;
	margin-right: 100px;
}
.s1-d1-title h2 span{
	color: #528B8B;
}
.s1-d1-img {
	float: right;
	width: auto;
}

.s1-d1-title{
	float: left;
	width: 600px;
	margin-left: 80px;
}

.session1-text{
	margin-top: 40px;
	line-height: 30px;
	font-size: 16px;
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

.s3-d1-image{
	
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
	<div class="w3-top">
		<div class="w3-row w3-large w3-light-grey"
			style="background-color: white">
			<div class="w3-col s3" id="img-logo">
				<a href="#" class="w3-button w3-block"><img
					src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681460706/capstoneproject/logo/logo_jpthaj.jpg"
					height="80v" width="50%"></a>
			</div>
			<div class="w3-col s3">
				<a href="#plans" id="menu" class="w3-button w3-block"
					style="background-color: white">Bách Khoa</a>
			</div>
			<div class="w3-col s3">
				<a href="#about" id="menu" class="w3-button w3-block"
					style="background-color: white">Kiểm Soát</a>
			</div>
			<div class="w3-col s3">
				<a href="#contact" id="menu" class="w3-button w3-block"
					style="background-color: lightblue; border-radius: 2px 10em 50%">Đặt
					Lịch Tư Vấn</a>
			</div>
		</div>
	</div>
	
	<div class="image-title">
		<h1>BÁCH KHOA ĐỘNG VẬT</h1>
	</div>
	
	<section class="session1">
		<div class="s1-div1">
			<div class="s1-d1-title">
				<h2><span>SỰ AM HIỂU VỀ ĐỘNG VẬT GÂY HẠI</span><br/> LÀ NỀN TẢNG VỮNG CHẮC <br/> CHO CÁC GIẢI PHÁP HIỆU QUẢ</h2>
				<div class="session1-text">
					Việc sử dụng hóa chất không có kế hoạch giúp côn trùng gia tăng khả năng miễn dịch và tiếp tục sinh sôi mạnh mẽ hơn. 
					Hiểu được điều đó, công ty luôn dựa trên các nguyên lý khoa học, sinh học để xây dựng ra những giải pháp có tính bền vững, 
					lâu dài nhằm kiểm soát côn trùng dịch hại tối ưu.
				</div>
			</div>
			<div class="s1-d1-img">
				<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681789736/capstoneproject/information/learning_xojeve.png">
			</div>
		</div>
	</section>
	
	<section class="session2">
		<div class="s2-div1">
			<div class="s2-d1-title"><h2>NHỮNG LOÀI ĐỘNG VẬT GÂY HẠI THƯỜNG GẶP TẠI VIỆT NAM</h2></div>
		</div>
		<div class="s2-content">
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681722144/capstoneproject/pest/chuot_vlvoo2.png"> </a>
				<h4>Chuột</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/gian_jqs058.jpg"> </a>
				<h4>Gián</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/kien_y7jees.jpg"> </a>
				<h4>Kiến</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/ruoi_d3osqo.jpg"> </a>
				<h4>Ruồi</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/muoi_jbi12x.png"> </a>
				<h4>Muỗi</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731151/capstoneproject/pest/chauchau_jemzxe.jpg"> </a>
				<h4>Châu Chấu</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731150/capstoneproject/pest/ong_v9nq93.jpg"> </a>
				<h4>Ong</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731159/capstoneproject/pest/chuonchuon_uy54qe.jpg"> </a>
				<h4>Chuồn Chuồn</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681731363/capstoneproject/pest/de_sygmo7.jpg"> </a>
				<h4>Dế</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681730552/capstoneproject/pest/nhen_eysnxi.jpg"> </a>
				<h4>Nhện</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/ran_qj8lp1.jpg"> </a>
				<h4>Rắn</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732231/capstoneproject/pest/moi_re4gmk.jpg"> </a>
				<h4>Mối</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/mot_z6yu8r.png"> </a>
				<h4>Mọt</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/rep_ycqajr.png"> </a>
				<h4>Rẹp</h4>
			</div>
			<div class="s2-s2content-pest">
				<a href="#"> <img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681732232/capstoneproject/pest/bochet_ydbxpn.jpg"> </a>
				<h4>Bọ Chét</h4>
			</div>
			
			
		</div>
	</section>
	
	<section class="section3">
		<div class="s3-div1">
			<div class="s3-d1-title">
				<h2><span>BẠN CẦN XỬ LÝ </span><br/>ĐÁM ĐỘNG VẬT GÂY HẠI ĐÓ?<br/> HÃY LIÊN HỆ CHÚNG TÔI</h2>
				<a href="#"><input type="submit" value="LIÊN HỆ TƯ VẤN"> </a>
			</div>
			<div class="s3-d1-image">
				<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681718962/capstoneproject/information/pest-control_qthlxe.jpg">
			</div>
		</div>
	</section>
	
	<jsp:include page="footer.jsp" />
</body>
<!-- <footer class="w3-container w3-padding-32 w3-light-grey w3-center">
  <h4>Footer</h4>
  <a href="#" class="w3-button w3-black w3-margin"><i class="fa fa-arrow-up w3-margin-right"></i>To the top</a>
  <div class="w3-xlarge w3-section">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" title="W3.CSS" target="_blank" class="w3-hover-text-green">w3.css</a></p>
</footer>
 -->
</html>