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
		<div class="text">Trang Công Đoạn</div>
		<h2 class="banner ">Công Đoạn Xử Lý</h2>
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

		<div class="table-wrapper" style="position: relative; width: 90%; z-index: 1; overflow: auto; height: 350px;">
			<form:form modelAttribute="step" action="stepaddnewstep"
				id="billCreateForm2">
				<table class="fl-table" style="width: 100%; margin: auto; border-collapse: separate; border-spacing: 0;">
				<thead style="position: -webkit-sticky; position: sticky; top: 0;">
						<tr>
							<th>ID</th>
							<th>Bước</th>
							<th>Chi Tiết</th>
							<th>Sản phẩm</th>
							<th>Chi Phí Công Đoạn</th>
							<th>Trạng Thái</th>
							<th>Action</th>
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
								
								<td>${steplist.cost}</td>
								
								<c:forEach items="${stateList}" var="statelist">
									<c:if test="${steplist.idState == statelist.id}">
										<td>${statelist.detail}</td>
									</c:if>
								</c:forEach>
								
								<%-- <td><a class="bx bxs-edit bx-xs"
								style="text-decoration: none; color: green"
								href="processupdateform?id=${processlist.id}"></a> &nbsp &nbsp <a
								class="bx bxs-trash bx-xs"
								style="text-decoration: none; color: red" onclick="confirm_decision('${processlist.id}')"></a></td> --%>
								
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
							
							<td><form:select path="idProduct">
									<c:forEach items="${productList}" var="productlist">
											<option value="${productlist.id}">${productlist.productName}</option>
									</c:forEach>
								</form:select></td>
							
							<td><form:input path="cost" type="text" style=" padding-top: 3px;
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