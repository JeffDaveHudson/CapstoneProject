<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0px;
}

.login-container{
	width: 100%;
	height: 100vh;
}

.login-container .img{
	width: 54%;
	height: 100%;
	float: left;
}

.login-container .img .img-detail{
	width: 35%;
	height: 300px;
	top: 50%;
	position: absolute;
	transform: translateY(-50%);
	margin-left: 10%;
}

.login-container .img .img-detail img{
	width: 100%;
	height: 300px;
}

.login-container .img .c1{
	width: 90%;
	height: 100%;
	border-top-right-radius: 100%; 
	border-bottom-right-radius: 100%; 
	
	background-color: #AFEEEE;
}

.login-container .img .c2{
	width: 80%;
	height: 100%;
	border-top-right-radius: 100%; 
	border-bottom-right-radius: 100%; 
	
	background-color: #99CCFF;
}

.login-container .img .c3{
	width: 80%;
	height: 100%;
	border-top-right-radius: 100%; 
	border-bottom-right-radius: 100%; 
	
	background-color: #7AC5CD;
}

.login-container .form{
	width: 44%;
	height: 100%;
	float: right;
}

.login-container .form{
	width: 45%;
	height: 500px;
	/* float: right;
	margin-right: 5%; */
	margin-left:48%;
	top: 50%;
	position: absolute;
	transform: translateY(-45%);
}

.login-container .form .button input{
	margin-top: 50px;
	width: 400px;
	height: 50px;
	color: black;
	border: none;
	box-sizing: border-box;
	
	background: #ecf0f3;
	border-radius: 50px;
  	box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px white;

	background-color: lightblue;
	border: 1px solid lightblue;
	
	
	font-weight: bold;
}

.login-container .form .button input:hover{
	font-size: 20px;
	background-color: red;
	transition: 0.5s;
	cursor: pointer;
	background-color: #528B8B;
	color: white;
}


.login-container .form .text input{
	margin-top: 50px;
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


.login-container .form input:focus {
	border: 1px solid #0af; 
	outline: none; 
	-moz-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);
	-webkit-box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);
	box-shadow: 0px 0px 15px rgba(0, 170, 255,.5);  
	
	
}

.login-container .form{
	text-align: center;
	
	
}

.login-container .form h1{
	font-size: 30px;
	color: #528B8B;
	text-align: center;
	font-style: italic;
}

.login-container button{
	float: right;	
	text-decoration: none;
	color: black;
	border: 1px solid #528B8B;
	width: 80px;
	height: 25px;	
	text-align: center;
	display: inline-block;
    line-height:25px;
    border-radius: 20px;
    background-color: #AFEEEE; 
    
    margin-top: 50px;
    margin-right: 5%;
}

.login-container button:hover{
	cursor:pointer;
	width: 100px;
	transition: 0.5s;
}

</style>
</head>
<body>
	<div class="login-container">
		<div class="img">
			<div class="c1">
				<div class="c2">
					<div class="c3">
					</div>
				</div>
			</div>
			<div class="img-detail">
				<img src="https://res.cloudinary.com/dedbfm0dk/image/upload/v1682588106/capstoneproject/login/admin2_xzqu0z.png">
			</div>	
		</div>
		<div class="form">
		<form:form action="login" modelAttribute="account" method="post">
			<h1>ADMINISTRATION</h1>
				
				<div class="text">
				<form:input type="text" path="userName" placeholder="Username"/></div>
				<div class="text">
				<form:input type="text" path="pass" placeholder="Password"/></div>
				<div class="button"><input type="submit" value="Đăng Nhập"></div>
		</form:form>
		</div>
		<button onclick="back()">Quay lại</button>
	</div>
</body>

<script type="text/javascript">
function back() {

	window.history.back();

	}
</script>
</html>