<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Cage Management page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href='<c:url value="resources/css/style-page-admin.css" />'
	rel="stylesheet" type="text/css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<script type="text/javascript">
	function confirm_decision(user_id) {
		if (confirm("you want to delete?")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page
		{
			window.location = "contractremove?id=" + user_id;
		} else {
			return false;
		}
		return true;
	}
</script>
<style type="text/css">
.home .nvtbp form select{
	padding-top: 7px;
	padding-bottom: 7px;
	width: 20%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

.banner{
	margin-top: 100px;
	margin-left: -19%;
}

.table-wrapper{
	margin-left: -19%;
	
}

.login-container{
	float: right;	
	text-decoration: none;
	color: black;
	border: 1px solid #528B8B;
	width: 100px;
	height: 35px;	
	text-align: center;
	display: inline-block;
    line-height:25px;
    border-radius: 20px;
    background-color: #AFEEEE; 
    
    margin-top: 0px;
    margin-right: 5%;
}

 button:hover{
	cursor:pointer;
	width: 100px;
	transition: 0.5s;
}
</style>

</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<section class="home">
		
		<h2 class="banner ">Tiến Trình Xử Lý</h2>
		<div class="table-wrapper">

			<form:form action="">
				<table class="fl-table">
					<thead>
						<tr>
							<th>ID</th>
							<th>Giai Đoạn</th>
							<th>Ngày Bắt Đầu</th>
							<th>Ngày Kết Thúc</th>
							<th>Chi Phí</th>
							<th>Trạng Thái</th>
						</tr>
					</thead>
					<tbody>

					<c:forEach items="${processList}" var="processlist">
						<tr>
								<td>${processlist.id}</td>
								
								<td>${processlist.detail}</td>
								
								<td>${processlist.startDate}</td>
								
								<td>${processlist.endDate}</td>
								
								<%-- <c:forEach items="${costList}" var="costlist">
									<td>${costlist.cost}</td>
								</c:forEach> --%>
								
								<td>${processlist.cost }</td>
								
								<c:forEach items="${stateList}" var="statelist">
								<c:if test="${processlist.idState == statelist.id}">

									<td>${statelist.detail}</td>
								</c:if>
							</c:forEach>
								
							
								
							</tr>
						</c:forEach>
				<tbody>
				</table>

			</form:form>
			<br>

		</div>

		<div class="table-wrapper" style="position: relative; width: 115%; z-index: 1; overflow: auto; height: 200px;">
			<form:form modelAttribute="step" action="stepaddnewstep"
				id="billCreateForm2">
				<table class="fl-table" style="width: 100%; margin: auto; border-collapse: separate; border-spacing: 0;">
				<thead style="position: -webkit-sticky; position: sticky; top: 0;">
						<tr>
							<th>ID</th>
							<th>Bước</th>
							<th>Chi Tiết</th>
							<th>Sản phẩm</th>
							<th>Số Lượng</th>
							<th>Thành Giá</th>
							<th>Chi Phí Công Đoạn</th>
							<th>Trạng Thái</th>
						</tr>
					</thead>
					<tbody>
						
						<c:forEach items="${stepList}" var="steplist">
						<%! int count = 1; %>
							<tr>
								<td>${steplist.id}</td>
								
								<td><%=count %></td>
								<% count++; %>
								
								<td>${steplist.detail}</td>
								
								<c:forEach items="${productList}" var="productlist">
									<c:if test="${steplist.idProduct == productlist.id}">
										<td>${productlist.productName}</td>
									</c:if>
								</c:forEach>
								
								<c:forEach items="${stepProductQuantityList}" var="stepproductquantitylist">
									<c:if test="${steplist.id == stepproductquantitylist.idStep}">
										<td>${stepproductquantitylist.quantity}</td>
									</c:if>
								</c:forEach>
								
								<c:forEach items="${stepProductQuantityList}" var="stepproductquantitylist">
									<c:if test="${steplist.id == stepproductquantitylist.idStep}">
										<td>${stepproductquantitylist.cost}</td>
									</c:if>
								</c:forEach>
								
								<td>${steplist.cost}</td>
								
								<c:forEach items="${stateList}" var="statelist">
									<c:if test="${steplist.idState == statelist.id}">
										<td>${statelist.detail}</td>
									</c:if>
								</c:forEach>
								
								
							</tr>
						</c:forEach>
						
						
					<tbody>
				</table>
				<br>
			</form:form>
		</div>
		<button class="login-container" onclick="back()">Quay lại</button>
	</section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
<script type="text/javascript">
function setInitialCount() {
	<%count=1;%>
}

function back() {

	window.history.back();

	}
</script>
</html>