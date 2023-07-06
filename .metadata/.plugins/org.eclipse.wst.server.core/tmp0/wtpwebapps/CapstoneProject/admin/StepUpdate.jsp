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

#number{
	padding-top: 7px;
	padding-bottom: 7px;
	width: 80%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
	text-align: center;
}
</style>
</head>
<body>

	<jsp:include page="navbar.jsp"/>

	<section class="home">
		<div class="text">Trang Cập Nhật Các Bước Trong Giai Đoạn</div>
		<h2 class="banner ">Cập Nhật Các Bước</h2>
		<form:form modelAttribute="stepupdate" class="searchform" action="stepupdatestep" method="post">
			
			<button style="" class="button-search">Cập Nhật</button>

			<div class="table-wrapper" style="height: 50vh; overflow: auto">
				<table class="fl-table">
					<thead>
						<tr>
							<th>ID</th>
							<th>Chi Tiết</th>
							<th>Sản phẩm</th>
							<th>Số Lượng</th>
							<!-- <th>Thành Giá</th> -->
							<th>Chi Phí Công Đoạn</th>
							<th>Trạng Thái</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${stepList}" var="steplist">
						<%-- <%! int count = 1; %> --%>
							<tr>
								<td><form:input type="text" path="id" value = "${steplist.id}" readonly="true"/></td>
								
								<td><form:input type="text" path="detail" value="${steplist.detail}"/></td>
								
								<td><form:select path="idProduct">
									<c:forEach items="${productList}" var="productlist">
											<option value="${productlist.id}">${productlist.productName}</option>
									</c:forEach>
								</form:select>
								
								
								<c:forEach items="${stepProductQuantityList}" var="stepproductquantitylist">
									<c:if test="${steplist.id == stepproductquantitylist.idStep}">
										<td><input id="number" type="number" pattern="[0-9]+" title="Vui lòng nhập đúng định dạng số" name="quantity" value = "${stepproductquantitylist.quantity}" /></td>
									</c:if>
								</c:forEach>
								
								
								<td><form:input type="text" path="cost" pattern="[0-9]+" title="Vui lòng nhập đúng định dạng số" value="${steplist.cost}"/></td>
								
								<td><form:select path="idState">
									<c:forEach items="${stateList}" var="statelist">
											<option value="${statelist.id}">${statelist.detail}</option>
									</c:forEach>
								</form:select>
								
								<%-- <td><form:input type="text" path="idContract" value = "${processlist.idContract}" readonly="true"/></td> --%>
								
								
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