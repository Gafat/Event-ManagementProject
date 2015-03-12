<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">@import url("<c:url value="/css/car.css"/>");</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>car rental</title>
</head>
<body>
<div class="global">
<form:form modleAttribute="car" action="addCar" method="get">
<h1>successfully added</h1>
<p>
  Company Name : ${car.companyName } 
</p>
<p>
  model : ${car.model }
</p>
  price : $ ${car.price }
  <p>
  ${car.type }
  </p>
  <p>
  Number of Seat : ${car.numOfPeople }
  </p>
  <p>
  Number of Bags : ${car.numOfBags }
  </p>
  <p>
  State : ${car.state }
  </p>
  <p>
  City : ${car.city }
  </p>
  
 <button>Add More Cars </button> 
 <spring:url value="/delete" var="delete"></spring:url>
 <a href="${delete}">Delete </a></form:form>
 

</div>
</body>
</html>