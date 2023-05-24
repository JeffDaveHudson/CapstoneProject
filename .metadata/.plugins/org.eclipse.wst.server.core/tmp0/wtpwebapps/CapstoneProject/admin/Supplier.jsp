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
<link href='<c:url value="resources/css/style-page-admin.css" />' rel="stylesheet" type="text/css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
<script type="text/javascript">
	function confirm_decision(user_id) {
		if (confirm("you want to delete the user?")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page
		{
			window.location = "supplierdelete?id=" + user_id;
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
		<div class="text">Supplier Page</div>
		<h2 class="banner ">Supplier Management</h2>

		<form class="searchform" action="staffsearch" method="post">

			<p class="text2">Type here:</p>
			<div class="searchbar">
				<input type="search" name="searchString" placeholder='Search'>
			</div>
			<button class="button-search" type="submit">Search</button>

		</form>
		
		<%-- <div style="margin-left: 30%; margin-top: 0px">
			<form action="staffbydepartment" method="post">
			<p class="text2">Nhân Viên Theo Bộ Phận:</p>
			<select name="staffTypeClicked">
				<c:forEach items="${staffTypeList}" var="stafftypelist">
					<option value="${stafftypelist.id}">${stafftypelist.staffType}</option>
				</c:forEach>
			</select>
			<button class="button-search" type="submit">OK</button>
		</form>
		</div> --%>

		<br> <br> <a href="suppliercreateform">
			<button style="margin-left: 70px" class="button-search">Thêm
			</button>
		</a>
		<div class="table-wrapper" style="position: relative;
								  width:90%;
								  z-index: 1;
								  overflow: auto;
								  height: 350px;">
			<table class="fl-table" style=" width: 100%;
							   margin: auto;
							   border-collapse: separate;
							   border-spacing: 0;">
				<thead style="
							  position: -webkit-sticky;
							  position: sticky;
							  top: 0;">
					<tr >
						<th>Mã Nhà Cung Cấp</th>
						<th>Tên Nhà Cung Cấp</th>
						<th>Phân Loại</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach items="${supplierList}" var="supplierlist">
					
					<tr>

						<td>${supplierlist.id}</td>
						<td>${supplierlist.supplierName}</td>
						<c:forEach items="${supplierTypeList}" var="suppliertypelist">
								<c:if
									test="${supplierlist.idSupplierType == suppliertypelist.id}">

									<td>${suppliertypelist.supplierType}</td>
								</c:if>
							</c:forEach>


						<td><a class="bx bxs-edit bx-xs"
							<%-- style="text-decoration: none; color: green" href="staffupdate/${stafflist.idStaff}"></a> &nbsp --%>
							style="text-decoration: none; color: green"
							href="supplierupdateform?id=${supplierlist.id}"></a> &nbsp &nbsp 
							<a class="bx bxs-trash bx-xs"
							style="text-decoration: none; color: red"
							<%-- href="staffdelete?id=${stafflist.idStaff}" --%> onclick="confirm_decision('${supplierlist.id}')"></a></td>
					</tr>
					</c:forEach>
				<tbody>
			</table>
		</div>
	</section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>