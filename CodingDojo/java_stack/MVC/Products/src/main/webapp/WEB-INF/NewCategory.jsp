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
<h1>NEW CATEGORY</h1>
<a href="/">Home</a>
<hr>

<form:form action="/catrgories/new" method="post" modelAttribute="category">
		
        <form:label path="name">Name:</form:label>
        <form:errors path="name"/>
        <form:input type="text" path="name"/>
        
    	<input type="submit" value="Submit"/>
 
</form:form>
</body>
</html>