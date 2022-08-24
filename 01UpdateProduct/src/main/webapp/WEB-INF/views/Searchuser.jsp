<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style >
#btn {
	font-size: 10px;
	background-color: lightblue;
	padding: 10px;
	border-radius: 15px;
	margin-right: 20px;
	button:center;
}
</style>
<meta charset="UTF-8">
<title>Search user</title>
</head>
<body>
<div align="center">
	<h1>Search user</h1>
		<table>
			<tr>
				<form action="search">
					<input type="text" value="${v.id}" align=center><br> <br><a href="search"><button id="btn">Search
							user</button></a>
				</form>
				<a href="index.jsp"><button id="btn">Back</button></a>
		</table>
		
	</div>
	
</body>
</html>