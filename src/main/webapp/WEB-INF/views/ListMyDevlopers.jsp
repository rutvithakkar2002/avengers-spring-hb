<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List My Developers</title>
</head>

<body>

 <h3>projectName:  ${project.projectname}</h3> 
 
 <table border="1">
		<tr>
			<th>Developer Id</th>
			<th>Developer Name</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${project.developers}" var="p">
		<tr>
			<td>${p.developerId }</td>
			<td>${p.developerName }</td>
		 
		 
			<td><a href="/UpdateDeveloper/${p.developerId}">Edit</a></td>
			 
		</tr>
		</c:forEach>
	</table>
</body>
</html>