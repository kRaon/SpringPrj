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
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>  -->
  
  <script type="text/javascript">
  $(function(){
	  $('#id').keyup(function() {
			$.ajax({
				type : 'POST',
				url : 'idCompare.do',
				dataType : 'json',
				data : {
					"id" : $('#id').val()
				},
				success : function(data) {
					var flag = data["flag"];
		
						if (flag===true) {
							$('#idcheck').html("");
						} else {
							$('#idcheck').html("check your id");
						}
				 // }); 
				},
				error : function(data) {
					alert("통신실패 : " + data.message);
				}
			}); //end ajax    
		}); //end on    	   
  });
 
  </script>
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Login</div>
      <div class="card-body">
      
        <form id="lobinform" action="./login.do" method="post">
          <div class="form-group">
            <label for="exampleInputEmail1">ID</label>
            <input class="form-control" id="id" name="id" aria-describedby="emailHelp" placeholder="Enter id">
            <span id="idcheck">id check</span>
          </div>
          
          
         <!--  <td class="td1">
					<input type="text" id="business_id" name="business_id" /><br>
				 	<span id="idcheck">사업자번호 중복검사를 해주세요...</span><br> 
				 	<input type="button" id="compare" value="중복검사" />
				 </td> -->
          
          
          
          <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input class="form-control" id="pw" name="pw" type="password" placeholder="Password">
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember Password</label>
            </div>
          </div>
          <input class="btn btn-primary btn-block" type="submit" value="Login"/>
         <!--  <a class="btn btn-primary btn-block" href="login.do">Login</a> -->
        </form>
        
        <div class="text-center">
          <a class="d-block small mt-3" href="gosignup.do">Register an Account</a>
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
