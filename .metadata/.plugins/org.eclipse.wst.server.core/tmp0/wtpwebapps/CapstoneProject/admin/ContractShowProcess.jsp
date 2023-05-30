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

<style type="text/css">
#billCreateForm2 td input {
	width: 30%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

#billCreateForm2 td select {
	padding-top: 7px;
	padding-bottom: 7px;
	width: 80%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

</style>
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<section class="home">
		<div class="text">Process Page</div>
		<h2 class="banner ">Detail Process</h2>
		<div class="table-wrapper">

			<form:form modelAttribute="bill" id="billCreateForm" action="">
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
						<!-- <th>Action</th> -->
					</tr>
					</thead>
					<tbody>

					<c:forEach items="${contractList}" var="contractlist">

						<tr>

							<td>${contractlist.id}</td>
							<td>${contractlist.detail}</td>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">

									<td>${customerlist.customerName}</td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">

									<td>${customerlist.phone}</td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">

									<td>${customerlist.address}</td>
								</c:if>
							</c:forEach>
							
							<c:forEach items="${customerList}" var="customerlist">
								<c:if test="${contractlist.idCustomer == customerlist.id}">

									<td>${customerlist.email}</td>
								</c:if>
							</c:forEach>
							
							<td>${contractlist.signingDate}</td>
							<td>${contractlist.price}</td>
							<c:forEach items="${staffList}" var="stafflist">
								<c:if test="${contractlist.idStaff == stafflist.id}">

									<td>${stafflist.staffName}</td>
								</c:if>
							</c:forEach>


							<%-- <td>
							<a class="bx bxs-detail bx-xs"
							style="text-decoration: none; color: green"
							href="processshow?id=${contractlist.id}"></a>
							
							<a class="bx bxs-edit bx-xs"
							style="text-decoration: none; color: green"
							href="staffupdateform?id=${contractlist.id}"></a> <a
								class="bx bxs-trash bx-xs"
								style="text-decoration: none; color: red"
								href="staffdelete?id=${stafflist.idStaff}" onclick="confirm_decision('${contractlist.id}')"></a></td> --%>
						</tr>
					</c:forEach>
				<tbody>
				</table>

			</form:form>
			<br>

		</div>

		<div class="table-wrapper">
			<!-- action="processbillcreate -->
			<form:form modelAttribute="process" action="showprocess"
				id="billCreateForm2">
				<table class="fl-table">
					<thead>
						<tr>
							<th>STT</th>
							<th>Chi Tiết</th>
							<th>Ngày Bắt Đầu</th>
							<th>Ngày Kết Thúc</th>
						</tr>
					</thead>
					<tbody>
						<%! static int count = 1; %>
						<c:forEach items="${processList}" var="processlist">
							<tr>
								<%-- <c:forEach items="${productList}" var="productlist">
									<c:if test="${billdetaillist.idProduct==productlist.id}">
										<td>${productlist.productName}</td>
									</c:if>
								</c:forEach> --%>
								<td><%=count %></td>
								<% count++; %>
								
								<td>${processlist.detail}</td>
								
								<td>${processlist.startDate}</td>
								
								<td>${processlist.endDate}</td>
							</tr>
						</c:forEach>
						<%-- <tr>
							<td><form:select path="idProduct" name="productClicked">
									<c:forEach items="${productList}" var="productlist">
										<option value="${productlist.id}">${productlist.productName}</option>
									</c:forEach>
								</form:select>
							</td>
							<td><form:input path="price" placeholder="0" style="border: 1px solid; border-radius: 10px"/></td>
							
							<td><form:input path="quantity" placeholder="0" style="border: 1px solid; border-radius: 10px"/></td>
						</tr> --%>
					<tbody>
				</table>
				<br>
				<a href="contract" class="button-search" style="text-decoration: none; padding: 11px 18px 11px 18px;">Quay Lại</a>
				
			</form:form>
		</div>
	</section>

</body>

<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>