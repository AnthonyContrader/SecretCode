<%@ page import="it.contrader.dto.SecuritypatternDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Securitypattern Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Team Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a> 
		<a href="/team/getall" class="">Teams</a>
		<a href="/securitypattern/getall" class="active">Security patterns</a>
		<a href="/NewTeam/getall" class="">NewTeams</a>
			<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<SecuritypatternDTO> list = (List<SecuritypatternDTO>) request.getSession().getAttribute("list");
		%>

		<br>

		<table>
			<tr>
				<th>Nome</th>
				<th>Tipo</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (SecuritypatternDTO s : list) {
			%>
			<tr>
				<td><a href="/securitypattern/read?ids=<%=s.getIds()%>"> <%=s.getNome()%>
				</a></td>
				<td><%=s.getTipo()%></td>
				<td><a href="/securitypattern/preupdate?ids=<%=s.getIds()%>">Edit</a></td>


				<td><a href="/securitypattern/delete?ids=<%=s.getIds()%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/securitypattern/insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="nome">Nome</label>
				</div>
				<div class="col-75">
					<input type="text" id="nome" name="nome"
						placeholder="inserisci nome">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="tipo">Tipo</label>
				</div>
				<div class="col-75">
					<select id="tipo" name="tipo">
						<option value="SSH">SSH</option>
						<option value="MD4">MD4</option>
					</select>
					
				</div>
			</div>
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>