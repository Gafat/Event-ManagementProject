<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Providers</title>
</head>
<body>
	<form:form modelAttribute="providers"  action= "addBook" method="post">
		<fieldset>
			<legend>Service Providers</legend>
			
			<p>
				<label for="companyName">Company Name:</label>
				<form:input id="companyName" path="companyName" type="text" />
			</p>
			<p>
				<label>Services:</label> 
				<select id="serviceType">
					<option value="weeding">Weeding</option>
					<option value="birthday">Birthday</option>
					<option value="Meeting">Meeting</option>
				</select>

			</p>
			<p>
				<label for="serviceDescription">Service Description:</label>
				<form:textarea id="serviceDescription" path="serviceDescription" type="text" rows="4" cols="30"/>
			</p>
			<p>
				<label for="street">Street:</label>
				<form:input id="street" path="street" type="text" />
			</p>
			<p>
				<label for="city">City:</label>
				<form:input id="city" path="city" type="text" />
			</p>
			<p>
				<label for="zipCode">Zip Code:</label>
				<form:input id="zipCode" path="zipCode" type="text" />
			</p>
			<p>
				<label for="state">State:</label>
				<form:input id="state" path="state" type="text" />
			</p>
			<p>
				<label for="note">Any Notes:</label>
				<form:textarea id="note" path="note" type="text" cols="30" rows="5" />
			</p>
			<p>
            <input id="reset" type="reset">
            <input id="submit" type="submit" value="Add Service Providers">
        </p>		
						


		</fieldset>
	</form:form>
</body>
</html>