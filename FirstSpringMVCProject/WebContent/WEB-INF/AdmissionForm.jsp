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
	<form action="/FirstSpringMVCProject/submitAdmissionForm.html" method="post">
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
				<td>Address: <input type="text" name="address" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>