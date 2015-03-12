<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css"/>
  <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
  
  <script>
  $(document).ready(function() {
    $(".datepicker").datepicker();
  });
  </script>
<style type="text/css">@import url("<c:url value="/css/car.css"/>");</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>car rental</title>
</head>
<body>
<div>
    <h1> Search for Rental Car</h1>
    <pre>
 <div id="global">
  <form:form  modelAttribute="rentalSearch" action="searchCar">
  <fieldset>
  <legend>Pick up From  </legend>
  <form:input path="searchState"  size="50" placeHolder="Search Car by State"/><br/><form:errors path="searchState" cssStyle="color:red;" /><br/>
  
  <lable>pickup date  </lable><form:input path="pickUpDate"  class="datepicker"/>   <lable>   pickup time   </lable><form:select path="DropOffTime" ><option value="Morning">Morning</option ><option value="noon">Noon</option><option value="night">Night</option></form:select> 
 <form:errors path="pickUpDate" cssStyle="color:red;" />         
  
  <lable>DropOff date  </lable><form:input path="DropOffDate" class="datepicker"/>    <lable>  DropOff time  </lable><form:select path="DropOffTime" ><option value="Morning">Morning</option ><option value="noon">Noon</option><option value="night">Night</option></form:select>
   <form:errors path="DropOffDate" cssStyle="color:red;" />                            
  
  <input type="submit" Value="search" />
  </fieldset>
  
  </form:form>
</div>
</pre>
</body>
</html>