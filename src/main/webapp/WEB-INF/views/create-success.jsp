<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Success</title>
</head>
<body>
<h1>Welcome to Create Success JSP</h1>
${F_NAME}
${M_NAME}
${L_NAME}
${EMAIL}
${PHONE}

<form action="getAll">
<input type="submit" value="GET_ALL_STUDENT">
</form>


</body>
</html>
