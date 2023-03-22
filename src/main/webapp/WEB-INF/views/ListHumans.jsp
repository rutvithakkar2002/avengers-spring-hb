<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h3>List Users</h3>
	
	<table border="1">
		<tr>
			
			<th>UserId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>	
			<th>Role</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${humans}" var="h">
		<tr>
			<td>${h.humanId }</td>
			<td>${h.firstName }</td>
			<td>${h.lastName }</td>
			<td>${h.email }</td>
			<td>${h.role.roleName}</td>
			<td><a href="/deletehuman/${h.humanId}">Delete</a></td>
			<td><a href="/updatehuman/${h.humanId}">Edit</a></td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>