<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green"> Successfully Login </h1>
<h1>Please Fill Following Details</h1>
<form action="createdata" method="post">
FirstName <input type="text" name="fname" placeholder="Enter FirstName"><br></br>
MiddleName <input type="text" name="mname" placeholder="Enter MiddleName"><br></br>
LastName <input type="text" name="lname" placeholder="Enter LastName"><br></br>
Email <input type="text" name="email" placeholder="Enter email"><br></br>
Phone <input type="text" name="phone" placeholder="Enter PhoneNumber"><br></br>
<input type="Submit" value="Submit">
</form>
</body>
</html>