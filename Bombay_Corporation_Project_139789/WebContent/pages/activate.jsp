<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bombay Corporation</title>
<style>
body {
	background-color: #abab58;
	font-size: large;
}
</style>
</head>
<body>
	<center>
		<h2>Activate your account</h2>
		<hr>
	<a href="index.jsp">Go to Home Page</a>
	<hr>
		<form action="active" method="POST">
			<table>
				<tr>
					<td align="right">* Email-Id:</td>
					<td><input type="text" name="email"
						pattern="^[A-Za-z0-9.#_&]{2,60}[@][a-z]{2,6}[.][a-z]{2,5}$"
						title="smitakumar@gmail.com max 75 characters" required /></td>
				</tr>
				<tr>
					<td align="right">* Activation Code:</td>
					<td><input type="text" name="actNum" pattern="^[1-9][0-9]{4}$"
						title="5 digits" required /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right"><button
							type="submit">Activate</button>
						<button type="clear">Reset</button></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>