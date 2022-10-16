<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
   <header style="height: 30px;background-color: yellow;"></header>
   
   <div class="container">
   		<img  style="height: 200px" src="https://www.iconpacks.net/icons/1/free-user-login-icon-305-thumb.png">
   		<img  style="height: 200px" src="https://www.iconpacks.net/icons/1/free-user-login-icon-305-thumb.png">
   		<img  style="height: 200px" src="https://www.iconpacks.net/icons/1/free-user-login-icon-305-thumb.png">
   		<hr/>
   		
   		<div style="width: 60%">
   		  <span style="color:red;font-size: 18px;font-weight: bold;">${cpapa} </span>
   		<form action="auth" method="POST">
   		          <div class="form-group">
   		          			<label>Username</label>
   		          			 <input type="text" name="username" class="form-control">
   		          </div>
   		 		<div class="form-group">
   		          			<label>Password</label>
   		          			 <input type="password" name="password" class="form-control">
   		          </div>
   		          <hr>
   		          <button type="submit" class="btn btn-primary">Check!!!</button>   	
   		         
   		          <a href="signup.jsp"> <button type="button" class="btn btn-danger">SIGNUP PAGE</button></a>
		
		<a href="showAllSignups"> <button type="button" class="btn btn-warning">SHOW ALL</button></a>
   		          	
   		</form>
   		</div>
   
   </div>
   

</body>
</html>