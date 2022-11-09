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
    
    <h2>Send an Omikuji</h2>
    <form action="/omikuji/confirm" method="post">
        <label>pick any number from 5 to 25</label><br>
        <select name="snack">
        <% for(int i = 5; i < 26; i++) { %>
        <option><%= i %></option>
    	<% } %>
		</select>
		<br>
        <label>Enter the name of any city</label><br>
        <input type="text" name="city">
		<br>
        <label>Enter the name of any real person</label><br>
        <input type="text" name="person">
		<br>
        <label>Enter professional endeavor or hobby</label><br>
        <input type="text" name="hoppy">
		<br>
        <label>Enter any type on living thing</label><br>
        <input type="text" name="things">
		<br>
		<label>Say something nice to someone</label><br>
		<textarea name="comment" cols="20" rows="3"></textarea>
		<br>
		<label>Send and show a friend</label><br>	                                
        <input type="submit" value="Send">
    </form>
    
</body>
</html>