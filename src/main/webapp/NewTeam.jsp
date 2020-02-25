<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.List"
	import="it.contrader.dto.UserDTO"	
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Admin NewTeam</title>
<link href="css/salvatorestyle.css" rel="stylesheet">
</head>
<body>


<div class="navbar">
  <a href="/homeadmin.jsp">Home</a> <a class="active"
			href="/user/getall">Users</a> <a href="/user/logout" id="logout">Logout</a>
	</div>
<div class="main">
<h1 style="color: #39A8E8;" >Cosa vuoi fare <b><u>${user.getUsername()}</u></b></h1> <!-- Prints Welcome + name of user -->
	
	
		<br>
			<br>
			<br>
			<a href="/InsNewTeam.jsp" class="active">
			<button type="submit" value="login" name="pulsante">Inserisci nuovo membro</button>
			</a>
			<br>
			<br>
			<br>
			<a href="/MNewTeam.jsp" class="active">
			<button type="submit" value="login" name="pulsante">Modifica ruolo membro</button>
			</a>
            <br>
            <a href="/DeleteNewTeam.jsp" class="active">
			<button type="submit" value="login" name="pulsante">elimina membro</button>
			</a>
			<br>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>