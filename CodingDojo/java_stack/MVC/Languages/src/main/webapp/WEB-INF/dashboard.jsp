<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>dash</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>NAME</th>
            <th>CREATOR</th>
            <th>VERSION</th>
            <th>ACTIONS</th>
        </tr>
    </thead>
    <tbody>
    
        <c:forEach var="language" items="${languagesss}">
        <tr>
        <td><c:out value="${language.name}"></c:out></td>
        <td><c:out value="${language.creator}"></c:out></td>
        <td><c:out value="${language.version}"></c:out></td>
        <td><a href="******">Delete</a> <a href="/languages/edit/${language.id}">Edit</a></td>
        </tr>
    	</c:forEach>
    	
    </tbody>
</table>

<form:form action="/langlang" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>     
        <form:input type="number" path="version"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>