<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action = "RegisterServlet">
Flight Name: <input type = "text" name = "FlightName"/>
Source:<input type = "text" name = "Source"/>
Destination:<input type = "text" name = "Destination"/>
Fare:<input type = "text" name = "Fare"/>
No of Seats:<input type = "text" name = "NoofSeats"/>
Aircraft Name:<input type = "text" name = "AircraftName"/>
Book:<input type = "submit" name = "submit"/>

</form>
</body>
</html>