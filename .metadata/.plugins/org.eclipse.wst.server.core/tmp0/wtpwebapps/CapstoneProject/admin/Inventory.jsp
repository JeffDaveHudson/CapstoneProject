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

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<style type="text/css">
#form2{
	text-align: center;
	margin-top: 20px;
}

</style>
</head>
<body>
<jsp:include page="navbar.jsp" />

    <section class="home">
        		<div class="text">Inventory Page</div>
        <h2 class = "banner "  style="margin-top: -70px">Inventory Management Table</h2>
        <div class = "banner">
			<a href="<%=request.getContextPath()%>/viewSupplier" class="btn btn-info button-search" role="button">View Supplier</a>
			<a href="bill" class="btn btn-info button-search" role="button">View Bill</a>
		</div>
          <c:url value="/SearchInventory" var="SearchInventory"/>
 		<form:form class = "searchform" action="inventorysearchbyattribute" method="post">
					<p class = "text2" >Tìm kiếm theo: </p>
    								<select name="inventoryProductTypeClicked" class="select">
    									<c:forEach items="${productTypeList}" var="producttypelist">
  											<option value ="${producttypelist.id }">${producttypelist.productType }</option>	
      									</c:forEach>
    								</select>
    								<select name="inventorySupplierClicked" class="select">
    									<c:forEach items="${supplierList}" var="supplierlist">
  											<option value="${supplierlist.id }">${supplierlist.supplierName }</option>	
      									</c:forEach>
    								</select>
    								<button class = "button-search" type = "submit">OK</button>
    	</form:form>
        <form:form id="form2" action="inventorysearch">
  						<div class="searchbar"><input name="searchInventoryString" type="search" placeholder='Search' /></div>
  						<button class = "button-search" type = "submit">Search</button>
        </form:form>

        
<br>
<br>
<div class="table-wrapper"  style="position: relative;
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
        <tr>
            <th>Mã Sản Phẩm</th>
            <th>Tên Sản Phẩm</th>
            <th>Loại Sản Phẩm</th>
            <th>Nhà Cung Cấp</th>
            <th>Giá (VND)</th>
            <th>Số Lượng Trong Kho (Cái)</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="productlist">
        <tr>
            <td>${productlist.id}</td>
            <td>${productlist.productName}
            	<%-- &nbsp &nbsp
  				<a class = "bx bxs-box bx-xs" style="text-decoration:none; color: blue " href = "<%=request.getContextPath()%>/viewProduct?id=<c:out value="${item.id}-${item.name}" />">
  					</a> --%></td>
  			<c:forEach items="${productTypeList}" var="producttypelist">
  				<c:if test="${productlist.idProductType==producttypelist.id}">
            		<td>${producttypelist.productType}</td>
            	</c:if>
            </c:forEach>
            
            <c:forEach items="${supplierList}" var="supplierlist">
            	<c:if test="${productlist.idSupplier==supplierlist.id}">
           			<td>${supplierlist.supplierName}</td>
            	</c:if>
            </c:forEach>
            <td>${productlist.price}</td>
            
            <%-- <c:forEach items="${productInventoryList }" var="productinventorylist">
            	<c:if test="${productlist.idProductInventory==productinventorylist.id }"> --%>
            		<td>${productlist.stock}</td>
            	<%-- </c:if>
            </c:forEach> --%>
        </tr>
        </c:forEach>
        <tbody>
    </table>
</div>
    </section>
</body>
<script src='<c:url value="/resources/js/js-page-admin.js" />'></script>
</html>