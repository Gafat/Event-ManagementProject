
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1"  width="800px">
<c:forEach var="car" items="${listOfCars}" varStatus="counter">
<tr>
<td>img</td>
 <td>
 Model :
 <c:out value="${car.model}"></c:out><br />
 Unit Price : 
 <c:out value="${car.price}"></c:out> <br />
 
 Seats:
 <c:out value="${car.numOfPeople}"></c:out> <br />
 Bags:
 <c:out value="${car.numOfBags}"></c:out>
 

</td>
 <td>Total cost : ${car.totalCost } <br /><a href="">book</a></td>
</tr>
</c:forEach>
</table>
 
</body>
</html>