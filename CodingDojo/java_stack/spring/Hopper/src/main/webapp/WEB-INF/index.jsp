<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>

<h1>Customer Name: <c:out value= "${first}"></c:out></h1>
<h2>Item Name: <c:out value= "${item}"></c:out></h2>
<h2>Price: <c:out value= "${num}"></c:out></h2>
<h2>Description: <c:out value= "${desc}"></c:out></h2>
<h2>Vendor: <c:out value= "${ven}"></c:out></h2>

</body>
</html>