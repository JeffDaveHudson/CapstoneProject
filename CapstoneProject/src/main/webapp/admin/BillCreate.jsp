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
#billCreateForm td input {
	width: 80%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}

#billCreateForm td select {
	padding-top: 7px;
	padding-bottom: 7px;
	width: 80%;
	background-color: #fff;
	border: 1px solid;
	border-radius: 10px;
}


</style>
<!-- <script type="text/javascript">
	function showForm() {
		document.getElementById('billCreateForm2').style.display = 'block';
	}
</script> -->
</head>
<body>
	<jsp:include page="navbar.jsp" />

	<section class="home">
		<div class="text">Bill Page</div>
		<h2 class="banner ">Create New Bill</h2>
		<div class="table-wrapper">
			
			<form:form modelAttribute="bill" id="billCreateForm" action="billdetailcreate">
			<button class="button-search" type="submit" >OK</button>
				<table class="fl-table">
					<thead>
						<tr>
							<th>Tên hóa đơn</th>
							<th>Nhà cung cấp</th>
							<th>Nhân viên</th>
							<!-- <th>Tổng</th> -->
							<th>Ngày</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><form:input type="text" path="billName" /></td>
							<td><form:select path="idSupplier" name="supplierClicked">
									<c:forEach items="${supplierList}" var="supplierlist">
										<option value="${supplierlist.id}">${supplierlist.supplierName}</option>
									</c:forEach>
								</form:select></td>

							<td><form:select path="idStaff">
									<c:forEach items="${staffList}" var="stafflist">
										<c:if test="${stafflist.idStaffType==1 }">
											<option value="${stafflist.id}">${stafflist.staffName}</option>
										</c:if>
									</c:forEach>
								</form:select></td>

							<td><form:input path="dateTransfer" type="date" style=" padding-top: 7px;
																					padding-bottom: 7px;
																					width: 80%;
																					background-color: #fff;
																					border: 1px solid;
																					border-radius: 10px;
																				" /></td>
						</tr>
					<tbody>
				</table>
				<!-- <table class="fl-table" style="margin-top: 80px;">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Đơn giá</th>
							<th>Số Lượng</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text"> </td>
							<td><input type="text"> </td>
							<td><input type="text"> </td>
						</tr>
					<tbody>
				</table> -->
			</form:form>
			<br>
			
		</div>

		<%-- <div class="table-wrapper">
			<form:form modelAttribute="bill" action="processbillcreate"
				id="billCreateForm2" style="display: none">
				<table class="fl-table">
					<thead>
						<tr>
							<th>Sản phẩm</th>
							<th>Đơn giá</th>
							<th>Số Lượng</th>
						</tr>
					</thead>
					<tbody>
						<tr>

						</tr>
					<tbody>
				</table>
				<br>
				<button class="button-search" type="submit">OK</button>
			</form:form>
		</div> --%>
	</section>

</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>

