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
</style>

</head>
<body>
	<jsp:include page="navbar.jsp" />
	<section class="home">
		<div class="text">Chi Tiết Doanh Thu</div>
		<h2 class="banner ">Danh Sách Chi Tiết</h2>

		<%-- <form class="searchform" action="contractsearch" method="post">
			<div class="searchbar">
				<input type="search" name="searchString" placeholder='Search'>
			</div>
			<button class="button-search" type="submit">Tìm Kiếm</button>

		</form>

		<br> <br> <a href="contractcreateform">
			<button style="margin-left: 70px" class="button-search">Thêm
				Hợp Đồng</button>
		</a> --%>
		<div class="table-wrapper"
			style="position: relative; width: 90%; z-index: 1; overflow: auto; height: 350px;">
			<table class="fl-table"
				style="width: 100%; margin: auto; border-collapse: separate; border-spacing: 0;">
				<thead style="position: -webkit-sticky; position: sticky; top: 0;">
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
							href="contractshowprocess?id=${contractlist.id}"></a>
							
							<a class="bx bxs-edit bx-xs"
							style="text-decoration: none; color: green"
							href="contractupdateform?id=${contractlist.id}"></a> <a
								class="bx bxs-trash bx-xs"
								style="text-decoration: none; color: red" onclick="confirm_decision('${contractlist.id}')"></a></td> --%>
						</tr>
					</c:forEach>
				<tbody>
			</table>
		</div>
		<a href="revenue" class="button-search" role="button" style="float: right; margin-right: 70px; text-decoration: none; padding-top: 12px; padding-bottom: 12px;">Quay Lại</a>
	</section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>