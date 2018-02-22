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
  <style>
  	#logincheck{
  		text-align: center;
  		color:red;
  		font-size: 0.8em;
  	}
  </style>
  <script>
 	$(function(){
 		$('#id').keydown(function(){
 			$('#logincheck').html("");
 		});
 		$('#pw').keydown(function(){
 			$('#logincheck').html("");
 		});
 	});
  </script>
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div id="logincheck">
      <!-- errorMsg-->
				<c:choose>
					<c:when test="${errorMsg != null }">
						<p>${errorMsg}</p>
					</c:when>
				</c:choose>
      </div>
      <div class="card-body">
      
        <form id="loginform" action="./login.do" method="post">
          <div class="form-group">
            <label for="exampleInputEmail1">ID</label>
            <input class="form-control" id="id" name="id" aria-describedby="emailHelp" placeholder="Enter id" value="${loginid}"required>
          </div>
          
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" id="pw" name="pw" type="password" placeholder="Password" required>
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
            </div>
          </div>
          
          <input id="loginConfirm" class="btn btn-primary btn-block" type="submit" value="Login"/>
         <!--  <a class="btn btn-primary btn-block" href="login.do">Login</a> -->
        </form>
        
        <div class="text-center">
          <a class="d-block small mt-3" href="gosignup.do">Register an Account</a>
          <a class="d-block small mt-3" href="./gosignup.do">Register an Account</a>

          <a class="d-block small" href="forgot-password.do">Forgot Password?</a>
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
