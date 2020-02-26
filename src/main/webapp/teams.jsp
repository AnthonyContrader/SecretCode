<%@ page import="it.contrader.dto.TeamDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Team Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Team Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> <a class=""
			href="/user/getall">Users</a> <a href="/team/getall" class="active">Teams</a>
			<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<TeamDTO> list = (List<TeamDTO>) request.getSession().getAttribute("list");
		%>

		<br>

		<table>
			<tr>
				<th>Nometeam</th>
				<th>Descrizione</th>
				<th>Numeroutenti</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (TeamDTO t : list) {
			%>
			<tr>
				<td><a href="/team/read?id=<%=t.getIdt()%>"> <%=t.getNometeam()%>
				</a></td>
				<td><%=t.getDescrizione()%></td>
				<td><%=t.getNumeroutenti()%></td>
				<td><a href="/team/preupdate?id=<%=t.getIdt()%>">Edit</a></td>


				<td><a href="/team/delete?id=<%=t.getIdt()%>">Delete</a></td>

			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/team/insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="nteam">Nometeam</label>
				</div>
				<div class="col-75">
					<input type="text" id="nteam" name="nometeam"
						placeholder="inserisci nometeam">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="descr">Descrizione</label>
				</div>
				<div class="col-75">
					<input type="text" id="descr" name="descrizione"
						placeholder="inserisci descrizione">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="nutenti">numeroutenti</label>
				</div>
				<div class="col-75">
					<input type="text" id="nutenti" name="numeroutenti"
					placeholder="inserisci numeroutenti">
						

				</div>
			</div>
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>