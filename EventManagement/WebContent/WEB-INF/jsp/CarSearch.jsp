<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
   
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
<div>
    <h1> Search for Rental Car</h1>
    <h2>Pick up From </h2>
  <form:form  modelAttribute="rentalSearch" action="searchCar">
  <form:input path="searchState"  size="50" placeHolder="Airport , city or point of interset"/><br/><br/><br/>
  <lable>pickup date</lable>
  <form:input path="pickUpDate" /><br/><br/>
  <lable>pickup time</lable>
  <form:input path="pickUpTime"/><br/><br/>
  <lable>DropOff date</lable>
  <form:input path="DropOffDate"/><br/><br/>
  <lable>DropOff time</lable>
  <form:input path="DropOffTime"/><br/><br/>
  <input type="submit" Value="search" />
  </form:form>
</div>
</body>
</html>