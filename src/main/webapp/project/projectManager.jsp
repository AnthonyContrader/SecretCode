<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.ProjectDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>User Manager</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>

<div class="navbar">
  <a class="" href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="active">Users</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<div class="main">
	<%
		List<ProjectDTO> list = (List<ProjectDTO>) request.getAttribute("projects");
	%>

<br>

	<table>
		<tr>
			<th>Name</th>
			<th>Url</th>
			<th>Description</th>
		</tr>
		<%
			for (ProjectDTO u : list) {
		%>
		<tr>
			<td><a href=ProjectManagerServlet?mode=read&id=<%=u.getId()%>>
					<%=u.getName()%>
			</a></td>
			<td><%=u.getUrl()%></td>
			<td><%=u.getDescription()%></td>
			<td><a class="edit" href=ProjectManagerServlet?mode=read&update=true&id=<%=u.getId()%>></a>&nbsp;&nbsp;<!-- Blank fields -->
				<a class="delete" href=ProjectManagerServlet?mode=delete&id=<%=u.getId()%>></a>	<!-- Icon links within themed actions  -->
			</td>

		</tr>
		<%
			}
		%>
	</table>



<form id="floatright" action="ProjectManagerServlet?mode=insert" method="post">
  <div class="row">
    <div class="col-25">
      <label for="user">url</label>
    </div>
    <div class="col-75">
      <input type="text" id="user" name="username" placeholder="Insert username" required style="width: 90%;">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="pass">description</label>
    </div>
    <div class="col-75">
      <input type="text" id="pass" name="password" placeholder="Insert password" required style="width: 90%;"> 
    </div>
  </div>
      <button type="submit" >Insert</button>
</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>