<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
#btn {
	font-size: 15px;
	background-color: lightblue;
	border-radius: 15px;
	margin-right: 10px;
}
</style>

<meta charset="UTF-8">
<title>user details</title>
</head>
<body>
	<h1 align="center">change Product Details</h1>


	<form action="${pageContext.request.contextPath }/user" method="post">
		<label>ID :</label> <input type="number" name=id value="${user.id }"><br>
		<label>First Name :</label> <input type="text" name=firstname
			placeholder="Enter the first name" value="${user.firstname }"><br>
		<label>Last Name :</label> <input type="text" name=lastname
			placeholder="Enter  the last name" value="${user.lastname }"><br>
			<label>Date of Birth</label><input type="text" name="date" value="${user.date }">
		<label>Gender :</label> <input type="text" required="required"
			name=gender value="${user.gender }"><br> <label>Email
			:</label> <input type="email" name=email placeholder="Enter the valdi email"
			value="${user.email }"><br>
		<button type="submit" id="btn">update</button>
	</form>
</body>
</html>