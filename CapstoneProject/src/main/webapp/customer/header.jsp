<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/style-customer-header.css">
<style type="text/css">
 body {
	margin: 0px;
}

.header-section{
	width: 100%;
	height: 96px;
	border: 1px solid lightblue;
	box-shadow: 0 5px 22px lightblue;
	position: fixed;
	z-index: 99;
	top: 0;
	background-color: white;
}

.header-section .col1 {
	width: 24.8%;
	height: 96px;
	float: left;
	text-align: center;
}

.header-section .col2 {
	width: 24.8%;
	height: 96px;
	float: left;
	text-align: center;
}

.header-section .col3 {
	width: 24.8%;
	height: 96px;
	float: left;
	text-align: center;
}

.header-section .col4 {
	width: 24.8%;
	height: 96px;
	float: left;
	text-align: center;
}

.header-section .col1 img {
	width: 65%;
	height: 95px;
}

.header-section .col1 img:hover {
	cursor: pointer;
	
}

.header-section .sec-div .col2 a, .sec-div .col3 a, .sec-div .col4 a {
	display: inline-block;
	margin-top: 25px;
	text-decoration: none;
	font-size: 23px;
	color: black;
	width: 270px;
	height: 35px;
	padding-top: 8px;
}

.header-section .sec-div .col2 a:hover, .sec-div .col3 a:hover {
	background-color: lightblue;
	border-radius: 2px 10em 50%;
	transition: 0.5s;
}

.header-section .sec-div .col4 a {
	background-color: lightblue;
	border-radius: 2px 10em 50%;
}

.header-section .sec-div .col4 a:hover {
	background-color: #528B8B;
	color: white;
	transition: 0.5s;
}
</style>
</head>
<body>
	<header>
		<section class="header-section" id="myHeader">
			<div class="sec-div">
				<div class="col1">
					<a href="homepage"><img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1681460706/capstoneproject/logo/logo_jpthaj.jpg"></a>
				</div>
				<div class="col2">
					<a href="information" >BÁCH KHOA</a>
				</div>
				<div class="col3">
					<a href="control" >KIỂM SOÁT</a>
				</div>
				<div class="col4">
					<a href="schedule" >ĐẶT LỊCH TƯ VẤN</a>
				</div>
			</div>
		</section>
	</header>
</body>
</html>