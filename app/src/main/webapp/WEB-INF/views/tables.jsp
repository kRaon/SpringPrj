<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="js/selectdate.js"></script>
    <script type="text/javascript">
$(function() {
    $('input[name="daterange"]').daterangepicker();
});
</script>
    
 <script type="text/javascript" src="//cdn.jsdelivr.net/jquery/1/jquery.min.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<!-- <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/bootstrap/3/css/bootstrap.css" /> -->
 
<!-- Include Date Range Picker -->
<script type="text/javascript" src="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.js"></script>
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/bootstrap.daterangepicker/2/daterangepicker.css" />


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
  <script> 
    $(function(){
      $("#nav").load("nav.html"); 
    });
    </script> 
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
					<div class="pull-left"><i class="fa fa-table"></i> 오늘의 영수증</div>
					
					<div style="display: inline;" class="pull-right">
					기간선택 : <input type="text" class="form-control" id="daterange" name="daterange" value="" style="margin-left:0.3em; width: 220px; height:30px; display: inline;" />
					</div>
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
								<td>${item.a_type}</td>
								<td>${item.fixed}</td>
								<td>${item.category_name}</td>
								<td>${item.contents}</td>
								<td>${item.a_date}</td>
								<td>${item.amount}</td>
								<td><input type="checkbox" name="indexnumber" value="${item.indexnumber}"></td>
							</tr>
							</c:forEach>
							</tbody>
						</table>
					
	
						
						
						
					</div>
				</div>
		<div>	
					<input class="btn btn-info" style="display: inline-block; width:100px; margin-left: 3.5px" type="submit" value="삭제하기" >
					
		</form>
				
				<div style="padding-left: 3.5%; padding-bottom: 3%; display: inline-block; float: left; ">
					<button class="btn btn-info" data-target="#income"
						data-toggle="modal">수입</button>
					<button class="btn btn-info" data-target="#expense"
						data-toggle="modal">지출</button>
				
				</div>
		</div>
				<form method="post" action="./insertBoard.do">
				
<!-- billscontents -->	<input id="billscontents" type="hidden" name="billscontents" value="${list}">	
				
					<!-- boardid(controller에서 생성),id(session),reg_date(sysdate)
					contents(requestParameter),list정보 담기 
					댓글처리
					-->
					<div>
						<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 3px; margin-bottom: 5px; height: 110px;" placeholder="영수증에 대한 설명을 작성해주세요"></textarea>
					</div>
					<div align="center">
					
	<!-- 날짜 선택 기능. -->
					
					<input class="btn btn-primary btn-block" type="submit" value="글 올리기." style="width: 200px; text-align: center;margin-top: 10px; margin-bottom: 10px;"/>
					</div>
				</form>
				
				
				<!-- 지출-->
				<div class="modal fade" id="expense" tabindex="-1" role="dialog"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">지출</h5>
								<button class="close" type="button" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">×</span>
								</button>
							</div>
							
							
<!-- form -->	<form method="post" action="./insertReceipt.do">
								<div class="modal-body">
									<div class="card-body">
										<div class="form-group">
											<div>
												<div class="btn-group btn-group-toggle"
													data-toggle="buttons">
									<label class="btn btn-info active">
									 
<!-- a_type -->			<input type="hidden" name="a_type" value="expense">	
<!-- fixed -->			<input type="radio" name="fixed" id="fixed" value="Regular" autocomplete="off" checked> 정기
									</label> 
									<label class="btn btn-info"> 
						<input type="radio" name="fixed" id="fixed" value="IRRegular" autocomplete="비정기"> 비정기
									</label>
												</div>
												<br> <br>
											</div>
										</div>
										<div class="form-group">
											<label for="exampleInputEmail1">항 목</label> 
											
<!-- category_num -->			<select class="custom-select" name="category_num">
												
												<option selected="">항목을 선택해 주세요.</option>
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
											
<!-- contents -->			<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 110px;"></textarea>
										
										</div>
										<div class="form-group">
											<label class="control-label">금 액</label>
											<div class="form-group">
												<div class="input-group mb-3">
			
<!-- amount -->			<input class="form-control" id="amount" name="amount" type="text" aria-describedby="emailHelp" aria-label="Amount (to the nearest dollar)">
													
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
											
	<!-- contents -->		<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 110px;"></textarea>
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
			
			  <script> 
    $(function(){
      $("#nav").load("nav.html"); 
    });
    </script> 
   <div id="nav"></div>
		</div>
</body>

</html>