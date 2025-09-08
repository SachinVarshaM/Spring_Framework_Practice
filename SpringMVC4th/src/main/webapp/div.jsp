<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division</title>
</head>
<body>
	<h1>
		<%
		out.println("Division :"+request.getAttribute("division"));
		%>

	</h1>
	
	<h2> ${division} </h2>
</body>
</html>