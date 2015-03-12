<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">@import url("<c:url value="/css/Gez_style.css"/>");</style>
<title>Insert title here</title>
</head>
<body>


<form:form modelAttribute="reservation" action="ReservationForm"  method="GET">
<fieldset>
<legend> Thank you </legend>

<div>

<p>If you have not done so, please register with us and get a 10% discount on your next service.</p> 
Registration also will allow you to rate your service provider.

</div>
<h3> Here is your Confirmation Receipt: </h3> 
   
      
      <div id="thankyoulabel">
        <p> <label for="firstName"><spring:message code="client.firstName" /> </label>${reservation.firstName}</p>
        <p> <label for="lastName"><spring:message code="client.lastName" /> </label>  ${reservation.lastName}  </p>
        <p> <label for="street"><spring:message code="client.street" /> </label>      ${reservation.street}  </p>
        <p> <label for="city"><spring:message code="client.city" /> </label>          ${reservation.city} </p>
        <p> <label for="state"><spring:message code="client.state"  /> </label>       ${reservation.state} </p>
        <p> <label for="zip"  ><spring:message code="client.zip"  /> </label>         ${reservation.zip}</p>
        
        <p> <label for="tel">Tel: </label>  ${reservation.tel}      </p> 
       
        <p>  <label for="email">Email: </label>   ${reservation.email} </p><br/><br/>
        <p> Your Total charge is :  ${reservation.total}</p> 
     </div>


        <form:button ><spring:message code="Home"/></form:button>
 </fieldset>       
</form:form>
</body>
</html>