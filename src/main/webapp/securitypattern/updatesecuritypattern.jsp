<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="java.util.List" 
    import="it.contrader.dto.SecuritypatternDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/salvatorestyle.css" rel="stylesheet">
<title>Edit User</title>
</head>
<body>
<%@ include file="/css/header.jsp" %>
<div class="navbar">
  <a href="homeadmin.jsp">Home</a>
  <a href="UserServlet?mode=userlist" class="">Users</a>
  <a href="TeamServlet?mode=teamlist" class="">Team</a>
  <a href="SecuritypatternServlet?mode=Securitypatternlist" class="active">Securitypatterns</a>
  <a href="LogoutServlet" id="logout">Logout</a>
</div>
<br>
<div class="main">

<%SecuritypatternDTO s = (SecuritypatternDTO) request.getAttribute("dto");%>


<form id="floatleft" action="SecuritypatternServlet?mode=update&id=<%=s.getId()%>" method="post">
  <div class="row">
    <div class="col-25">
      <label for="Nteam">Nome</label>
    </div>
    <div class="col-75">
      <input type="text" id="nomee" name="nome" value=<%=s.getNome()%>>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
     <label for="descr">Tipo</label>
    </div>
    <div class="col-75">
      <select id="tipo" name="tipo">
 				<option value="" disabled selected>Selezione Tipo offuscamento</option>
  				<option value="SHA" <%if(s.getTipo().equals("SHA")) {%>selected<%}%>>SHA</option>
  				<option value="MD4" <%if(s.getTipo().equals("MD4")) {%>selected<%}%>>MD4</option>
			</select>
  	</div>
  </div>
      <button type="submit" >Edit</button>
</form>

	
</div>
<br>
<%@ include file="/css/footer.jsp" %>	
</body>
</html>