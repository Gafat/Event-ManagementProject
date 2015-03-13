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

<div id="mainBody">
<fieldset>
  <legend><spring:message code="exceptionTitle"/></legend>
<h1>  You are In trouble - in Exception</h1>
<p>${exceptionMsg}</p>

<form:form commandName="exceptionMsg" action="authenticationPage" method="GET">
<form:button>Try Login again</form:button>
</form:form>  <br/>


<form:form commandName="exceptionMsg" action="registerationForm" method="GET">
<form:button>Register</form:button>
</form:form>
 <br/>

<form:form commandName="exceptionMsg" action="ReservationForm" method="GET">
<form:button>Home</form:button>
</form:form>
</fieldset>
</div>
<br/>
</body>
</html>