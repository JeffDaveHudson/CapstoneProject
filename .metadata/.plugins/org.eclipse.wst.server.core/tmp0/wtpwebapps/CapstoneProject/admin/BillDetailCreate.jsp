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
		<div class="text">Hóa Đơn</div>
		<h2 class="banner ">Tạo Mới Hóa Đơn</h2>
		<div class="table-wrapper">

			<form:form modelAttribute="bill" id="billCreateForm" action="">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Tên hóa đơn</th>
							<th>Nhà cung cấp</th>
							<th>Nhân viên</th>
							<th>Ngày</th>
							<th>Tổng</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${lastestBill }" var="lastestBill">
						<tr>
							<%-- <td><input type="text" value="${lastestBill.billName}" readonly>
							</td> --%>
							<td>${lastestBill.billName}</td>

							<c:forEach items="${supplierList}" var="supplierlist">
								<c:if test="${supplierlist.id==lastestBill.idSupplier }">
									<%-- <td><input type="text"
										value="${supplierlist.supplierName}" readonly></td> --%>
									<td>${supplierlist.supplierName}</td>
								</c:if>
							</c:forEach>

							<c:forEach items="${staffList}" var="stafflist">
								<c:if test="${stafflist.id==lastestBill.idStaff }">
									<%-- <td><input type="text" value="${stafflist.staffName}"
										readonly></td> --%>
									<td>${stafflist.staffName}</td>
								</c:if>
							</c:forEach>

							<%-- <td><input type="text" value="${lastestBill.dateTransfer}" readonly>
							</td> --%>
							<td>${lastestBill.dateTransfer}</td>
							
							<td>${total}</td>
						</tr>
						</c:forEach>
					<tbody>
				</table>

			</form:form>
			<br>

		</div>

		<div class="table-wrapper">
			<form:form modelAttribute="billDetail" action="processbillcreate"
				id="billCreateForm2">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Đơn giá</th>
							<th>Số Lượng</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${billDetailListWhenCreating}" var="billdetaillist">
							<tr>
								<c:forEach items="${productList}" var="productlist">
									<c:if test="${billdetaillist.idProduct==productlist.id}">
										<td>${productlist.productName}</td>
									</c:if>
								</c:forEach>
								
								<td>${billdetaillist.price}</td>
								
								<td>${billdetaillist.quantity}</td>
							</tr>
						</c:forEach>
						<tr>
							<td><form:select path="idProduct" name="productClicked">
									<c:forEach items="${productList}" var="productlist">
										<option value="${productlist.id}">${productlist.productName}</option>
									</c:forEach>
								</form:select>
							</td>
							<td><form:input path="price" placeholder="0" style="border: 1px solid; border-radius: 10px"/></td>
							
							<td><form:input path="quantity" placeholder="0" style="border: 1px solid; border-radius: 10px"/></td>
						</tr>
					<tbody>
				</table>
				<br>
				<button class="button-search" type="submit">Thêm</button>
				<a href="bill" class="button-search" style="text-decoration: none; padding: 11px 18px 11px 18px;">Xong</a>
			</form:form>
		</div>
	</section>

</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>