<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" 
	import="java.util.List"
	import="it.contrader.dto.NewTeamDTO"%>

<title>Sign Up</title>

<!-- Bootstrap core CSS -->
<link href="/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/vittoriostyle.css" rel="stylesheet">
</head>


<body class="text-center">


<form class="login" action="/SignUp/insert" method="post">

				<label for="user">Username: </label>
				<input type="text" id="user" name="username" placeholder="Insert username" required> 
		
				<label for="pass">Password: </label>
			
				 <input type="password" id="pass" name="password" placeholder="Insert password" required>
		
		       
             	<input type="hidden" name="usertype" value =USER>
		
		
			<button type="submit" >Registrati</button>
		</form>

</div>
<br>
<%@ include file="/css/footer.jsp" %>
</body>
</html>