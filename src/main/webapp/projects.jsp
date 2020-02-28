
<%@ page import="it.contrader.dto.ProjectDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Project Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Project Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a class="" href="/user/getall">Users</a> 
		<a href="/team/getall" class="">Teams</a>
		<a href="/NewTeam/getall" class="">NewTeams</a>
		<a href="/securitypattern/getall" class="">Security patterns</a>
		<a href="/project/getall" class="active">Project</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<ProjectDTO> list = (List<ProjectDTO>) request.getSession().getAttribute("list");
		%>

		<br>

		<table>
			<tr>
				<th>Nome</th>
				<th>Descrizione</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (ProjectDTO c : list) {
			%>
			<tr>
				<td><a href="/project/read?idc=<%=c.getIdc()%>"> <%=c.getNome()%>
				</a></td>
				<td><%=c.getDescrizione()%></td>



				<td><a href="/project/delete?idc=<%=c.getIdc()%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/project/insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="n">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id="n" name="nome"
						placeholder="inserisci nome progetto">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="descr">Descrizione</label>
				</div>
				<div class="col-75">
					<input type="text" id="descr" name="descrizione"
						placeholder="inserisci descrizione progetto">
				</div>
			</div>

			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>