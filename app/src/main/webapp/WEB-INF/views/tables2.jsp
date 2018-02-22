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


	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav">
		<a class="navbar-brand" href="index.html">Start Bootstrap</a>
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarResponsive"
			aria-controls="navbarResponsive" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Dashboard"><a class="nav-link" href="./indexCard.do">
						<i class="fa fa-fw fa-dashboard"></i> <span class="nav-link-text">메인</span>
				</a></li>
				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Menu Levels"><a
					class="nav-link nav-link-collapse collapsed" data-toggle="collapse"
					href="#collapseMulti" data-parent="#exampleAccordion"> <i
						class="fa fa-fw fa-sitemap"></i> <span class="nav-link-text">영수증</span>
				</a>
					<ul class="sidenav-second-level collapse" id="collapseMulti">
						<li><a href="./gotodayreceipt.do"><i
								class="fa fa-fw fa-table"></i> 오늘의 영수증</a></li>
						<li><a href="#"><i class="fa fa-fw fa-area-chart"></i>
								이달의 영수증</a></li>
						<li><a href="./showallreceipt.do"><i class="fa fa-fw fa-file"></i> 나의 영수증
								관리</a></li>

					</ul></li>

				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Components"><a
					class="nav-link nav-link-collapse collapsed" data-toggle="collapse"
					href="#collapseComponents" data-parent="#exampleAccordion"> <i
						class="fa fa-fw fa-wrench"></i> <span class="nav-link-text">나의
							재무설계</span>
				</a>
					<ul class="sidenav-second-level collapse" id="collapseComponents">
						<li><a href="navbar.html">인생 재무설계</a></li>
						<li><a href="cards.html">금융상품광고</a></li>
					</ul></li>


				<li class="nav-item" data-toggle="tooltip" data-placement="right"
					title="Link"><a class="nav-link" href="#"> <i
						class="fa fa-fw fa-link"></i> <span class="nav-link-text">Link</span>
				</a></li>
			</ul>
			<ul class="navbar-nav sidenav-toggler">
				<li class="nav-item"><a class="nav-link text-center"
					id="sidenavToggler"> <i class="fa fa-fw fa-angle-left"></i>
				</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown"
					href="#" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fa fa-fw fa-envelope"></i> <span
						class="d-lg-none">Messages <span
							class="badge badge-pill badge-primary">12 New</span>
					</span> <span class="indicator text-primary d-none d-lg-block"> <i
							class="fa fa-fw fa-circle"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="messagesDropdown">
						<h6 class="dropdown-header">New Messages:</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>David
								Miller</strong> <span class="small float-right text-muted">11:21
								AM</span>
							<div class="dropdown-message small">Hey there! This new
								version of SB Admin is pretty awesome! These messages clip off
								when they reach the end of the box so they don't overflow over
								to the sides!</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>Jane Smith</strong>
							<span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">I was wondering if you
								could meet for an appointment at 3:00 instead of 4:00. Thanks!</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <strong>John Doe</strong> <span
							class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">I've sent the final
								files over to you for review. When you're able to sign off of
								them let me know and we can discuss distribution.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item small" href="#">View all messages</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown"
					href="#" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fa fa-fw fa-bell"></i> <span
						class="d-lg-none">Alerts <span
							class="badge badge-pill badge-warning">6 New</span>
					</span> <span class="indicator text-warning d-none d-lg-block"> <i
							class="fa fa-fw fa-circle"></i>
					</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="alertsDropdown">
						<h6 class="dropdown-header">New Alerts:</h6>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-success">
								<strong> <i class="fa fa-long-arrow-up fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-danger">
								<strong> <i class="fa fa-long-arrow-down fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#"> <span class="text-success">
								<strong> <i class="fa fa-long-arrow-up fa-fw"></i>Status
									Update
							</strong>
						</span> <span class="small float-right text-muted">11:21 AM</span>
							<div class="dropdown-message small">This is an automated
								server response message. All systems are online.</div>
						</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item small" href="#">View all alerts</a>
					</div></li>
				<li class="nav-item">
					<form class="form-inline my-2 my-lg-0 mr-lg-2">
						<div class="input-group">
							<input class="form-control" type="text"
								placeholder="Search for..."> <span
								class="input-group-append">
								<button class="btn btn-primary" type="button">
									<i class="fa fa-search"></i>
								</button>
							</span>
						</div>
					</form>
				</li>
				<li class="nav-item"><a class="nav-link" data-toggle="modal"
					data-target="#exampleModal"> <i class="fa fa-fw fa-sign-out"></i>Logout
				</a></li>
			</ul>
		</div>
	</nav>


	<div class="content-wrapper">
		<div class="container-fluid">
			<!-- Breadcrumbs-->
			
			<!-- Example DataTables Card-->
			<div class="card mb-3">
				<div class="card-header">
					<i class="fa fa-table"></i> 나의 영수증 관리
				</div>
				
				<div class="card-body">
					<div class="table-responsive">
		<form method="post" action="./deleteassetactivities.do">
						<table class="table table-bordered" id="dataTable" width="100%"
							cellspacing="0">
							<thead>
								<tr>
									<th>Account</th>
									<th>Period</th>
									<th>Category</th>
									<th>Content</th>
									<th>Date</th>
									<th>Amount</th>
									<th>Delete</th>
								</tr>
							</thead>
	
							<tbody>
							<c:forEach var="item" items="${list}">
							<tr>
								<th>${item.a_type}</th>
								<th>${item.fixed}</th>
								<th>${item.category_name}</th>
								<th>${item.contents}</th>
								<th>${item.a_date}</th>
								<th>${item.amount}</th>
								<th><input type="checkbox" name="indexnumber" value="${item.indexnumber}"></th>
							</tr>
							</c:forEach>
							</tbody>
						</table>
					
						
					</div>
				</div>
		
				<form method="post" action="./insertBoard.do">
				
<!-- billscontents -->	<%-- <input type="hidden" name="billscontents" value="${list}"> --%>	
				
					<!-- boardid(controller에서 생성),id(session),reg_date(sysdate)
					contents(requestParameter),list정보 담기 
					댓글처리
					-->	
				</form>
				
				
							
<!-- form -->	<form method="post" action="./insertReceipt.do">
								<div class="modal-body">
									<div class="card-body">
										<div class="form-group">
											<div>
												<div class="btn-group btn-group-toggle"
													data-toggle="buttons">
			
												</div>
												<br> <br>
											</div>
										</div>
							
									</div>
								</div>

								
							</form>
						</div>
					</div>
				</div>



				<!-- 수입 -->
				<div class="modal fade" id="income" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">수입</h5>
								<button class="close" type="button" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">×</span>
								</button>
							</div>
							
	<!-- form -->			<form method="post" action="./insertReceipt.do">
	
								<div class="modal-body">
									<div class="card-body">
										<div class="form-group">
											<div>
												<div class="btn-group btn-group-toggle"
													data-toggle="buttons">
													<label class="btn btn-info active"> 
													
	<!-- a_type -->			<input type="hidden" name="a_type" value="income">	
	<!-- fixed  -->			<input type="radio" name="fixed" id="fixed" value="Regular" autocomplete="off" checked> 정기
	
													</label> <label class="btn btn-info"> 
													
							<input type="radio" name="fixed" id="fixed" value="IRRegular" autocomplete="off"> 비정기
													
													</label>
												</div>
												<br> <br>
											</div>
										</div>
										<div class="form-group">
											<label for="exampleInputEmail1">항 목</label> 
											
											<select class="custom-select" name="category_num">
	<!-- category_num  -->						<option selected="">항목을 선택해 주세요.</option>
												<option value="1">식비</option>
												<option value="2">주거/통신</option>
												<option value="3">생활용품</option>
												<option value="4">의복/피복</option>
												<option value="5">건강/문화</option>
												<option value="6">교육/육아</option>
												<option value="7">교통/차량</option>
												<option value="8">경조사/회비</option>
												<option value="9">세금/이자</option>
												<option value="10">용돈/기타</option>
											</select>
										
										</div>

										<div class="form-group">
											<label for="exampleTextarea">내 용</label>
											
	<!-- contents -->		<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 110px;">
							</textarea>
										</div>
										<div class="form-group">
											<label class="control-label">금 액</label>
											<div class="form-group">
												<div class="input-group mb-3">
													
							<input class="form-control" id="amount" name="amount" type="text" aria-describedby="emailHelp" aria-label="Amount (to the nearest dollar)">
	<!-- amount -->												
													<div class="input-group-append">
														<span class="input-group-text">원</span>
													</div>
												</div>
											</div>
										</div>
										<div class="form-group">
											<label for="exampleTextarea">날 짜</label> 
											
	<!-- a_date -->			<input class="form-control" id="a_date" name="a_date" type="date" placeholder="">
										
										</div>
									</div>
								</div>

								<div class="modal-footer">
									<button class="btn btn-secondary" type="button"
										data-dismiss="modal">취소</button>
									<button class="btn btn-primary" type="submit">등록</button>

								</div>
							</form>
						</div>
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
		</div>
</body>

</html>
