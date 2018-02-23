Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif', Chart.defaults.global.defaultFontColor = "#292b2c";


$(function(){
	  $('#compare').click(function() {
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
							$('#idcheck').html("id valid");							
						} else {
							$('#idcheck').html("<b style=\"color:red\">check your id</b>");
						}
				 // }); 
				},
				error : function(data) {
					alert("통신실패 : " + data.message);
				}
			}); //end ajax     
		}); //end on    	   
});

