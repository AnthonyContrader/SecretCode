<%@ page  import="it.contrader.dto.PairDTO" import="it.contrader.dto.UserDTO" import="it.contrader.dto.TeamDTO" import="java.util.*"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="User Management">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>User Manager</title>

</head>
<body>
	<%@ include file="./css/header.jsp"%>

	<div class="navbar">
		<a href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a>
          <a href="/NewTeam/getall" class="active">NewTeams</a>
			<a href="/team/getall" class="">Teams</a>
			<a href="/securitypattern/getall" class="">Security patterns</a>
			<a href="/project/getall" class="">Project</a>
			 <a href="/user/logout" id="logout">Logout</a>
	</div>
	<div class="main">
		<%
			List<PairDTO<UserDTO, TeamDTO, String>> list = (List<PairDTO<UserDTO, TeamDTO, String>>) request.getSession().getAttribute("list");
		%>

		<br>

		<table>
			<tr>
				<th>username</th>
				<th>nome team</th>
				<th>teamrole</th>
				<th></th>
				<th></th>
			</tr>
			<%
				for (PairDTO<UserDTO, TeamDTO, String> pair : list) {
			%>
			<tr>
				<td><a href="/NewTeam/read?id=<%=pair.getDto0().getId()%>"> <%=pair.getDto0().getUsername()%>
				</a></td>
				<td><%=pair.getDto1().getNometeam()%></td>
				<td><%=pair.getData()%></td>
			<td><a href="/NewTeam/update?id=<%=pair.getDto0().getId()%>">Edit</a></td>


				<td><a href="/NewTeam/delete?id=<%=pair.getDto0().getId()%>">Delete</a></td>
			
			</tr>
			<%
				}
			%>
		</table>



		<form id="floatright" action="/NewTeam/insert" method="post">
			<div class="row">
				<div class="col-25">
					<label for="username">username</label>
				</div>
				<div class="col-75">
					<input type="text" id="username" name="username"
						placeholder="inserisci username">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="nometeam">Nome Team</label>
				</div>
				<div class="col-75">
					<input type="text" id="nometeam" name="nometeam"
						placeholder="inserisci nometeam">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="type">teamrole</label>
				</div>
				<div class="col-75">
					<select id="teamRole" name="teamRole">
						<option value="ADMIN">ADMIN</option>
						<option value="USER">USER</option>

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