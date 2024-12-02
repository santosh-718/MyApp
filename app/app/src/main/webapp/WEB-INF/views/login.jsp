<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/styles/loginstyle.css"/>">
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<div class="header">
	<div class="first">
	<img src="<c:url value="/resources/images/s_logo.jpg"/>" width=50px;height=50px;>
	</div>
	<div class="second">
	<b>Hostel</b>
	</div>
	</div>
	<hr>
	<div class="bodypart">
	<div class="body1">
	<img src="<c:url value="/resources/images/home_logo2.jpg"/>" width=85%;height=80%;>
	</div>
	<div class="body2">
	<div class="login">
	<h2>Login Page</h2><br>
	 <form id="login" method="post" action="authenticate">
        <label><b>User Name</b></label>
        <input type="text" name="userId" id="Uname" placeholder="Username">
        <br><br>
        <label><b>Password</b></label>
        <input type="Password" name="Password" id="Pass" placeholder="Enter your Password">
        <br><br>
        <input type="submit" name="log" id="log" value="Login">
        <br><br>
        Forgot <a href="./forgetpassword">Password</a><br>
        New User?<a href="./register">Register Here</a>
    </form>
    </div>
    
	</div>
	</div>
	
</body>
</html>