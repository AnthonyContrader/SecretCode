<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.SecuritypatternDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>Securitypattern Manager</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>

<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="">Users</a>
  <a href="TeamServlet?mode=teamlist" class="">Teams</a>
  <a href="SecuritypatternServlet?mode=securitypatternlist" class="active">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<SecuritypatternDTO> list = (List<SecuritypatternDTO>) request.getAttribute("list");
	%>

<br>

	<table>
		<tr>
			<th>Nome</th>
			<th>Tipo</th>
			<th>Action</th>
		</tr>
		<%
			for (SecuritypatternDTO s : list) {
		%>
		<tr>
			<td><a href=SecuritypatternServlet?mode=read&id=<%=s.getId()%>>
					<%=s.getNome()%>
			</a></td>
			<td><%=s.getTipo()%></td>
			<td><a class="edit" href=SecuritypatternServlet?mode=read&update=true&id=<%=s.getId()%>></a>&nbsp;&nbsp;<!-- Blank fields -->
				<a class="delete" href=SecuritypatternServlet?mode=delete&id=<%=s.getId()%>></a>	<!-- Icon links within themed actions  -->
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="SecuritypatternServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="nome">Nome</label>
    </div>
    <div class="col-75">
      <input type="text" id="nome" name="nome" placeholder="inserisci nome" required style="width: 90%;">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="tipo">Tipo</label>
    </div>
    <div class="col-75">
<div class="col-75">
 			<select id="tipo" name="tipo">
 				<option value="" disabled selected>Selezione Tipo offuscamento</option>
  				<option value="SHA">SHA</option>
  				<option value="MD4">MD4</option>
 
			</select>
    	</div>
    </div>
  </div>
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>