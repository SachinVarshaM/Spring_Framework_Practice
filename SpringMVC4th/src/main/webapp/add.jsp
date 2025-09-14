<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<%
int a=Integer.parseInt(request.getParameter("txt1")); 
int b=Integer.parseInt(request.getParameter("txt2")); 
out.println("<h1>Addition is :"+(a+b)+"</h1>");


%>
</body>
</html>