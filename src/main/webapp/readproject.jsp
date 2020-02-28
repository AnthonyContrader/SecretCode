
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="it.contrader.dto.ProjectDTO"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Project Read">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Read Project</title>
</head>
<body>
	<%@ include file="./css/header.jsp"%>
	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> <a class=""
			href="/user/getall">Users</a>
			<a href="/NewTeam/getall" class="">NewTeams</a>
			 <a href="/team/getall" class="">Teams</a>
			 <a href="/securitypattern/getall" class="">Security patterns</a>
			 <a href="/project/getall" class="active">Project</a>
			<a href="/user/logout" id="logout">Logout</a>
	</div>
	<br>

	<div class="main">
		<%
			ProjectDTO c = (ProjectDTO) request.getSession().getAttribute("dto");
		%>


		<table>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Descrizione</th>
			</tr>
			<tr>
				<td><%=c.getIdc()%></td>
				<td><%=c.getNome()%></td>
				<td><%=c.getDescrizione()%></td>
			</tr>
		</table>

		<br> <br> <br> <br> <br> <br> <br>
		<br> <br> <br> <br> <br> <br> <br>


	</div>

	<%@ include file="./css/footer.jsp"%>
</body>
</html>