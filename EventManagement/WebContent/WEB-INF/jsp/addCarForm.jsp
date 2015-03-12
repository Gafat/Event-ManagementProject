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
<title>car rental</title>
</head>
<body>



   <div id="global">
    
  <form:form  modelAttribute="car" action="addCar" enctype="multipart/form-data" >
  <fieldset>
   <legend>Add your cars Here </legend>
   <p>
       <lable><spring:message code="company.name" /> </lable><form:input path="companyName"  />
      <form:errors path="companyName" cssStyle="color:red;" />
   </p>   
 <p>
  <lable><spring:message code="car.type" /> </lable> <form:select path="type">
  <form:option value="compact"> Compact</form:option>
  <form:option value="mid size"> Mid Size</form:option>
  <form:option value="Economy"> Economy</form:option>
  <form:option value="Standard"> Standard</form:option>
  <form:option value="Full Size"> Full Size</form:option>
  </form:select>
</p>
<p>
      <lable><spring:message code="car.numOfSeat" /> </lable><form:input path="numOfPeople" />
      <form:errors path="numOfPeople" cssStyle="color:red;" />
 </p>
 <p>
            <lable> <spring:message code="car.numOfBags" /> </lable><form:input path="numOfBags"/>
           <form:errors path="numOfBags" cssStyle="color:red;" />
 </p>
 <p>
           <lable><spring:message code="car.model" /></lable><form:input path="model"/>
          <form:errors path="model"  cssStyle="color:red;" />
  </p>
  <p>
       <lable><spring:message code="car.numOfCars" /></lable><form:input path="numOfCars"/>
       <form:errors path="numOfCars" cssStyle="color:red;" />
  </p>
  <p>
         <lable><spring:message code="car.price" /></lable><form:input path="price"/>
          <form:errors path="price" cssStyle="color:red;" />
  </p>
  <p>
          <lable><spring:message code="company.state" /></lable><form:input path="state"/>
          <form:errors path="state" cssStyle="color:red;" />
     </p>
     <p>
         <lable><spring:message code="company.city" /></lable><form:input path="city"/>
         <form:errors path="city" cssStyle="color:red;" />
      </p>
      <p>
      <lable><spring:message code="car.image" /></lable>
      <form:input path="image" type="file"/>
      </p>
  
   <p id="buttons">
  <input type="submit" Value="ADD" />  <input type="reset" value="Clear">
 </p>
  </fieldset>
  </form:form>
  </div>
 

</body>
</html>