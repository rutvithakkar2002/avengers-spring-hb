<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Developer and Projects</title>
</head>
<body>

<table border="1">


<tr>

	<th>DeveloperProjectId</th>
	<th>DeveloperId</th>
	
	<th>ProjectId</th>
	
	<th>Action</th>

</tr>

<c:forEach items="${developerpros}" var="dp">
		<tr>
			<td>${dp.devproId }</td>
			<td>${dp.developerId}</td>
			
			<td>${dp.projectId}</td>
			
			<td><a href="/deleteDeveloperPro/${dp.devproId}">Delete</a>|
			<a href="/UpdateDeveloperPro/${dp.devproId}">Edit</a>|
				
			
		</tr>
		</c:forEach>



</table>

<a href="/addDevPro">Assign Project</a>


</body>
</html>