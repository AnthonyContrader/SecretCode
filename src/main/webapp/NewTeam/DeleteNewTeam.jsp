<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.NewTeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>Delete team User</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="active">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>
<div class="main">

<form class="login" action="/JspApp/NewTeamServlet?var=delete" method="post">

      <label for="iduser">id user</label>

      <input type="number" id="iduser" name="iduser" placeholder="Insert iduser" required style="width: 90%;">
 

     <label for="idteam">id team</label>

      <input type="number" id="idteam" name="idteam" placeholder="Insert idteam" required style="width: 90%;"> 

   		
<button type="submit" value="delete" name="var">Cancella</button>
</form>

	
</div>
<br>
<%@ include file="/css/footer.jsp" %>	
</body>
</html>