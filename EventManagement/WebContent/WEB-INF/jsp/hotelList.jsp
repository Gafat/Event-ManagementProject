<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Hotel List</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form commandName="hotel" action="continue" method="post">
    <fieldset>
     <legend>choose a hotel</legend>
      
  		     <form:errors path="*" cssStyle="color : red;" /> 
        </p>
       <!--c:forEach items="${hotel}" var="hotel"> -->
    	<img src="hotel.imgName" alt="hotel Image"/>
    		 

        <p>
                 <label for="url"><a href="${hotel.url}">${hotel.name}</a> </label>
        </p>
        <p>
           <label for="description">${hotel.description} </label>
            
          </p>
            
    
   <!--/c:forEach> -->
    
    </fieldset>
</form:form>
</div>
</body>
</html>
