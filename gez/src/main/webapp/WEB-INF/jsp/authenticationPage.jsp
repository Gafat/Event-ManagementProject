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

<form:form modelAttribute="reservation"  action="authenticate" method="POST">
 <fieldset>
    <legend><spring:message code="Authentication-Page"/></legend>
     <div class="authPersonalInfo">
   
      <div id="label">
        <p> <label for="userName"><spring:message code="client.userName" /> </label> </p>
        <p> <label for="password"><spring:message code="client.password" /> </label>   </p>
        
       </div>
      
        
       <div id="input">
          <p>  <form:input class="righter"  path="userName"/>   </p>
          <p>  <form:input class="righter"  id="lastName" path="password"/>   </p>
         
        </div>
        <div id="authBtn"> <form:button ><spring:message code="Login"/></form:button></div>
        <p><a id="home" href="ReservationForm"><spring:message code="Home"/></a>
     </div> 
 </fieldset>        
</form:form>



</body>
</html>