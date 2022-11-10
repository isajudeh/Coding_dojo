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
	<h2>Here is Your Omikuji!</h2>
	<p>
	In <c:out value="${snack}"></c:out> years, you will live in ${city} with ${person} as your roommate, ${hoppy} for a a living. 
	The next time you see a ${things}, you will have good luck. Also, ${comment}.
	</p>
	<br>
	<a href="/omikuji">Go Back</a>
	
</body>
</html>