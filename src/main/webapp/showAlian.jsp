<%@page import="com.pearl.model.Alian"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
 
 <%
 	Alian a1 = (Alian)request.getAttribute("alian");
 
 	out.println(a1);
 
 %>
 
</body>
</html>