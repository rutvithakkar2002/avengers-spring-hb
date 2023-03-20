<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Projects</title>
</head>
<body>

	<h2>List of Projects</h2>

	<table border="1">

		<tr>
			<th>ProjectId</th>
			<th>ProjectName</th>
			<th>TechnologyName</th>
			<th>Action</th>
		</tr>
		
		<c:forEach items="${projects}" var="p">
		<tr>
		
			<td>${p.projectId}</td>
			<td>${p.projectname}</td>
			<td>${p.technologyname}</td>
			<td><a href="deleteproject/${p.projectId}">Delete</a>|
			<a href="editproject/${p.projectId}">Edit</a></td>
			
			
		</tr>
		
		
		
		
		</c:forEach>

	</table>


</body>

</html>