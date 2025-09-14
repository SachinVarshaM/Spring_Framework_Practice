<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>Help Page</h1>
<%
String name=(String)request.getAttribute("Name");

out.println("<h1>"+name+"<h1>");

%>
<h1>${Name}</h1>
<h1>${Id}</h1>
</body>
</html>