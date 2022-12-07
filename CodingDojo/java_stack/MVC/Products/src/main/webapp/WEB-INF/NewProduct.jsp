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
<h1>NEW PRODUCT</h1>
<a href="/">Home</a>
<hr>

<form:form action="/products/new" method="post" modelAttribute="product">
		
        <form:label path="name">Name:</form:label>
        <form:errors path="name"/>
        <form:input type="text" path="name"/>
        
        <form:label path="description">Description:</form:label>
        <form:errors path="description"/>
        <form:input type="text" path="description"/>
        
        <form:label path="price">Price:</form:label>
        <form:errors path="price"/>     
        <form:input type="number" path="price"/>
        
    	<input type="submit" value="Submit"/>
 
</form:form>
</body>
</html>