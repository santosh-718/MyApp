<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<script src="<c:url value="/resources/javascripts/regValidation.js"/>"></script>
<link rel="stylesheet" href="<c:url value="/resources/styles/regstyle.css"/>">
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
 <div class="header">
	<div class="first">
	<img src="<c:url value="/resources/images/s_logo.jpg"/>" width=45px;height=45px;>
	</div>
	<div class="second">
	<b>Hostel</b>
	</div>
	</div>
	<hr>
	<div class="cont">
	<div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form action="./saveuser" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" name="fullName" placeholder="Enter your name" required>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <input type="text" name="userId" placeholder="Enter your username" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" name="email" placeholder="Enter your email" required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" name="phNo" placeholder="Enter your number" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" name="password" id="pswd2" placeholder="Enter your password" required>
          </div>
          <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="password" name="cpwd" id="pswd1" placeholder="Confirm your password">
          </div>
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1">
          <input type="radio" name="gender" id="dot-2">
          <input type="radio" name="gender" id="dot-3">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register" onclick="matchPassword()">
        </div>
      </form>
    </div>
  </div>
  </div>
</body>
</html>