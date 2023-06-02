<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Cage Management page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href='<c:url value="/resources/css/style-page-admin.css" />'
	rel="stylesheet" type="text/css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<style type="text/css">
.home table tbody input{
	width: 70%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

.home table tbody select{
	padding-top: 7px;
	padding-bottom: 7px;
	width: 50%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}
</style>
</head>
<body>

	<jsp:include page="navbar.jsp"/>

	<section class="home">
		<div class="text">Trang Thêm Hợp Đồng</div>
		<h2 class="banner ">Tạo Hợp Đồng</h2>
		<form:form modelAttribute="contract" class="searchform" action="contractcreatewithexistedcustomer" method="post">
			
			<button style="" class="button-search">Thêm Mới</button>
			<br><br>
			<div class="table-wrapper" style="height: 15vh; overflow: auto">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Tên Hợp Đồng</th>
							<th>Ngày Ký</th>
							<th>Số Tiền</th>
							<th>Nhân Viên Đại Diện Phụ Trách</th>
						</tr>
						
					</thead>
					<tbody>
						<tr>
							<td><form:input type="text" path="detail"/></td>
																					
							<td><form:input type="date" path="signingDate"/></td>
							
							<td><form:input type="text" path="price"/></td>
							
							<td><form:select path="idStaff">
									<c:forEach items="${staffList}" var="stafflist">
										<c:if test="${stafflist.idStaffType==1 }">
											<option value="${stafflist.id}">${stafflist.staffName}</option>
										</c:if>
									</c:forEach>
								</form:select>
							</td>
						</tr>
					<tbody>
				</table>
			</div>
			<div class="table-wrapper" style="height: 15vh; overflow: auto">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Khách Hàng</th>
							<th>SĐT</th>
							<th>Địa Chỉ</th>
							<th>Email</th>
						</tr>
						
					</thead>
					<tbody>
						<c:forEach items="${customerList}" var="customerlist">
						<tr>
							<td>${customerlist.customerName}</td>
							<td>${customerlist.phone}</td>
							<td>${customerlist.address}</td>
							<td>${customerlist.email}</td>
						</tr>
					</c:forEach>
					<tbody>
				</table>
			</div>
		</form:form>


	</section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>