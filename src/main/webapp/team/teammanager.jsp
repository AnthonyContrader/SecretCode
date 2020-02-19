<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.TeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>Team Manager</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>

<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="">Users</a>
  <a href="TeamServlet?mode=teamlist" class="active">Teams</a>
  <a href="SecuritypatternServlet?mode=securitypatternlist" class="">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<TeamDTO> list = (List<TeamDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Nometeam</th>
			<th>Descrizione</th>
			<th>Numeroutenti</th>
			<th>Action</th>
		</tr>
		<%
			for (TeamDTO t : list) {
		%>
		<tr>
			<td><a href=TeamServlet?mode=read&id=<%=t.getId()%>>
					<%=t.getNometeam()%>
			</a></td>
			<td><%=t.getDescrizione()%></td>
			<td><%=t.getNumeroutenti()%></td>
			<td><a class="edit" href=TeamServlet?mode=read&update=true&id=<%=t.getId()%>></a>&nbsp;&nbsp;<!-- Blank fields -->
				<a class="delete" href=TeamServlet?mode=delete&id=<%=t.getId()%>></a>	<!-- Icon links within themed actions  -->
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="TeamServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="nteam">Nometeam</label>
    </div>
    <div class="col-75">
      <input type="text" id="nometeam" name="nometeam" placeholder="Insert nometeam" required style="width: 90%;">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="descr">Descrizione</label>
    </div>
    <div class="col-75">
      <input type="text" id="descrizione" name="descrizione" placeholder="Insert descrizione" required style="width: 90%;"> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="nutenti">Numeroutenti</label>
    </div>
   		 <div class="col-75">
 		<input type="text" id="numeroutenti" name="numeroutenti" placeholder="Insert numeroutenti" required style="width: 90%;">
    	</div>
  </div>
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>