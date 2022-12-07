<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>HOME PAGE</h1>
<hr>
<a href="/products/new">New Product</a>
<br>
<a href="/catrgories/new">New Category</a>
<hr>
<table>
    <thead>
        <tr>
            <th>Products</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="product" items="${product}">
        <tr>
        <td><a href="/products/${product.id}"><c:out value="${product.name}"></c:out></a></td>
        </tr>
    	</c:forEach>
    </tbody>
</table>
<table>
    <thead>
        <tr>
            <th>Categories</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="category" items="${unassignedCategories}">
        <tr>
        <td><a href="/categories/${category.id}"><c:out value="${category.name}"></c:out></a></td>
        </tr>
    	</c:forEach>
    </tbody>
</table>
</body>
</html>