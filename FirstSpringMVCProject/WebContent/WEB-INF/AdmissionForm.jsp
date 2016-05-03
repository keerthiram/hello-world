<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<h1>${headerMessage}</h1>
	<h3>Person Detail Form</h3>
	<form action="/FirstSpringMVCProject/submitAdmissionForm.html"
		method="post">
		<table>
			<tr>
				<td>FirstName : <input type="text" name="firstname" />
				</td>
			</tr>
			<tr>
				<td>LastName : <input type="text" name="lastname">
				</td>
			</tr>

			<tr>
				<td>Address:</td>
			</tr>
			<tr>
				<td>HouseNumber: <input type="text" name="housenumber" />
				</td>
			</tr>

			<tr>
				<td>StreetName: <input type="text" name="address" />
				</td>
			</tr>


			<tr>
				<td>City: <input type="text" name="city" />
				</td>
			</tr>

			<tr>
				<td>State: <input type="text" name="state" />
				</td>
			</tr>

			<tr>
				<td>Pincode/Zipcode: <input type="text" name="pincode" />
				</td>
			</tr>

			<tr>
				<td>PhoneNumber: <input type="text" name="phonenumber" />
				</td>
			</tr>

			<tr>
				<td>ID: <input type="text" name="id"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>