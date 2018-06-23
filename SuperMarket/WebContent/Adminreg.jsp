<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register to Login</title>
</head>
<body>
<form method = "post" action = "SMServlet">
EmpID: <input type = "text" name = "EmpId"/><BR>
EmpName:<input type = "text" name = "EmpName"/><BR>
DeptCode:<input type ="text" name= "DeptCode"/><BR>
DOJ:<input type = "text" name = "DOJ"/><BR>
UserActive:<input type = "text" name = "UserActive"/><BR>
Password:<input type = "text" name = "Password"/><BR>
Register:<input type = "submit" name = "submit"/><BR>
</form>
</body>
</html>