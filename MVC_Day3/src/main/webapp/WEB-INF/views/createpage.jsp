<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green">---Your Data Inserted Successfully ----</h1>
<h2 style="color: pink">Please Click on View Button</h2>
<%-- ${FNAME }
${MNAME }
${LNAME }
${EMAIL}
${PHONE } --%>
${EMPLOYEE_DATA }

<form action="getAll" method="post">

<input type="Submit" value="View">
</form>
</body>
</html>