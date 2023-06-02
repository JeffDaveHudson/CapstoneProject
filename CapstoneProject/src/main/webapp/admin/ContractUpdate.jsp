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
	width: 80%;
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
		<div class="text">Contract Updating Page</div>
		<h2 class="banner ">Contract Updating</h2>
		<form:form modelAttribute="contractupdate" class="searchform" action="processupdatecontract" method="post">
			
			<button style="" class="button-search">Cập Nhật</button>

			<div class="table-wrapper" style="height: 50vh; overflow: auto">
				<table class="fl-table">
					<thead>
						<tr>
						<th>Mã Hợp Đồng</th>
						<th>Tên Hợp Đồng</th>
						<th>Khách Hàng</th>
						<th>SĐT</th>
						<th>Địa Chỉ</th>
						<th>Email</th>
						<th>Ngày Ký</th>
						<th>Số Tiền</th>
						<th>Nhân Viên Đại Diện Phụ Trách</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${contractList}" var="contractlist">

						<tr>

							<td><form:input type="text" path="id" value = "${contractlist.id}" readonly="true"/></td>
							<td><form:input type="text" path="detail" value = "${contractlist.detail}"/></td>
														
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">
									<td><input type="text" name="customerName" value = "${customerlist.customerName}"/></td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">
									<td><input type="text" name="phone" value = "${customerlist.phone}"/></td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">
									<td><input type="text" name="address" value = "${customerlist.address}"/></td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">
									<td><input type="text" name="email" value = "${customerlist.email}"/></td>
								</c:if>
							</c:forEach>
							
							<td><form:input type="date" path="signingDate" value = "${contractlist.signingDate}"/></td>
							
							<td><form:input type="text" path="price" value = "${contractlist.price}"/></td>
							
							<%-- <c:forEach items="${staffList}" var="stafflist">
								<c:if test="${contractlist.idStaff == stafflist.id}">
									<td>${stafflist.staffName}</td>
								</c:if>
							</c:forEach> --%>
							
							<td><form:select path="idStaff">
									<c:forEach items="${staffList}" var="stafflist">
										<c:if test="${stafflist.idStaffType==1 }">
											<option value="${stafflist.id}">${stafflist.staffName}</option>
										</c:if>
									</c:forEach>
								</form:select>
							</td>
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