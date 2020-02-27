<<<<<<< Updated upstream

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
		<a href="/securitypattern/getall" class="">Security patterns</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>

	<div class="main">
	<h1 style="color: #39A8E8;" >Welcome <b><u>${user.getUsername()}</u></b></h1> <!-- Prints Welcome + name of user -->
<h1>Cosa Vorresti fare:</h1>
			<br>
			<br>
			<br>
			<a href="/NewTeam.jsp" class="attive">
			<button type="submit" value="login" name="pulsante">gestisci new team</button>
			</a>
			<br>
			<br>
			<br>
			


</div>


<%@ include file="css/footer.jsp" %>

</body>
=======

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
		<a href="/NewTeam/getall" class="">NewTeams</a>
		<a href="/user/logout" id="logout">Logout</a>
	</div>

	<div class="main">
	<h1 style="color: #39A8E8;" >Welcome <b><u>${user.getUsername()}</u></b></h1> <!-- Prints Welcome + name of user -->
<h1>scegli cosa vuoi fare </h1>
			<br>
			<br>
			
		
			<br>
			<br>
			<br>
			


</div>


<%@ include file="css/footer.jsp" %>

</body>
>>>>>>> Stashed changes
</html> 