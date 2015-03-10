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
<div >
<form:form modelAttribute="reservation"  action= "getReservation" method="get">
    <fieldset>
        <legend>Payment Page</legend>
       
    <div class="personalInfo">
   
      <div id="label">
        <p> <label for="firstName"><spring:message code="client.firstName" /> </label> </p>
        <p> <label for="lastName"><spring:message code="client.lastName" /> </label>   </p>
        <p> <label for="street"><spring:message code="client.street" /> </label>       </p>
        <p> <label for="city"><spring:message code="client.city" /> </label>          </p>
        <p> <label for="state"><spring:message code="client.state"  /> </label>       </p>
        <p> <label for="zip"  ><spring:message code="client.zip"  /> </label>         </p>
        
        <p> <label for="tel">Tel: </label>       </p> 
       
        <p>  <label for="email">Email: </label>   </p>
       </div>
      
        
       <div id="input">
          <p>  <form:input class="righter"  path="firstName"/>   </p>
          <p>  <form:input class="righter"  id="lastName" path="lastName"/>   </p>
          <p>  <form:input class="righter" path="street"/>            </p>
          <p>  <form:input class="righter" path="city"/>         </p>
          <p>  <form:input class="righter" path="state"/>        </p>
          <p>  <form:input class="righter" path="zip"/>       </p>
          <p>  <form:input class="righter"  path="tel"/>        </p> 
          <p>  <form:input class="righter"  path="email"/>     </p>
        </div>
     </div> 
    
  <div id="paymentInfo">
    <div id="label">
      Payment method :
      
    
   <p> Card Number: </p>
   <p> Exp Date:</p>
    <p>ccv :</p><br/>
    <p>Your Total: </p> </br>
    </div>
    <div id="input">
      <p> <form:select path="paymentMethod" >
               <form:option value="cardType" lable="CardType"/>
               <form:option value="visa" > Visa</form:option>
               <form:option value="masterCard"> masterCard</form:option>
               <form:option value="americanExpress" label="AmericanExpress" selected="selected"/>
       
             
           </form:select> 
       </p>
       <p> <form:input path="cardNumber"/></p>
      <p> <form:input path="expDate"/></p>
      <p> <form:input path="ccv"/></p><br/>
      <p> <form:input path="total"/></p>
      <p> <form:button id="confirmbtn"> Confirm Payment</form:button></p></br>
    
    </div>
    </div>
    <div id="checkbox"><form:checkbox path="sameAddress"/>
       Check here if billing address is same as home address </div>
    </fieldset>
</form:form>
</div>
</body>
</html>