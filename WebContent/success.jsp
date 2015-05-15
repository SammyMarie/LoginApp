<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.sammy.model.User" %>
<!DOCTYPE html>
<html>
<head>
<link href = "style/style.css" rel = "stylesheet" type = "text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<div id = "content">
	<h3 align = "center">Login Success!!!</h3>
	
	<jsp:useBean id = "user" class = "com.sammy.model.User" scope = "request">
		<jsp:setProperty property = "userName" name = "user" value = "NewUser"/>
	</jsp:useBean>
	
	<strong>Hello <jsp:getProperty property = "userName" name = "user"/>!</strong>
	
	<footer id = "footer">
	 &copy; 2015 NesisTec. Ltd
	</footer>
</div>
</body>
</html>