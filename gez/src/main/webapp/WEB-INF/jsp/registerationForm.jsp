<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">@import url("<c:url value="/css/Gez_style.css"/>");</style>

</head>
<body>

<form:form modelAttribute="reservation"  action= "saveRegisteration" method="POST">
    <fieldset>
        <legend>Registration Page</legend>
       
   <div class="PersonalInfo">
    <div id="registration">
      <div id="label">
        <p> <label for="firstName"><spring:message code="client.firstName" /> </label> </p>
        <p> <label for="lastName"><spring:message code="client.lastName" /> </label>   </p>
        <p> <label for="street"><spring:message code="client.street" /> </label>       </p>
        <p> <label for="city"><spring:message code="client.city" /> </label>          </p>
        <p> <label for="state"><spring:message code="client.state"  /> </label>       </p>
        <p> <label for="zip"  ><spring:message code="client.zip"  /> </label>         </p>
        
        <p> <label for="tel">Tel: </label>       </p> 
       
        <p>  <label for="email">Email: </label>   </p><br/>
        
         <p> <label for="userName"><spring:message code="client.userName"  /> </label>       </p>
        <p> <label for="password"  ><spring:message code="client.password"  /> </label>         </p>
        
       </div>
      
        
       <div id="input">
          <p>  <form:input class="righter"  path="firstName"/>   </p>
          <p>  <form:input class="righter"  id="lastName" path="lastName"/>   </p>
          <p>  <form:input class="righter" path="street"/>            </p>
          <p>  <form:input class="righter" path="city"/>         </p>
          <p>  <form:input class="righter" path="state"/>        </p>
          <p>  <form:input class="righter" path="zip"/>       </p>
          <p>  <form:input class="righter"  path="tel"/>        </p> 
          <p>  <form:input class="righter"  path="email"/>     </p><br/>
           <p>  <form:input class="righter"  path="userName"/>        </p> 
          <p>  <form:input class="righter"  path="password"/>     </p>
        </div>
      
    </div>
 </div>
    <div id="authBtn"> <form:button >Register</form:button></div>
        <p><a id="home" href="ReservationForm"> Cancel</a>
    
    
       
     
    </fieldset>
</form:form>
</body>
</html>