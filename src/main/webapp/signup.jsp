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
  <title>Signup</title>
</head>
<body>
   <header style="height: 30px;background-color: yellow;">
   </header>
   
   <div class="container">
   		<img  style="height: 120px" src="https://icon-library.com/images/signup-icon/signup-icon-13.jpg">
   			<img  style="height: 120px" src="https://icon-library.com/images/signup-icon/signup-icon-13.jpg">
   		<img  style="height: 120px" src="https://icon-library.com/images/signup-icon/signup-icon-13.jpg">
   		<hr/>
   		
   		<div style="width: 60%">
   		   <h2>Signup!!</h2>
   		   <hr/>
   		  <span style="color:red;font-size: 18px;font-weight: bold;">${cpapa}</span>
   		<form action="signup" method="POST">
   		          <div class="form-group">
   		          			<label>Username</label>
   		          			 <input type="text" name="username" class="form-control">
   		          </div>
   		 		<div class="form-group">
   		          			<label>Password</label>
   		          			 <input type="password" name="password" class="form-control">
   		          </div>
   		          
   		          <div class="form-group">
   		          			<label>Email</label>
   		          			 <input type="email" name="email" class="form-control">
   		          </div>
   		          
   		          <div class="form-group">
   		          			<label>Mobile</label>
   		          			 <input type="number" name="mobile" class="form-control">
   		          </div>
   		          
   		          <div class="form-group">
   		          			<label>Gender</label>
   		          			 <select  name="gender" class="form-control" style="background-color: #fffff5;width: 50%;">
   		          			     <option>Male</option>
   		          			     <option>Female</option>
   		          			 </select>
   		          </div>
   		          
   		           
   		          <div class="form-group">
   		          			<label> Choose photo</label>
   		          			<input type="file" name="file" id="file" class="form-control" />
   		          		
   		          </div>
   		          
   		          <div class="form-group">
   		          			<label>Address</label>
   		          			 <textarea  name="address" class="form-control"></textarea>
   		          </div>
   		          <hr>
   		          <button type="submit" class="btn btn-primary">Do Signup!!!</button>   	
   		          	<a href="login.jsp">
			<button type="button" class="btn btn-warning">LOGIN PAGE</button>
		</a>	
   		</form>
   		</div>
   
   </div>
   

</body>
</html>