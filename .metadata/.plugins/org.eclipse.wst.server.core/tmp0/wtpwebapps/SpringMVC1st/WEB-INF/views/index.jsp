<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Home page showing </h1>
<%
String name=(String)request.getAttribute("name");
out.println("Welcome "+ name +".....!");

List<String> list=(List<String>)request.getAttribute("list");

for(String s:list)
{
%>
<h1><%=s %></h1>
<%}
%>
</body>
</html>