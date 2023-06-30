<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<%@ page import="java.util.Date"%> 
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
<script type="text/javascript">
	function setInitialCount() {
		<%count=1;%>
	}
	
	function confirm_decision(user_id) {
		if (confirm("you want to delete?")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page
		{
			window.location = "processremove?idProcess=" + user_id;
		} else {
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<section class="home">
		<div class="text">Trang Tiến Trình</div>
		<h2 class="banner ">Tiến Trình Xử Lý</h2>
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

		<div class="table-wrapper" style="position: relative; width: 90%; z-index: 1; overflow: auto; height: 350px;">
			<form:form modelAttribute="process" action="processaddnewprocess"
				id="billCreateForm2">
				<table class="fl-table" style="width: 100%; margin: auto; border-collapse: separate; border-spacing: 0;">
				<thead style="position: -webkit-sticky; position: sticky; top: 0;">
						<tr>
							<th>ID</th>
							<th>Giai Đoạn</th>
							<th>Chi Tiết</th>
							<th>Ngày Bắt Đầu</th>
							<th>Ngày Kết Thúc</th>
							<th>Trạng Thái</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						
						<c:forEach items="${processList}" var="processlist">
						<%! int count = 1; %>
							<tr>
								<%-- <c:forEach items="${productList}" var="productlist">
									<c:if test="${billdetaillist.idProduct==productlist.id}">
										<td>${productlist.productName}</td>
									</c:if>
								</c:forEach> --%>
								<td>${processlist.id}</td>
								
								<td><%=count %></td>
								<% count++; %>
								
								<td>${processlist.detail}</td>
								
								<td>${processlist.startDate}</td>
								
								<td>${processlist.endDate}</td>
								
								<c:forEach items="${stateList}" var="statelist">
								<c:if test="${processlist.idState == statelist.id}">

									<td>${statelist.detail}</td>
								</c:if>
							</c:forEach>
								
								<td><a class="bx bxs-edit bx-xs"
								style="text-decoration: none; color: green"
								href="processupdateform?id=${processlist.id}"></a> &nbsp &nbsp <a
								class="bx bxs-trash bx-xs"
								style="text-decoration: none; color: red" onclick="confirm_decision('${processlist.id}')"></a></td>
								
							</tr>
						</c:forEach>
						<tr>
						
							<td></td>
							<td>
								
							</td>
							
							<td><form:input path="detail" placeholder=" " style=" padding-top: 1px;
																					padding-bottom: 1px;
																					width: 80%;
																					background-color: #fff;
																					border: 1px solid;
																					border-radius: 10px;
																				" /></td>
							
							<td><form:input path="startDate" type="date" style=" padding-top: 3px;
																					padding-bottom: 3px;
																					width: 60%;
																					background-color: #fff;
																					border: 1px solid;
																					border-radius: 10px;
																				" /></td>
							
							<td><form:input path="endDate" type="date" style=" padding-top: 3px;
																					padding-bottom: 3px;
																					width: 60%;
																					background-color: #fff;
																					border: 1px solid;
																					border-radius: 10px;
																				" /></td>
						
							<td><form:select path="idState">
									<c:forEach items="${stateList}" var="statelist">
											<option value="${statelist.id}">${statelist.detail}</option>
									</c:forEach>
								</form:select>
							</td>
						</tr>
					<tbody>
				</table>
				<br>
				<button class="button-search" type="submit" onclick="setInitialCount()">Thêm</button>
				<a href="contract" class="button-search" style="text-decoration: none; padding: 11px 18px 11px 18px;">Xong</a>
			</form:form>
		</div>
	</section>

</body>

<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>