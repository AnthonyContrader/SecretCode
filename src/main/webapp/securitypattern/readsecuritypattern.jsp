<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.SecuritypatternDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>read Securitypattern</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp" class="active">Home</a>
  <a href="UserServlet?mode=userlist">Users</a> 
  <a href="TeamServlet?mode=teamlist" class="">Teams</a>
  <a href="SecuritypatternServlet?mode=securitypatternlist" class="active">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>

<div class="main">
<%SecuritypatternDTO s = (SecuritypatternDTO) request.getAttribute("dto");%>


<table>
	<tr> 
		<th>Nome</th>
		<th>Tipo</th>
	</tr>
	<tr>
		<td><%=s.getNome()%></td>
		<td> <%=s.getTipo()%></td>
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