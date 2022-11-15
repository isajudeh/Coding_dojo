<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Share</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Save Travels</h1>
<table>
    <thead>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="oneExpense" items="${Expenses}">
        <tr>
        <td><c:out value="${oneExpense.name}"></c:out></td>
        <td><c:out value="${oneExpense.vendor}"></c:out></td>
        <td><c:out value="${oneExpense.amount}"></c:out></td>
        </tr>
    	</c:forEach>
    </tbody>
</table>
<hr>
<h2>Add an Expense</h2>
<form:form action="/expense1" method="post" modelAttribute="Expenses">
    <p>
        <form:label path="name">Expense Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor:</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount:</form:label>
        <form:errors path="amount"/>     
        <form:input type="number" path="amount"/>
    </p>    
    <p>
        <form:label path="description">Description:</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>