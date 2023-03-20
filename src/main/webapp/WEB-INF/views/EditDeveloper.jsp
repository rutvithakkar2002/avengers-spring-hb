<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"		%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Developer</title>
</head>
<body>

	
	<!-- jsp contain same name as entity class var -->
	<form action="../updateDeveloper" method="post" autocomplete="off">

		DeveloperName:<input type="text" name="developerName" value="${developer1.developerName}"><br>
		<br> 
		<input type="submit" value="update"> <br>


	</form>
	

</body>

</html>