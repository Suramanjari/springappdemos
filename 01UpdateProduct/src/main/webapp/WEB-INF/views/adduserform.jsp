<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1 align="center">Add User Details</h1>


<table>
	<form action="user" method="post">

		<label>First Name :</label> <input type="text" name=firstname
			placeholder="Enter the first name"><br> <label>Last
			Name :</label> <input type="text" name=lastname
			placeholder="Enter  the last name"><br> <label>Date
			Of Birth :</label> <input type="text" name=date placeholder="dd/mm/yyy"><br>
		<label>Gender :</label> <input type="text" required="required" name=gender placeholder="Enter the Gender"><br>
		<label>Email :</label> <input type="email" name=email
			placeholder="Enter the valdi email"><br><br>
		<button type="submit" id="btn">Add User</button>

	</form>
	</table>
</body>
</html>