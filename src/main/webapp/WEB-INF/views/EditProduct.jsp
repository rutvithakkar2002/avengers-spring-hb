<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>


	<h2>Edit Product</h2>
	<br>
	<br>
	<a href="products">Products</a>
	<br>
	<br>

	<!-- jsp contain same name as entity class var -->
	<form action="../updateproduct" method="post" autocomplete="off">

		Name:<input type="text" name="name" value="${product1.name}"><br>
		<br> Price:<input type="text" name="price"
			value="${product1.price}"><br> <br> Quantity:<input
			type="text" name="qty" value="${product1.qty}"><br> <br>
		<input type="submit" value="update Product"> <br>


	</form>



</body>
</html>