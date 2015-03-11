<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Book Form</title>
<style type="text/css">@import url("<c:url value="/css/Gez_style.css"/>");</style>
</head>
<body>

<div id="mainBody">
<form:form modelAttribute="reservation"  action= "saveReservation" method="post">
    <fieldset>
        <legend>Reservation Page</legend>
       <p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>
        <p>
            <label for="firstName"><spring:message code="client.firstName" /> </label>
            <form:input path="firstName"/>
            <form:errors path="firstName" cssStyle="color : red;"/>
           
        </p>
        <p>
             <label for="lastName"><spring:message code="client.lastName" /> </label>
            <form:input id="lastName" path="lastName"/>
             <form:errors path="lastName" cssStyle="color : red;"/>
        </p>
          <p id="address">
          
           <label for="street"><spring:message code="client.street" /> </label>
           <form:input path="street"/>
            <form:errors path="street" cssStyle="color : red;"/>
          <label for="city"><spring:message code="client.city" /> </label>
          <form:input path="city"/> 
           <form:errors path="city" cssStyle="color : red;"/>
          <label for="state"><spring:message code="client.state"  /> </label>
          <form:input path="state"/><br/>
           <form:errors path="state" cssStyle="color : red;"/>
          
         <label for="zip"  id="zip"><spring:message code="client.zip"  /> </label>
          <form:input id="zipI" path="zip"/>
           <form:errors path="zip" cssStyle="color : red;"/>
         
        </p>
        
        <p id = "bottom">
           
           <lable for="tel">Tel: </lable>
           <form:input path="tel"/>
            <form:errors path="tel" cssStyle="color : red;"/>
           
       
       
           <lable for="email">Email: </lable>
           <form:input path="email"/>
            <form:errors path="email" cssStyle="color : red;"/>
           <br/>
        </p>
        
      
        <p id="buttons">
               <form:button id="submit" path ="addReservation">Add Reservation</form:button>
              <form:button  id="submit" path ="memberLogin">Member Login</form:button>
               <form:button id="submit" path ="registerNow">Register Now</form:button>
              
               <p><a href="authenticationPage">  Member-Login</a> |
               <a href="registerationForm">  Register-now</a></p><br/>
        </p>
        
        <p> Note: Members have a 10% discount and can rate the service</p>
    </fieldset>
</form:form>
</div>
</body>
</html>
