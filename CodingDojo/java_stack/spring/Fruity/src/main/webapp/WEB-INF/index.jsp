<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<table>
	<tr>
		<th>
		Name
		</th>
		<th>
		Price
		</th>
	</tr>
	<tr>
		<td>
		<c:forEach var="fruit" items="${fru}">
        <p><c:out value="${fruit.name}"></c:out></p>
    	</c:forEach>
    	</td>
    	<td>
		<c:forEach var="fruit" items="${fru}">
        <p><c:out value="${fruit.price}"></c:out></p>
    	</c:forEach>
    	</td>
	</tr>
</table>

    
</body>
</html>