<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Project</title>
</head>
<body>

<h2>Edit details page</h2>


<form action="../updateproject" method="post">

	ProjectName: <input type="text" name="projectname" value="${project1.projectname}">
	<br><br>
	TechnologyName: <input type="text" name="technologyname" value="${project1.technologyname}">
	<br><br>
	<input type="submit" value="edit project">
	

</form>



</body>
</html>