<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.SecuritypatternDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Securitypattern Edit page">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Edit Team</title>

</head>
<body>
<%@ include file="./css/header.jsp" %>
<div class="navbar">
  <a href="/homeadmin.jsp">Home</a>
  <a href="/user/getall">Users</a>
  <a href="/team/getall" class="">Teams</a>
  <a href="/securitypattern/getall" class="active">Security patterns</a>
  <a href="/NewTeam.jsp" class="">NewTeams</a>
  <a href="/user/logout" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%SecuritypatternDTO s = (SecuritypatternDTO) request.getSession().getAttribute("dto");%>


<form id="floatleft" action="/securitypattern/update" method="post">
  <div class="row">
    <div class="col-25">
      <label for="nome">Nome</label>
    </div>
    <div class="col-75">
      <input type="text" id="nome" name="nome" value=<%=s.getNome()%>>
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
    <input type="hidden" name="ids" value =<%=s.getIds() %>>
  </div>
  
      <button type="submit">Edit</button>
</form>

	
</div>
<br>
<%@ include file="./css/footer.jsp" %>	
</body>
</html>