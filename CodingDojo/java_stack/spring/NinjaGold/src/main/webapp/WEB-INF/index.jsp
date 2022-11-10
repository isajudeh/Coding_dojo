<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>


	<p>Your Gold: <c:out value="${gold}"></c:out></p>

    <form action="/Gold/one" method="post">
    	<input type="hidden" name="location" value="farm">
        <h3>Farm</h3>
        <h4>(earns 10-20 gold)</h4>
        <input type="submit" value="Find Gold!">
    </form>
    
    <form action="/Gold/one" method="post">
    	<input type="hidden" name="location" value="cave">
        <h3>Cave</h3>
        <h4>(earns 5-10gold)</h4>
        <input type="submit" value="Find Gold!">
    </form>
    
    <form action="/Gold/one" method="post">
    	<input type="hidden" name="location" value="house">
        <h3>House</h3>
        <h4>(earns 2-5 gold)</h4>
        <input type="submit" value="Find Gold!">
    </form>
    
    <form action="/Gold/one" method="post">
    	<input type="hidden" name="location" value="quest">
        <h3>Quest</h3>
        <h4>(earns/takes 0-50 gold)</h4>
        <input type="submit" value="Find Gold!">
    </form>   
       

</body>
</html>