<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
          <a href="#">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">My Dashboard</li>
      </ol>
 
      <!-- Area Chart Example-->
      <div class="card mb-3">
		<canvas id="myAreaChart" width="0%" height="0%"></canvas>
      </div>
      <div class="row">
        <div class="col-lg-12">
          <!-- Example Bar Chart Card-->
          
          <!-- Card Columns Example Social Feed-->
          <div class="mb-0 mt-4">
            <i class="fa fa-newspaper-o"></i> News Feed</div>
          <hr class="mt-2">
          <div class="card-columns">
          
	  	
	  	<div class = "container">
	  		 <div class="card mb-3">
              
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
	<form method="post" action="./insertcomments.do">
	  	<div>
	  	<!-- boardid --><input type="hidden" name="board_id" value="${boardid}">	
			<textarea class="form-control" name="contents" id="contents" rows="3" style="margin-top: 3px; margin-bottom: 5px; width:650px; height: 110px; display:inline; float: left;" placeholder="영수증에 대한 댓글을 달아주세요. 욕설 및 비방은 자제하시길 바랍니다."></textarea>
			<input class="btn btn-primary btn-block" type="submit" value="댓글 달기." style="width: 100px; height: 100px; text-align: center; margin-top: 10px; margin-bottom: 10px; display:inline; float: right;"/>
		</div>
	</form>
	  	
	  	<!-- 
	  	<div class = "container">
	  		 <div class="card mb-3">
              
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
	  	 -->
	  	

		<div class="card_mb3">
		<c:forEach var="item" items="${commentslist}" >
			<table>
				<tr>
				<th><div style="width: 70px">${item.id}</div></th>
				<td><div style="width: 565px">${item.contents}</div></td>
				<td>
				<c:set var="cuser" value="${sessionScope.userid }" />
				<c:set var="user" value="${item.id }" />

				<c:if test="${cuser eq user}">
		   			<form method="post" action="./deletecomments.do">
 					<input type="hidden" name="board_id" value="${item.board_id}">
					<input type="hidden" name="comments_index" value="${item.indexnumber}">	
		   			<input class="btn btn-primary btn-danger" type="submit" value="삭제하기">
					</form>
				</c:if>	
					</td>
				</tr>
			</table>
		</c:forEach>
		</div>
	</div>	
	  
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <br>

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
  </div>
    <script> 
    $(function(){
      $("#nav").load("nav.html"); 
    });
    </script> 
   <div id="nav"></div>
</body>

</html>