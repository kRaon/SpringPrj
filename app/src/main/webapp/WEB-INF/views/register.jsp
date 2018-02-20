<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container" style="width: 440px">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Register an Account</div>
      <div class="card-body" >
        
        
        
        <form method="post" action="./signup.do">
       
        <div class="form-group" style="width: 745px">
         <div class="form-row">
          <div class="col-md-6">
          	<label>ID</label>
        	<input class="form-control" type="text" name="id" placeholder="Enter your id"/>
          </div>
         </div>
          <div class="form-row">
          <div class="col-md-6">
         	<label>pw</label>
        	<input class="form-control" type="text" name="pw" placeholder="Enter your password"/>
          </div>
		</div>
		 <div class="form-row">
          <div class="col-md-6">
         	<label>age</label>
        	<input class="form-control" type="text" name="age" placeholder="Enter your age"/>
           </div>
         </div>
         <div class="form-row">
          <div class="col-md-6">
          	<label>gender</label>       
        	<input class="form-control" type="text" name="gender" placeholder="Enter your gender"/>
           </div>
         </div>
         <div class="form-row">
           <div class="col-md-6">
           	<label>job</label>
        	<input class="form-control" type="text" name="job" placeholder="Enter your job"/>
           </div>
         </div>
        </div>
        
       	<input type="submit" class="btn btn-primary btn-block" value="Register"/> 
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="login.html">Login Page</a>
          <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>
