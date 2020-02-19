<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.TeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>read Team</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp" class="active">Home</a>
  <a href="UserServlet?mode=userlist">Users</a> 
  <a href="TeamServlet?mode=teamlist" class="active">Teams</a>
  <a href="SecuritypatternServlet?mode=securitypatternlist" class="">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>

<div class="main">
<%TeamDTO t = (TeamDTO) request.getAttribute("dto");%>


<table>
	<tr> 
		<th>Nometeam</th>
		<th>Descrizione</th>
		<th>Numeroutenti</th>
	</tr>
	<tr>
		<td><%=t.getNometeam()%></td>
		<td> <%=t.getDescrizione()%></td>
		<td> <%=t.getNumeroutenti()%></td>
	</tr>	
</table>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


</div>

<%@ include file="/css/footer.jsp" %>
</body>
</html>