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
<fieldset>
  <legend><spring:message code="Reservation-Page"/></legend>

<form:form modelAttribute="reservation"  action= "saveReservation" method="post">
                 <p>please fill the red marked spaces</p>
  		  <p>   <form:errors path="*" cssStyle="color : red;" /> 
        </p>
        <p>
            <label for="firstName"><spring:message code="client.firstName" /> </label>
            <form:input path="firstName" cssErrorClass="error"/>
          
           
        </p>
        <p>
             <label for="lastName"><spring:message code="client.lastName" /> </label>
            <form:input id="lastName" path="lastName"  cssErrorClass="error"/>
             
        </p>
          <p id="address">
          
           <label for="street"><spring:message code="client.street" /> </label>
           <form:input path="street" cssErrorClass="error"/>
            
          <label for="city"><spring:message code="client.city" /> </label>
          <form:input path="city" cssErrorClass="error"/> 
          
          <label for="state"><spring:message code="client.state"  /> </label>
          <form:input path="state" cssErrorClass="error"/><br/>
          
          
         <label for="zip"  id="zip"><spring:message code="client.zip"  /> </label>
          <form:input id="zipI" path="zip" cssErrorClass="error"/>
        
         
        </p>
        
        <p id = "bottom">
           
           <lable for="tel"><spring:message code="client.tel" /></lable>
           <form:input path="tel" cssErrorClass="error"/>
            
       
           <lable for="email"><spring:message code="client.email"/> </lable>
           <form:input path="email" cssErrorClass="error"/>
          
           <br/>
        </p>
        
      
        <p class="buttons">
               <form:button id="submit" path ="addReservation"><spring:message code="Add-Reservation"/></form:button>
             
              
               <p id="btnLink"><a href="authenticationPage"><spring:message code="Member-Login"/></a> |
               <a href="registerationForm"> <spring:message code="Register-Now"/></a>
               </p><br/>
        </p>
        
        <p><spring:message code="discount"/></p> <p> Language: <a href="ReservationForm?language=en_US"> English</a> | <a href="ReservationForm?language=es">Spanish</p>
    
</form:form>
  
              <form:form modelAttribute="reservation" action="authenticationPage" method="GET">
              <p class="buttons2">
                <form:button  id="submit" path ="memberLogin"><spring:message code="Member-Login"/></form:button>
              </p>
              </form:form>
               <form:form modelAttribute="reservation" action="registerationForm" method="GET">
              <p class="buttons3">
                <form:button  id="submit" path ="registerNow"> <spring:message code="Register-Now"/></form:button>
              </p>
              </form:form>
       
  </fieldset>      
</div>
</body>
</html>
