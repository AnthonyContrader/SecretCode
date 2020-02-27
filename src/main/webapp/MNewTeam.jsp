
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Homepage for Admin ">
<meta name="author" content="Vittorio Valent">

<title>Home</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/vittoriostyle.css" rel="stylesheet">
</head>

<body>
	<%@include file="css/header.jsp"%>


	<div class="navbar">
		<a class="active" href="/homeadmin.jsp">Home</a> 
		<a href="/user/getall">Users</a>
		<a href="/team/getall" class="">Teams</a>
		<a href="/NewTeam.jsp" class="">NewTeams</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>

	<div class="main">

<form class="login" action="/NewTeam/update" method="post">

      <label for="username">usernamer</label>

      <input type="text" id="username" name="username" placeholder="Insert username" required style="width: 90%;">
 

     <label for="nometeam">nome team</label>

      <input type="text" id="nometeam" name="nometeam" placeholder="Insert nometeam" required style="width: 90%;"> 


      <label for="usertype">team Role</label>
      <input type="text" id="teamRole" name="teamRole" placeholder="Insert Role teAM" required>
   		
<button type="submit" value="update">Modifica</button>
</form>


	
</div>
<br>
<%@ include file="/css/footer.jsp" %>	
</body>
</html>