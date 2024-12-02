<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/styles/addHostel.css"/>">
<title>add Hostel</title>
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
<hr><div class="sideheading">
<h3>Basic Hostel Details:</h3>
</div>
</br>
<form action="savehostel">
<table style="width: 100%;" align="center" border="1">
<div class="row1">
    <tr height="50px" align="center" >
        <td>
            <b>Hostel Name </b><input type="text" name="hostelName">
        </td>
         <td>
            <b>Location </b><input type="text" name="location">
        </td>
    </tr>
    </div>
    <tr align="center"  height="50px">
        <td >
            <b>Hostel Category </b><input type="text" name="hostelCategory">
        </td>
        <td >
            <b>Contact No. </b><input type="text" name="contactNo">
        </td>
    </tr> 
      <tr align="left"  height="50px">
        <td >
       <h3>Rooms & Rent Details:</h3>
        </td>
    </tr> 
    <tr align="center"  height="50px">
        <td >
            <b>2 Sharing Rs.</b><input type="number" name="twoShare">
        </td>
        <td >
            <b>2 Sharing with AC Rs.</b><input type="number" name="twoShareAc">
        </td>
    </tr> 
    <tr align="center"  height="50px">
        <td >
            <b>3 Sharing Rs.</b><input type="number" name="threeShare">
        </td>
        <td >
            <b>3 Sharing with AC Rs.</b><input type="number" name="threeShareAc">
        </td>
    </tr> 
    <tr align="center"  height="50px">
        <td >
            <b>4 Sharing Rs.</b><input type="number" name="fourShare">
        </td>
        <td >
            <b>4 Sharing with AC Rs.</b><input type="number" name="fourShareAc">
        </td>
    </tr></table></br>
    
    
           <button style="text-align: center"class="button" type="submit">Submit</button>

    
<input type="hidden" name="userId" value="${users.userId}">

</form>
</body>
</html>