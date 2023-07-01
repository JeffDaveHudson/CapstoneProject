<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventory Management page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href='<c:url value="/resources/css/style-page-admin.css" />'
	rel="stylesheet" type="text/css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<style type="text/css">
#form2 {
	text-align: center;
	margin-top: 20px;
}

.wrapper-div1 {
	width: 100%;
	height: 200px;
}

.div1 {
	/* border: 1px solid red; */
	width: 97%;
	height: 150px;
}

.div1 .div1-1 {
	border: 1px solid #B0E0E6;
	width: 22%;
	height: 100px;
	border-radius: 18px;
	float: left;
	margin-left: 35px;
	margin-top: 25px;
}

.div1 .div1-1 .quarter {
	margin-top: 10px;
	margin-left: 20px;
	font-family: cursive;
	font-size: 15px;
}

.div1 .div1-1 .value {
	text-align:center;
	font-family: fantasy;
	font-size: 30px;
	color: #6600FF;
}

.div1 .div1-1 .notice {
	margin-left: 20px;
	font-family: cursive;
	font-size: 10px;
}


.wrapper-div2 {
	width: 50%;
	height: 180px;
	float: left;
}

.div2 {
	width: 100%;
	height: 150px;
}

.div2 .div2-2 {
	border: 1px solid #B0E0E6;
	width: 88%;
	height: 120px;
	border-radius: 18px;
	float: left;
	margin-left: 35px;
	margin-top: 25px;
}

.div2 .div2-2 .quarter {
	margin-top: 10px;
	margin-left: 20px;
	font-family: cursive;
	font-size: 15px;
}

.div2 .div2-2 .value {
	text-align:center;
	font-family: fantasy;
	font-size: 30px;
	color: #6600FF;
	margin-top: 10px;
}

.div2 .div2-2 .notice {
	margin-left: 20px;
	font-family: cursive;
	font-size: 12px;
}


.wrapper-div23{
	width: 100%;
	height: 200px;
}

.wrapper-div3 {
	width: 50%;
	height: 200px;
	float: left;
	/* margin-left: 18%; */
}

.div3 {
	width: 100%;
	height: 150px;
}

.div3 .div3-3 {
	border: 1px solid #B0E0E6;
	width: 84%;
	height: 120px;
	border-radius: 18px;
	float: left;
	margin-left: 35px;
	margin-top: 25px;
}

.div3 .div3-3 .quarter {
	margin-top: 10px;
	margin-left: 20px;
	font-family: cursive;
	font-size: 15px;
}

.div3 .div3-3 .value {
	text-align:center;
	font-family: fantasy;
	font-size: 30px;
	color: #6600FF;
	margin-top: 10px;
}

.div3 .div3-3 .notice {
	margin-left: 20px;
	font-family: cursive;
	font-size: 12px;
}

.wrapper-div3 input{
	width: 26%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 6px;
	margin: 0 10px;
}

</style>


</head>
<body>
	<jsp:include page="navbar.jsp" />

	<section class="home">
		<div class="text">Doanh Thu</div>
		<h2 class="banner " style="margin-top: -70px">Quản Lý Doanh Thu</h2>
		<br>
		<div class="banner"></div>
		<%
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now).toString();
		%>

		<div class="wrapper-div23">
		
			<div class="wrapper-div2">
				Doanh thu theo tháng hiện tại
				<%-- <%=date%>: ${revenueByMonth } --%>
				<div class="div2">
					<a href="revenuedetailbycurrentmonth">
					<div class="div2-2" style="background-color: #BBFFFF">
						<div class="quarter">
							Tháng
							<%=date%></div>
						<div class="notice">(Từ đầu tháng đến hiện tại)</div>
						<div class="value">${revenueByMonth }</div>
					</div></a>
				</div>
			</div>
			
			<div class="wrapper-div3">
				<form action="revenuebetween2times">
					Doanh thu từ <input type="date" name="startDate"
						value="${startDate }"> đến <input type="date"
						name="endDate" value="${endDate }" onchange="this.form.submit()">
					<div class="div3">
						<a href="revenuedetailbetween2times">
						<div class="div3-3" style="background-color: #97FFFF">
							<div class="quarter">Tổng Doanh Thu</div>
							<div class="value">${revenueBetween2Times}</div>
						</div></a>

					</div>
				</form>
			</div>
		</div>
		
		<br><br><br>
		
		<div class="wrapper-div1">
			 Doanh thu theo quý: <br>
		<div class="div1">
		<a href="revenuedetailbyquarter1">
			<div class="div1-1" style="background-color: #CAE1FF">
				<div class="quarter">Quý 1</div>
				<div class="value">${quarter1 }</div>
			</div></a>
			<a href="revenuedetailbyquarter2">
			<div class="div1-1" style="background-color: #B0E2FF">
				<div class="quarter">Quý 2</div>
				<div class="value">${quarter2 }</div>
			</div></a>
			<a href="revenuedetailbyquarter3">
			<div class="div1-1" style="background-color: #87CEEB">
				<div class="quarter">Quý 3</div>
				<div class="value">${quarter3 }</div>
			</div></a>
			<a href="revenuedetailbyquarter4">
			<div class="div1-1" style="background-color: #5CACEE">
				<div class="quarter">Quý 4</div>
				<div class="value">${quarter4 }</div>
			</div></a>
		</div>
		</div>

		
		<%-- <form action="revenuebetween2times">
			Doanh thu từ <input type="date" name="startDate"
				value="${startDate }"> đến <input type="date" name="endDate"
				value="${endDate }" onchange="this.form.submit()"> là:
			${revenueBetween2Times}
		</form> --%>

	</section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>