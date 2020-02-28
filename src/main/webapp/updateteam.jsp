
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.contrader.dto.TeamDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Team Edit page">
<meta name="author" content="Vittorio Valent">
<link href="/css/vittoriostyle.css" rel="stylesheet">
<title>Edit Team</title>

</head>
<body>
<%@ include file="./css/header.jsp" %>
<div class="navbar">
  <a href="/homeadmin.jsp">Home</a>
  <a class="" href="/user/getall">Users</a>
  <a href="/team/getall" class="active">Teams</a>
  <a href="/NewTeam/getall" class="">NewTeams</a>
  <a href="/securitypattern/getall" class="">Security patterns</a>
  <a href="/user/logout" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%TeamDTO t = (TeamDTO) request.getSession().getAttribute("dto");%>


<form id="floatleft" action="/team/update" method="post">
  <div class="row">
    <div class="col-25">
      <label for="nteam">Nometeam</label>
    </div>
    <div class="col-75">
      <input type="text" id="nteam" name="nometeam" value=<%=t.getNometeam()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="descr">Descrizione</label>
    </div>
    <div class="col-75">
      <input
			type="text" id="descr" name="descrizione" value=<%=t.getDescrizione()%>> 
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="type">Numeroutenti</label>
    </div>
   		 <div class="col-75">
 			<input
			type="text" id="nutenti" name="numeroutenti" value=<%=t.getNumeroutenti()%>>
    	</div>
    	<input type="hidden" name="idt" value =<%=t.getIdt() %>>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="./css/footer.jsp" %>	
</body>
</html>