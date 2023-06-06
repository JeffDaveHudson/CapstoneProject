<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	margin: 0;
}

.schedule-section1{
	margin-top: 100px;
	width: 100%;
	height: 640px;
	position: relative;
}

.schedule-section1 .div1{
	width: 100%;
	height: 200px;
	top: 50%;
	position: absolute;
	transform: translateY(-50%);
	
	border-top-left-radius: 30%;
	border-bottom-right-radius: 30%;
	background-color: lightblue;
}

.schedule-section1 .img{
	width: auto;
	height: auto;
	float: left;
	margin-left: 8%;
	top: 50%;
	position: absolute;
	transform: translateY(-50%);
}

.schedule-section1 .form{
	width: 45%;
	height: 500px;
	/* float: right;
	margin-right: 5%; */
	margin-left:48%;
	top: 50%;
	position: absolute;
	transform: translateY(-55%);
}

.schedule-section1 .img img {
	width: :505px;
	height: 405px;
}

/* .schedule-section1 .form input:last-child{
	transition: 0.5s;
} */

.schedule-section1 .form .button input{
	margin-top: 50px;
	width: 120px;
	height: 50px;
	color: black;
	border: none;
	box-sizing: border-box;
	
	background: #ecf0f3;
	border-radius: 50px;
  	box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;

	background-color: lightblue;
	border: 1px solid lightblue;
}

.schedule-section1 .form .button input:hover{
	font-size: 20px;
	background-color: red;
	transition: 0.5s;
	cursor: pointer;
	background-color: #528B8B;
	color: white;
}


.schedule-section1 .form .text input{
	margin-top: 110px;
	width: 400px;
	height: 50px;
	color: black;
	border: /* 1px solid #003366 */ none;
	padding-left: 30px;
	box-sizing: border-box;
	
	/* box-shadow: 7px 7px 3px 1px lightblue;
	border-radius: 20px;
	 */
	background: #ecf0f3;
	border-radius: 50px;
  	box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;
}

.schedule-section1 .form input:focus {
	border: 1px solid #0af; 
	outline: none; 
	-moz-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);
	-webkit-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);
	box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);  */
}

.schedule-section1 .form{
	text-align: center;
}

.schedule-section1 .title h1{
	font-size: 30px;
	color: #528B8B;
	text-align: center;
	font-style: italic;
}

.schedule-section1 .title {
	margin-top: 150px;
	
}
</style>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<section class="schedule-section1">
	<div class="title"><h1>Bạn Cần Tra Thông Tin</h1> </div>
	<div class="div1">
		<div class="img">
			<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1685936172/capstoneproject/process/search_srbdum.jpg">
		</div>
		<div class="form">
			<form action="customercontract" method="post">
				<div class="text"><input type="text" name="phone" placeholder="Nhập SĐT..." /></div>
				<div class="button"><input type="submit" value="Tìm Kiếm"/></div>
			</form>
		</div>
	</div>
</section>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>