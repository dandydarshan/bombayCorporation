<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bombay Corporation</title>
<style>
body {
	background-color: #b782f7;
}
</style>
</head>
<body>
	<center>
		<h1>Register New User</h1>
		<hr>
	<a href="index.jsp">Go to Home Page</a>
	<hr>
		<h3>On Submission, you will receive a verification code for
			activation</h3>
		<form action="register" method="POST">
			<table>
				<tr>
					<td colspan="2"><pre>                  First Name                  MiddleName                   Last Name</pre></td>
				</tr>
				<tr>
					<th align="right">* Name:</th>
					<td><input type="text" name="first"
						pattern="^[A-Z][a-z]{2,30}$" title="Upper Camel max 31 characters"
						required /> <input type="text" name="middle"
						pattern="^[A-Z][a-z]{2,30}$" title="Upper Camel max 31 characters" />
						<input type="text" name="last" pattern="^[A-Z][a-z]{2,30}$"
						title="Upper Camel max 31 characters" required /></td>
				</tr>
				<tr>
					<th align="right">* Business Name:</th>
					<td><input type="text" name="business"
						pattern="^[A-Z][A-Za-z0-9 ]{2,99}"
						title="Upper Camel max 100 characters" required /></td>
				</tr>
				<tr>
					<th align="right">* Email-Id:</th>
					<td><input type="text" name="email"
						pattern="^[A-Za-z0-9.#_&]{2,60}[@][a-z]{2,6}[.][a-z]{2,5}$"
						title="Smitakumar@gmail.com max 75 characters" required /></td>
				</tr>
				<tr>
					<th align="right">* Mobile No:</th>
					<td><input type="text" name="phone" pattern="^[7-9][0-9]{9}$"
						title="digits only max 10 digits" required /></td>
				</tr>
				<tr>
					<th colspan="2" align="right"><button type="submit">Register</button>
						<button type="clear">Reset</button></th>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>