<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>   
</head>
<body>
<div class="container">
	
    <form method="POST" action="login">        
        <label for="">ID</label>
        <input type="text" name="username" placeholder="ID" required autofocus>
        <label for="">Password</label>
        <input type="password" name="password" placeholder="Password" required>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button type="submit">Sign in</button>
    </form>

</div> <!-- /container -->
</body>
</html>