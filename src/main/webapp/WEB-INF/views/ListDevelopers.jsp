<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Developers</title>
</head>
<body>

	<h2>Developer list</h2>

	<table border="1">

		<tr>
			<th>DeveloperId</th>
			<th>DeveloperName</th>
			<th>Action</th>

		</tr>

		<c:forEach items="${developer}" var="d">
			<tr>
				<td>${d.developerId}</td>
				<td>${d.developerName}</td>
				<td><a href="deletedeveloper/${d.developerId}">Delete</a>| <a
					href="editdeveloper/${d.developerId}">Edit</a></td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>