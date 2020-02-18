<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="true" %>
<html>
<head>
<link href="css/salvatorestyle.css" rel="stylesheet">

<title>Sign Up Sample Project</title>
</head> 
<body >

		<form class="login" action="SignUpServlet?cx=3" method="post">

				<label for="user">Username: </label>
				<input type="text" id="user" name="username" placeholder="Insert username" required> 
		
				<label for="pass">Password: </label>
			
				 <input type="password" id="pass" name="password" placeholder="Insert password" required>
		
			<button type="submit" value="Login" name="pulsante">Registrati</button>
		</form>

	
</body>
</html>