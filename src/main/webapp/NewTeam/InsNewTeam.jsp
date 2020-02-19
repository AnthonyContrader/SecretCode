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
  <a class="" href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="active">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>




<form class="login" action="/JspApp/NewTeamServlet?var=insert" method="post">

      <label for="iduser">id user</label>

      <input type="number" id="iduser" name="iduser" placeholder="Insert iduser" required style="width: 90%;">
 

     <label for="idteam">id team</label>

      <input type="number" id="idteam" name="idteam" placeholder="Insert idteam" required style="width: 90%;"> 


      <label for="usertype">Usertype</label>
      <input type="text" id="usertype" name="usertype" placeholder="Insert usertype" required>
   		
<button type="submit" value="insert" name="var">Inserisci</button>
</form>

<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>