<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
    
<!DOCTYPE html>
<html lang="kr">
<head>
   <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/datatables/jquery.dataTables.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="js/sb-admin-datatables.min.js"></script>
    <script src="js/sb-admin-charts.min.js"></script>
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
  <!-- Page level plugin CSS-->
  <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
  


  	<style>
		.user_id {
    	text-align:right;
		}

 		.container{
 			 position: absolute;
 			 width:50em;
 		}
 		table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
	</style>
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  
  <!-- Navigation-->
  
  
  
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          환영합니다!
        </li>
        <li class="breadcrumb-item active">나의 가계부</li>
      </ol>
      <!-- Icon Cards-->
      <div class="row">
        <div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-info o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-credit-card"></i>
                
              </div>
              <div class="mr-5">이달의 지출</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="./getmonthreceipt.do">
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
        <div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-warning o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-print"></i>
              </div>
              <div class="mr-5">나의 영수증 관리</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="./getallboard.do">
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
        <div class="col-xl-3 col-sm-6 mb-3">
          <div class="card text-white bg-success o-hidden h-100">
            <div class="card-body">
              <div class="card-body-icon">
                <i class="fa fa-fw fa-suitcase"></i>
              </div>
              <div class="mr-5">인생 재무 설계</div>
            </div>
            <a class="card-footer text-white clearfix small z-1" href="./assetcounselorhome.do">
              <span class="float-left">View Details</span>
              <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
            </a>
          </div>
        </div>
       
      </div>
      <!-- Area Chart Example-->
      <div class="card mb-3">
		<canvas id="myAreaChart" width="0%" height="0%"></canvas>
      </div>
      <div class="row">
        <div class="col-lg-12">
          <!-- Example Bar Chart Card-->
          <%-- <div class="card mb-3">
            <div class="card-header">
              <i class="fa fa-bar-chart"></i> 한글 테스트</div>
            <div class="card-body">
              <div class="row">
                <div class="col-sm-8 my-auto">
                  <canvas id="myBarChart" width="100" height="50"></canvas>
                </div>
                <div class="col-sm-4 text-center my-auto">
                  <div class="h4 mb-0 text-primary">$34,693</div>
                  <div class="small text-muted">YTD Revenue</div>
                  <hr>
                  <div class="h4 mb-0 text-warning">$18,474</div>
                  <div class="small text-muted">YTD Expenses</div>
                  <hr>
                  <div class="h4 mb-0 text-success">$16,219</div>
                  <div class="small text-muted">YTD Margin</div>
                </div>
              </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
          </div> --%>
          <!-- Card Columns Example Social Feed-->
          <div class="mb-0 mt-4">
            <i class="fa fa-newspaper-o"></i> News Feed</div>
          <hr class="mt-2">
          <div class="card-columns">
          

	  	<div class = "container">
	  	<c:forEach var="board" items="${list}" >
	  	
	  		 <div class="card mb-3">
              <a href="#">
              <pre>${board.reg_date}</pre> 
               </a>
              
        	<div class="receipt-container">
        		<table>
        		<thead>
        		<th>Account</th>
        		<th>Period</th>
        		<th>Category</th>
        		<th>Content</th>
        		<th>Date</th>
        		<th>Amount</th>
        		</thead>
        		${board.billscontents}
        		</table>
        	</div>
             <hr class="my-0">
              <div class="card-body">
                <p class="card-text small">          
                <div class="user_id" style="float: left; margin-right: 3% ">
              <h8 class="card-title mb-1"><a href="#">${board.id}</a></h8>                            
               </div> ${board.contents}
                </p>
              </div>
              <div class="card-body py-2 small">
                <a class="mr-3 d-inline-block" href="#">
                  <i class="fa fa-fw fa-thumbs-up"></i>Like</a>
               	<c:set value="${board.board_id}" var="boardid"/>
                <a class="mr-3 d-inline-block" href="./getboard.do?boardid=${boardid}">
               
                  <i class="fa fa-fw fa-comment"></i>Comment!!
                </a>

              </div>
               <hr class="my-0">
              <div class="card-footer small text-muted">${board.reg_date}</div>
	  	</div>
	  	</c:forEach>
	  	
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="./loginForm.do">Logout</a>
          </div>
        </div>
      </div>
    </div>
 
  </div>
</body>
  <script> 
    $(function(){
      $("#nav").load("nav.html"); 
    });
    </script> 
   <div id="nav"></div>
</html>
