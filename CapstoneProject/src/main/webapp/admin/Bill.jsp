<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventory Management page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='<c:url value="/resources/css/style-page-admin.css" />' rel="stylesheet" type ="text/css"> 
 <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
 
<style type="text/css">

#searchForm{
	text-align: center;
}
</style>
</head>
<body>
 	<jsp:include page="navbar.jsp"/>

    <section class="home">
        		<div class="text">Bill Page</div>
        <h2 class = "banner ">Bill History Table</h2>
        <div class = "banner">
			<a href="billcreate" class="button-search" role="button">Add Bill</a>
			<a href="<%=request.getContextPath()%>/showAddBillAvailable" class="button-search" role="button">Add Bill (Available Product)</a>
		</div>
          <c:url value="/SearchInventory" var="SearchInventory"/>
 		<%-- <form:form class = "searchform" action="SearchBillDetail" method="post">
					<p class = "text2" >Search Information by:</p>
    								<select name="op" class="select">
      									 <option value="Bill_Name">Tên hóa đơn</option>
      									 <option value="Bill_Type">Loại</option>
      									 <option value="Supplier_Name">Nhà cung cấp</option>
      									 <option value="Product_Name">Sản phẩm</option>
      									 <option value="Transfer_Date ">Ngày</option>
    								</select>
        </form:form> --%>
        <form:form id="searchForm" action="billsearch">
  			<div class="searchbar"><input name="searchString" type="search" placeholder='Search' /></div>
  			<button class = "button-search" type = "submit">Search</button>
        </form:form>
<br>
<br>
<div class="table-wrapper" style="position: relative;
								  width:90%;
								  z-index: 1;
								  overflow: auto;
								  height: 350px;">
    <table class="fl-table" style="	  width: 100%;
									  margin: auto;
									  border-collapse: separate;
									  border-spacing: 0;">
        <thead style="
				  position: -webkit-sticky;
				  position: sticky;
				  top: 0;">
        <tr >
            <th>STT</th>
            <th>Tên hóa đơn</th>
            <th>Nhà cung cấp</th>
            <th>Nhân viên</th>
            <th>Tổng</th>
            <th>Ngày</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${billList}" var="billlist">
        <tr>
            <td>${billlist.id}</td>
            <td>${billlist.billName}</td>
            
            <c:forEach items="${supplierList }" var="supplierlist">
            	<c:if test="${billlist.idSupplier==supplierlist.id}">
            		<td>${supplierlist.supplierName}</td>
            	</c:if>
            </c:forEach>
            
            <c:forEach items="${staffList }" var="stafflist">
            	<c:if test="${billlist.idStaff==stafflist.id }">
					<td>${stafflist.staffName}</td>
				</c:if>
			</c:forEach>
			
			<td>${billlist.total}</td>
			<td>${billlist.dateTransfer}</td>
			<td></td>
            <%-- <td>
            <a class = "bx bxs-trash bx-xs" style="text-decoration:none; color: red " href = "<%=request.getContextPath()%>/deleteBillDetail?id=<c:out value="${item.id}-${item.bill.id}" />">
  					</a>
  					</td> --%>
        </tr>
        </c:forEach>
        <tbody>
    </table>
</div>
    </section>

</body>
    <script src = '<c:url value="/resources/js/js-page-admin.js" />' ></script>
</html>