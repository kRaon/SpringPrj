<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<!-- Bootstrap core JavaScript-->
			<script src="vendor/jquery/jquery.min.js"></script>
			<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
			<!-- Core plugin JavaScript-->
			<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
			<!-- Page level plugin JavaScript-->
			<script src="vendor/datatables/jquery.dataTables.js"></script>
			<script src="vendor/datatables/dataTables.bootstrap4.js"></script>
			<!-- Custom scripts for all pages-->
			<script src="js/sb-admin.min.js"></script>
			<!-- Custom scripts for this page-->
			<script src="js/sb-admin-datatables.min.js"></script>
<title>오늘의 영수증</title>
<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom fonts for this template-->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">
<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">

<link href="css/custombtn.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">


	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
				<li class="breadcrumb-item active">Tables</li>
			</ol>
			<!-- Example DataTables Card-->
			<div class="card mb-3">
				<div class="card-header">
					<i class="fa fa-table"></i> 인생 재무설계
				</div>

				<div class="card-body">
					<div class="table-responsive">
						<form method="post" action="./assetcounselor.do">
							근속년수<input type="number" name="untilyear" placeholder="ex) 30">
							임금상승률<input type="number" name="increaserate"> 저축률<input
								type="number" name="savingrate"> 자본수익률<input
								type="number" name="interestrate"> <input
								class="btn btn-info"
								style="display: inline-block; width: 100px; margin-left: 3.5px"
								type="submit" value="내 정보 입력">

						</form>


						
<!-- 여기야 -->
						
								<table class="w3-table w3-striped">
									<thead>
										<th>연령</th>
										<th>연소득</th>
										<th>가처분소득</th>
										<th>자본금</th>
										<th>나의 자산</th>
									</thead>
									<c:forEach var="data" items="${list}">
										<tr>
											<td>${data.age}</td>
											<td>${data.income}</td>
											<td>${data.disposable }</td>
											<td>${data.fund }</td>
											<td>${data.assetsum }</td>
										</tr>
									</c:forEach>
								</table>
							
<!-- 여기야 -->						
					</div>
				</div>

			</div>
			<!-- /.container-fluid-->
			<!-- /.content-wrapper-->
			<!-- Scroll to Top Button-->
			<a class="scroll-to-top rounded" href="#page-top"> <i
				class="fa fa-angle-up"></i>
			</a>
			<!-- Logout Modal-->
			<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
				aria-labelledby="exampleModalLabel" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h5 class="modal-title" id="exampleModalLabel">Ready to
								Leave?</h5>
							<button class="close" type="button" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">×</span>
							</button>
						</div>
						<div class="modal-body">Select "Logout" below if you are
							ready to end your current session.</div>
						<div class="modal-footer">
							<button class="btn btn-secondary" type="button"
								data-dismiss="modal">Cancel</button>
							<a class="btn btn-primary" href="./loginForm.do">Logout</a>
						</div>
					</div>
				</div>
			</div>
			
		</div>
		 <script> 
    $(function(){
      $("#nav").load("nav.html"); 
    });
    </script> 
   <div id="nav"></div>
</body>

</html>