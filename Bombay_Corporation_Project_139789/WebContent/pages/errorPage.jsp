<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
<style>
	body{
	background-color:#dc4823;
	font-size:larger;
	color:black;
	}
</style>
</head>
<body>
<h3>${errMsg}</h3>
<hr>
	<img alt="errorPage" src="images/error.jpg"/>
	<hr>
	<a href="index.jsp">Go to Home Page</a>

</body>
</html>