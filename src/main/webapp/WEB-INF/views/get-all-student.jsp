<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GET_ALL_DATA</title>
</head>
<body>
	<h1 style="color: red">Get All data From Student</h1>

	<table border=1>
		<thead>
			<tr>

				<th style="color: green">FirstName</th>
				<th style="color: green">MiddleName</th>
				<th style="color: green">LastName</th>
				<th style="color: green">Email</th>
				<th style="color: green">Phone</th>
				<th style="color: green">Action</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${STD_LIST}" var="student">
				<tr>

					<td><c:out value="${student.fname}" /></td>
					<td><c:out value="${student.mname}" /></td>
					<td><c:out value="${student.lname}" /></td>
					<td><c:out value="${student.email}" /></td>
					<td><c:out value="${student.phone}" /></td>

					<td><a href="edit?id=<c:out value='${student.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?id=<c:out value='${student.id}' />">Delete</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>