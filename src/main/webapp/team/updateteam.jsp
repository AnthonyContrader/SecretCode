<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"
import="java.util.List" 
import="it.contrader.dto.TeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>Edit User</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="">Users</a>
   <a href="TeamServlet?mode=teamlist" class="active">Team</a>
   <a href="SecuritypatternServlet?mode=securitypatternlist" class="">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%TeamDTO t = (TeamDTO) request.getAttribute("dto");%>


<form id="floatleft" action="TeamServlet?mode=update&id=<%=t.getId()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="nteam">Nometeam</label>
    </div>
    <div class="col-75">
      <input type="text" id="nometeam" name="nometeam" value=<%=t.getNometeam()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="descr">Descrizione</label>
    </div>
    <div class="col-75">
      <input
			type="text" id="descrizione" name="descrizione" value=<%=t.getDescrizione()%>> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="nutenti">Numeroutenti</label>
    </div>
   		 <div class="col-75">
 			<input
			type="text" id="numeroutenti" name="numeroutenti" value=<%=t.getNumeroutenti()%>>
    	</div>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="/css/footer.jsp" %>	
</body>
</html>