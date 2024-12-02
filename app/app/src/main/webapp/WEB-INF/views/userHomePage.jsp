<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/styles/userHomePage.css"/>">
<title>User Home Page</title>
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
<div class="u1">
	<div class="us1">
	  <h1>Welcome <span class="span1"><i>${users.fullName}</i></span></h1>
	</div>
	<div class="logout1">
	 <a href="./home"> <button type="button" class="lg1">Log Out</button></a>
	</div>
</div>
<br><br>
<h2>List of Hostel's:</h2><br><br>
<div class="btn"><a href="./addhostel"><button type="button" class="addhostel">Add Hostel</button></a></div><br><br>
<div class="hostel">

<c:forEach items="${hostellist}" var="h">
            
            <div class="box">
           <a href="./hostelpage?hostelName=${h.hostelName}"><h5>${h.hostelName}</h5></a>
             </div><br>
</c:forEach>
</div>
 
</body>
</html>