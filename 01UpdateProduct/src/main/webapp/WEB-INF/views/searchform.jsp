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
	margin-right: 10px;
}
</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="row">
      <div>
         <table>
		<tr>
			<th>id</th>
			<th>First Name</th>
			<th>Last name</th>
			<th>Date of birth</th>
			<th>Gender</th>
			<th>Email</th>
		</tr>
			<tr>
				<td>${id}</td>
				<td>${user.firstname}</td>
				<td>${user.lastname}</td>
				<td>${user.date}</td>
				<td>${user.gender}</td>
				<td>${user.email}</td>
			</tr>
	</table>
     </div>
</div>
	<a href="adduser" style="align-items: center;"><button id="btn">Add
			user</button></a>
	<a href="search"><button id="btn">Search User</button></a>
	<a href="index"><button id="btn">Back</button></a>
</body>
</html>