<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Package Setup</title>
</head>
<body>
	<form:form modelAttribute="packages" action="/addPackage" method="post">
		<fieldset>
			<legend>Package Setup</legend>
			 <form:errors path="*" cssStyle="color : red;" />
			<p>
				<label>Events:</label> 
				<select>
					<option value="weeding">Weeding</option>
					<option value="birthday">Birthday</option>
					<option value="meeting">Meeting</option>
				</select>

			</p>
			<p>
				<label for="package">Packages</label> <select path="packageType">
					<!--<c:forEach items="${packagesList}" var="package">
						<option>${package}</option>
					</c:forEach>-->
					<option value="package1">Package1</option>
					<option value="package2">Package2</option>
					<option value="package3">Package3</option>
				</select>

			</p>
			<p>
				<label for="ServiceName">Content Name:</label>
				<form:input id="ServiceName" path="serviceName" type="text" size="50" />
			<div style="text-align: left;">
				<form:errors path="serviceName" cssStyle="color : red;" /> 
 			</div>
			</p>
			
			<p>
				<label for="description">Description:</label>
				<form:textarea id="description" path="description" type="text" rows="5" cols="30" />
				
				<div style="text-align: left;">
				<form:errors path="description" cssStyle="color : red;" /> 
 			</div>
				
			</p>
			
			<p>
				<label>Price:</label>
				<form:radiobutton path="priceType" value="perPerson" />Per Person 
				<form:radiobutton path="priceType" value="Unit" />Unit
				<form:radiobutton path="priceType" value="PerHour" />Per Hour
			</p>
			
			<p>
			
			<table>
				<tr>
					<td>
						<table>
							<thead>
								<tr>
									<th>Name</th>
									<th>Description</th>
									<th>PackageType</th>

								</tr>
							</thead>

						</table>
					</td>
				</tr>
			</table>
			</p>

<p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Continue">
        </p>

		</fieldset>
	</form:form>
</body>
</html>