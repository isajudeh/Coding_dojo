<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>New Ninja</title>
</head>
<body>
<h1>NEW Ninja</h1>

<form:form action="/ninjas/new" method="post" modelAttribute="ninjaa">
		<form:label path="dojo">Dojo:</form:label>
		<form:select path="dojo">
		<c:forEach var="dojo" items="${DOJOS}">
  			<option value="${dojo.id}">${dojo.name}</option>
  		</c:forEach>
		</form:select>
		
        <form:label path="firstName">First Name:</form:label>
        <form:errors path="firstName"/>
        <form:input type="text" path="firstName"/>
        
        <form:label path="lastName">Last Name:</form:label>
        <form:errors path="lastName"/>
        <form:input type="text" path="lastName"/>
        
        <form:label path="age">Age:</form:label>
        <form:errors path="age"/>     
        <form:input type="number" path="age"/>
        
    	<input type="submit" value="Create"/>
</form:form>
</body>
</html>