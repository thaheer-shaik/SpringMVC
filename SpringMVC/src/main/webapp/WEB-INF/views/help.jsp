<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is a help page</title>
</head>
<body>

	<%-- <%
		String name=(String)request.getAttribute("name");
		Integer rollno=(Integer)request.getAttribute("rollno");
	%> --%>

	<%-- <h1>Hello, My Name is <%=name %></h1>
	<h1>My roll no is <%=rollno %></h1> --%>
	
	<h1> My name is ${name}</h1>
	<h1> My roll no is ${rollno}</h1>
	
</body>
</html>