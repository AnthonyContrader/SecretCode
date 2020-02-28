<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="it.contrader.dto.SecuritypatternDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Securitypattern Read">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Read Team</title>
</head>
<body>
	<%@ include file="./css/header.jsp"%>
	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a> 
		<a href="/team/getall" class="">Teams</a>
		<a href="/securitypattern/getall" class="active">Security patterns</a>
		<a href="/NewTeam.jsp" class="">NewTeams</a>
		<a href="/project/getall" class="">Project</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>
	<br>

	<div class="main">
		<%
			SecuritypatternDTO s = (SecuritypatternDTO) request.getSession().getAttribute("dto");
		%>


		<table>
			<tr>
				<th>IDS</th>
				<th>Nome</th>
				<th>Tipo</th>
			</tr>
			<tr>
				<td><%=s.getIds()%></td>
				<td><%=s.getNome()%></td>
				<td><%=s.getTipo()%></td>
			</tr>
		</table>

		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>


	</div>

	<%@ include file="./css/footer.jsp"%>
</body>
</html>