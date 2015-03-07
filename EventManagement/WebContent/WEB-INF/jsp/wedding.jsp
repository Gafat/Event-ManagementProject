<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wedding</title>
</head>
<body>
     
     <div id="weddingRegistration">
     
     <form:form commandName="wedding" action="/weddingR" >
      <fieldset>
      <legend>Wedding Registration Form</legend>
      <p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>
      <p class="displayedName"><label for="startDate">start date:</label>
       <input type="text" size="20"/>(MM-DD-YYY)<br/>
       
       </p>
       <p>
       <label for="endDate">end date</label>
       <input type="text" size="20"/>(MM-DD-YYY)
       </p>
       
         
      <p><label for="country">Country: </label>
      <select>
      <c:forEach items="${countrys}" var="country">
        <option>${country}</option>
      </c:forEach>
      </select>
      <label for="state">State</label>
      <select>
      <c:forEach items="${states}" var="state">
        <option>${state}</option>
      </c:forEach>
      </select>
      <label for="city">City</label>
      <input type="text" size="20"/><form:errors path="city" cssStyle="color: red;"/>
      </p>
      
   		 <p>
   		 <label for="numberOfAttendants">Number of Attendatns</label>
   		 	<select id="attendants" name="NumberOfAttendants">
   		 	  <option>less than 50</option>
   		 	  <option> from 51 to 100</option>
   		 	  <option> from 101 to 200</option>
   		 	  <option> from 201 to 400</option>
   		 	  <option>greater than 400</option>
   		 	</select>
   		 </p>
      <p>
        <label for="budget">Budget</label>
        <input type="text" size="20"/><form:errors path="budget" cssStyle="color:red;"/>
      </p>
      
      </fieldset>
       <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Continue">
        </p>
     </form:form>
     
     </div>
</body>
</html>