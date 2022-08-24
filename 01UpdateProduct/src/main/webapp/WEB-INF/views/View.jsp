<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
tr:nth-child(even) {
	background-color: #dddddd;
}
#btn {
	font-size: 15px;
	background-color: lightblue;
	border-radius: 15px;
	margin-right: 5px;
}
</style>
<meta charset="UTF-8">
<title>View User Details</title>
</head>
<body>
	<h1 align="center">Welcome to User Details Portal</h1>
	<table>
		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Last name</th>
			<th>Date of birth</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${users}" var="v">
			<tr>
				<td>${v.id}</td>
				<td>${v.firstname}</td>
				<td>${v.lastname}</td>
				<td>${v.date}</td>
				<td>${v.gender}</td>
				<td>${v.email}</td>
				<td><a href="delete/${v.id }"><button id="btn">Delete</button></a>
					<a href="update/${v.id }"><button id="btn">Edit</button></a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="adduser" style="align-items: center;"><button id="btn">Add
			user</button></a>
	<a href="search"><button id="btn">Search User</button></a>
	<a href="index"><button id="btn">Back</button></a>

</body>
</html>