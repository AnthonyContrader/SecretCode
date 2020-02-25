<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.NewTeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>User insert</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>

<div class="navbar">
  <a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/user/getall">Users</a> <a href="/user/logout" id="logout">Logout</a>
	</div>
<div class="main">


		<form class="login" action="/SignUp/insert" method="post">

				<label for="user">Username: </label>
				<input type="text" id="user" name="username" placeholder="Insert username" required> 
		
				<label for="pass">Password: </label>
			
				 <input type="password" id="pass" name="password" placeholder="Insert password" required>
		
		       
             	<input type="hidden" name="usertype" value =USER>
		
		
			<button type="submit" >Registrati</button>
		</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>