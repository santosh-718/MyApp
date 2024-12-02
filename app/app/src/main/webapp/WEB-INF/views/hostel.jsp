<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<c:url value="/resources/styles/hostelPage.css"/>">
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
<div class="navbar">
         <ul>
              <li class="hname"><h1>${hostels.hostelName}</h1></li>
              <li><a href="userhome"><h4 style="color: red;">Back</h4></a></li>
              <li><a href="#"><h4>About</h4></a></li>
              <li><a href="#"><h4>Payments</h4></a></li> 
                 <div class="dropdown">
                     <button class="dropbtn"><h4>Rooms</h4>
                         <i class="fa fa-caret-down"></i>
                     </button>
                  <div class="dropdown-content">
                      <a href="#">2 Sharing</a>
                      <a href="#">3 Sharing</a>
                      <a href="#">4 Sharing</a>
                   </div>
                  </div>
          </ul>
 </div>
<div class="place">
  <div class="place1">
    <div>
      <img  class="loc1" src="<c:url value="/resources/images/location.jpg"/>" alt="location">
    </div>
    <div>
      <div class="loc">${hostels.location}</div>
    </div>
  </div>
  <div class="phone">
    <div class="icon">
      <svg xmlns="http://www.w3.org/2000/svg" width="18" height="19" fill="currentColor" class="bi bi-telephone" viewBox="0 0 16 16">
        <path d="M3.654 1.328a.678.678 0 0 0-1.015-.063L1.605 2.3c-.483.484-.661 1.169-.45 1.77a17.568 17.568 0 0 0 4.168 6.608 17.569 17.569 0 0 0 6.608 4.168c.601.211 1.286.033 1.77-.45l1.034-1.034a.678.678 0 0 0-.063-1.015l-2.307-1.794a.678.678 0 0 0-.58-.122l-2.19.547a1.745 1.745 0 0 1-1.657-.459L5.482 8.062a1.745 1.745 0 0 1-.46-1.657l.548-2.19a.678.678 0 0 0-.122-.58L3.654 1.328zM1.884.511a1.745 1.745 0 0 1 2.612.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"/>
      </svg>
    </div>
    <div class="number">
      <h3>${hostels.contactNo}</h3>
    </div>
  </div>

 </div>
 
 <br>
 <div class="section">

  <div class="section1">
    <div class="rent">
      <h2>Rent Details:</h2><br>
      <table width="75%" >
      <tr width="30px">
      <td>
      <h4>2'Sharing : Rs.${hostels.twoShare}</h4>
      </td>
      <td>
      <h4>2'Sharing With AC: Rs.${hostels.twoShareAc}</h4>
      </td>
      </tr>
      <tr>
      <td>
      <h4>3'Sharing : Rs.${hostels.threeShare}</h4>
      </td>
      <td>
      <h4>3'Sharing With AC: Rs.${hostels.threeShareAc}</h4>
      </td>
      </tr>
      <tr>
      <td>
      <h4>4'Sharing : Rs.${hostels.fourShare}</h4>
      </td>
      <td>
      <h4>4'Sharing With AC: Rs.${hostels.fourShareAc}</h4>
      </td>
      </tr>
      </table></br>
      <h4><div class="note">Note:</div></h4> Rs.2000 Advance and Rs.1000 will be return at the time of vacate</h4>
      </div><br>
      <div class="food">
        <h2>Food Menu:</h2></br>
        <ul style="list-style-type:square">
        <li><h3>Weekly 3 times Non-Veg</h3></li>
        <li><h3>Snacks in the evening</h3></li>
        <li><h3>Dum biryani special on Sunday</h3></li>
        </ul>
        
      </div>
  </div>
  <div class="section2">
   <h2>Facilities:</h2>
   <ul style="list-style-type:square">
        <li><h3>24*7 Hot&Cold Water</h3></li>
        <li><h3>High Speed Internet</h3></li>
        <li><h3>Daily room cleaning</h3></li>
        <li><h3>Safety Lockers</h3></li>
        <li><h3>Homely Hygenic food</h3></li>
        <li><h3>Security with CC Tv</h3></li>
        </ul>
  </div>

  </div>
</body>
</html>