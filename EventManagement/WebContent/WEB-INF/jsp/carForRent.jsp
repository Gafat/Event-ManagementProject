
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
<title>Insert title here</title>
</head>
<body>
<h1>${Notfound}</h1>
<div id="global">
<table border="0" width=550px>
<c:forEach var="car" items="${listOfCars}" varStatus="counter">
<tr>
<td><img src="<c:url value="/images/${ car.companyName}.jpg"></c:url>"/></td>
 <td>
 Model :
 <c:out value="${car.model}"></c:out><br />
  Price Per Day : $
 <c:out value="${car.price}"></c:out> <br />
 
 Seats:
 <c:out value="${car.numOfPeople}"></c:out> <br />
 Bags:
 <c:out value="${car.numOfBags}"></c:out>
 

</td>
 <td>Total cost :$  ${car.totalCost } <br /><a href="">book</a></td>
</tr>
</c:forEach>
</table>
 </div>
</body>
</html>