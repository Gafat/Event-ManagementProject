<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>Event</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form commandName="hotel" action="searchHotel" method="post">
    <fieldset>
    		<p>
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>
       
        <p>
            <label for="noOfGuest">Number of Guest: </label>
           <form:input path="noOfGuest" />
 	
 		  	<div style="text-align: center;">
 				<form:errors path="noOfGuest" cssStyle="color : red;" /> 
 			</div>
       </p>
       <p>
            <label for="checkInDate">Check-in date: </label>
            <form:input path="checkInDate" id="checkInDate" />
 			<form:errors path="checkInDate" cssStyle="color : red;" /> 
        </p>
         <p>
            <label for="checkOutDate">End Date: </label>
            <form:input path="checkOutDate" id="checkOutDate" />
 			<form:errors path="checkOutDate" cssStyle="color : red;" /> 
        </p>
       
    
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="search Hotels">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
