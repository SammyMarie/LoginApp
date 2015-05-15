<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "style/style.css" rel = "stylesheet" type = "text/css" />
<title>Login Page</title>
</head>
<body>
	<div id = "content">
	
	<form action = "login.do" method = "post">
	<legend>Your Info..</legend>
		<label for = "userName">UserName:</label> <input type = "text" name = "userName"><br />
		<label for = "password">Password:</label> <input type = "password" name = "password"><br />
		
		<input type = "submit" value = "Send">
	</form>
	
	<footer id = "footer">
	 &copy; 2015 NesisTec. Ltd
	</footer>
	</div>
</body>
</html>