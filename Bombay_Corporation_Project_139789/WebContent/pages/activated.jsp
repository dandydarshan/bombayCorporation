<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bombay Corporation</title>
<style>
body {
	background-color: #1db4c5;
	font-size: large;
	font-color: black;
	font-style: italic;
}
</style>
</head>
<body>
	<c:set var="date" value="<%=new java.util.Date()%>" />
	<hr>
	<a href="index.jsp">Go to Home Page</a>
	<hr>
	<h2>
		Your account activated successfully on
		<fmt:formatDate type="date" value="${date}" pattern="dd-MM-yyyy"
			timeStyle="medium" />
		<fmt:formatDate type="time" value="${date}" timeStyle="medium" />
	</h2>
</body>
</html>