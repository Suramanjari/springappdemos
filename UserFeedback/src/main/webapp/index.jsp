<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<style>
		.center {
	  		text-align: center;
	  	}
	  	
	</style>
</head>

	<div class="center">
		<h1>User Manager</h1>
		
		<h2 class="hello-title">Search for a User and Update Information</h2>
		
		<a href="/feedback">View all feedback</a>
		<br><br>
		<form method="post" action="update">
			Enter an id from the user table: <input type="text" id="id" name="id" placeholder="Type here" required><input type="submit" value="Enter" />
		</form>
	</div>
</body>
</html>