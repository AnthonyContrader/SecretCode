<%@ page import="it.contrader.dto.PartecipanteDTO" 
import="it.contrader.dto.TeamDTO"
 import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Partecipante Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Team Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a class="" href="/user/getall">Users</a>
		<a href="/team/getall" class="active">Teams</a>
		<a href="/securitypattern/getall" class="">Security patterns</a>
		<a href="/partecipante/getall" class="active">Partecipante</a>
			<a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<PartecipanteDTO> list = (List<PartecipanteDTO>) request.getSession().getAttribute("list");
			List<TeamDTO> listT = (List<TeamDTO>) request.getSession().getAttribute("list");
		%>

		<br>

		<table>
			<tr>
				<th>Nickname</th>
				<th>Teamnumero</th>
				<th>Nometeam</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (PartecipanteDTO p : list) 
				{
					for(TeamDTO t : listT) {
			%>
			
			<tr>
				<td><a href="/partecipante/read?idp=<%=p.getIdp()%>"> <%=p.getNickname()%>
				</a></td>
				<td><%=p.getTeamnumero()%></td>
				<td><a href="/team/read?idt=<%=t.getIdt()%>"> <%=t.getNometeam()%></a></td>


				<td><a href="/partecipante/delete?idp=<%=p.getIdp()%>">Delete</a></td>

			</tr>
			<%
				}
				}
			%>
		</table>



		<form id="floatright" action="/partecipante/insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="nick">Nickname</label>
				</div>
				<div class="col-75">
					<input type="text" id="nick" name="nickname"
						placeholder="inserisci nickname">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="descr">Descrizione</label>
				</div>
				<div class="col-75">
					<input type="text" id="teamn" name="teamnumero"
						placeholder="inserisci teamnumero">
				</div>
			</div>
			
			<button type="submit">Insert</button>
		</form>

	</div>
	<br>
	<%@ include file="./css/footer.jsp"%>
</body>
</html>