<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Dojo&Ninja</title>
</head>
<body>
	<c:forEach var="dojo" items="${DOJOS}">
    <a href="/dojos/${dojo.id}">  <c:out value="${dojo.name}"></c:out>  </a>
    <br>
    </c:forEach>
    <br>
    <hr>
    <br>
    <a href="dojos/new">Create DOJO</a>
    <br>
    <a href="/ninjas/new">Create NINJA</a>
</body>
</html>