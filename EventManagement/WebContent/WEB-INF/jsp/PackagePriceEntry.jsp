<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="packagePrice" action="/addPackagePrice" method="post">
		<fieldset>
			<legend>Package Setup</legend>
			<form:errors path="*" cssStyle="color : red;" />
			<p>
				<label>Service Providers:</label> <select>
					<option value="abc">abc Trading</option>
					<option value="Alps">Alps Weeding Planning</option>
					<option value="Europa">Europa Retreat</option>
				</select>

			</p>
			<p>
				<label>Events:</label> <select>
					<option value="weeding">Weeding</option>
					<option value="birthday">Birthday</option>
					<option value="meeting">Meeting</option>
				</select>

			</p>
			<p>
				<label for="package">Packages</label> <select>
					<option value="package1">Package1</option>
					<option value="package2">Package2</option>
					<option value="package3">Package3</option>
				</select>

			</p>

			

			<p>
				<label for="price">Price:</label>
				<form:input id="price" path="price" type="text" size="50" />
			</p>


		</fieldset>

	</form:form>
</body>
</html>