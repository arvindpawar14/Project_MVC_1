<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green">--Inside Create Page---</h1>
<%-- ${FNAME }
${LNAME }
${EMAIL }
${MOBILE} --%>
${GET_ALL_DATA }<br></br>
${GET_ALL_DATA.fname }
${GET_ALL_DATA.lname}
${GET_ALL_DATA.email}
${GET_ALL_DATA.phone}

<form action="getAll">

<input type="Submit" value="View">
</form>
</body>
</html>