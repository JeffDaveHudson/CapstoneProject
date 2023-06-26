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
<link href='<c:url value="/resources/css/style-page-admin.css" />'
	rel="stylesheet" type="text/css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<style type="text/css">
.home table tbody input {
	width: 80%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

.home table tbody select {
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

	<jsp:include page="navbar.jsp" />

	<section class="home">
		<div class="text">Kho</div>
		<h2 class="banner ">Cập Nhật Sản Phẩm</h2>
		<form:form modelAttribute="productupdate" class="searchform"
			action="processupdateproduct" method="post">

			<button style="" class="button-search">Cập Nhật</button>

			<div class="table-wrapper" style="height: 50vh; overflow: auto">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Mã Sản Phẩm</th>
							<th>Tên Sản Phẩm</th>
							<th width="300px">Loại Sản Phẩm</th>
							<th>Giá</th>
							<th>Số Lượng Trong Kho</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${productList}" var="productlist">
							<tr>
								<td><form:input type="text" path="id"
										value="${productlist.id}" readonly="true" /></td>
								<td><form:input type="text" path="productName"
										value="${productlist.productName}" /></td>


								<td><select name="productTypeClicked">
										<c:forEach items="${productTypeList}" var="producttypelist">
											<c:if test="${productlist.id == producttypelist.id}">
												<option value="${producttypelist.id}" selected>${producttypelist.productType}</option>
											</c:if>
											<option value="${producttypelist.id}">${producttypelist.productType}</option>
										</c:forEach>
								</select></td>

								<td><form:input type="text" path="price" pattern="[0-9]+" title="Vui lòng nhập đúng định dạng số"
										value="${productlist.price}" /></td>
								<td><form:input type="text" path="stock" pattern="[0-9]+" title="Vui lòng nhập đúng định dạng số"
										value="${productlist.stock}" readonly="true"/></td>
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