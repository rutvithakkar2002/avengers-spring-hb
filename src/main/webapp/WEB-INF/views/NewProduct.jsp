<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>

		<h2>New Product</h2><br><br>
		<a href="products">Products</a><br><br>
	
	<!-- jsp contain same name as entity class var -->
	<form action="saveproduct" method="post">

		Name:<input type="text" name="name"><br> <br>
		Price:<input type="text" name="price"><br> <br> 
		Quantity:<input type="text" name="qty"><br> <br> 
		<input type="submit" value="Add Product"> <br>
		
	

	</form>


</body>
</html>