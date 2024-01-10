<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Student</title>
</head>
<body>
	<form action="edit-student" method="post">
		ID :<input type="text" name="id1" value="${ Student_Edit.id}"><br></br>
		FirstName :<input type="text" name="fname1"
			value="${ Student_Edit.fname}"><br></br> MiddleName :<input
			type="text" name="mname1" value="${ Student_Edit.mname}"><br></br>
		LastName :<input type="text" name="lname1"
			value="${ Student_Edit.lname}"><br></br> Email :<input
			type="text" name="email1" value="${ Student_Edit.email}"><br></br>
		Phone :<input type="text" name="phone1" value="${ Student_Edit.phone}"><br></br>
		<input type="submit" value="Update_Student">

	</form>
</body>
</html>






