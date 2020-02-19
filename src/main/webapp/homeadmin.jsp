<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.UserDTO"	
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Admin</title>
<link href="css/salvatorestyle.css" rel="stylesheet">
</head>
<body>
<%@include file="css/header.jsp"%>


<div class="navbar">
  <a class="active" href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist">Users</a>
  <a href="TeamServlet?mode=teamlist">Teams</a>
  <a href="SecuritypatternServlet?mode=securitypatternlist">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>

<div class="main" >
<h1 style="color: #39A8E8;" >Welcome <b><u>${user.getUsername()}</u></b></h1> <!-- Prints Welcome + name of user -->
<h1>Cosa Vorresti fare:</h1>
			<br>
			<br>
			<br>
			<a href="NewTeam/NewTeam.jsp" class="attive">
			<button type="submit" value="login" name="pulsante">gestisci new team</button>
			</a>
			<br>
			<br>
			<br>
			<a href="Team.jsp" class="active">
			<button type="submit" value="login" name="pulsante">gestisci team</button>
			</a>
			<br>
			<br>
			<br>
			<a href="Progect.jsp" class="active">
			<button type="submit" value="login" name="pulsante">gestisci progetti</button>
			</a>
<br>
			<br>
			<br>
			 


</div>


<%@ include file="css/footer.jsp" %>

</body>
</html> 