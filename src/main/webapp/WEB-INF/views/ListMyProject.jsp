<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List My Project</title>
</head>
<body>
<h3>Developer Name: ${developers.developerName}</h3> <br>

 
 <br> 

<table border="1">
		<tr>
			<th>Developer Id</th>
			<th>Developer Name</th>
			<th colspan="2">Action</th>
		</tr>
		<c:forEach items="${developers.project}" var="p">
		<tr>
			<td>${p.projectId }</td>
			<td>${p.projectname }</td>
			<td>${p.technologyname }</td>
			 
		</tr>
		</c:forEach>
	</table>

</body>
</html>