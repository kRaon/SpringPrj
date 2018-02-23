$(function() {

$('#daterange').on('apply.daterangepicker', function(ev, picker) {
	var monthstart = picker.startDate.format('YYYYMMDD')
	var monthend = picker.endDate.format('YYYYMMDD')
	var tmp
	var url1 = "./selectdate.do?fromdate=" + monthstart +"&todate="+monthend;
	var btnn = ""
		$.get(url1, function(responseJson) {
			$('#dataTable> tbody').empty();
			var $tbody = $("<tbody>").appendTo($("#dataTable"));
			tmp='['
			$.each(responseJson, function(index, tableval) {
				$("<tr>").appendTo($tbody)
					
					.append($("<td>").text(tableval.a_type))
					.append($("<td>").text(tableval.fixed))
					.append($("<td>").text(tableval.category_name))
					.append($("<td>").text(tableval.contents))
					.append($("<td>").text(tableval.a_date))
					.append($("<td>").text(tableval.amount.toLocaleString()))
					.append($("<td>").html("<input type='checkbox' name='indexnumber' value='${item.indexnumber}'>"));
				tmp += tableval.category_name+":"+tableval.contents+":"+tableval.amount+":"+tableval.fixed+":"+tableval.a_date+":"+tableval.a_type+","
					/*<input type="checkbox" name="indexnumber" value="${item.indexnumber}">*/
			});
			tmp = tmp.substr(0,tmp.length-1);
			tmp = tmp+']'
			alert(tmp);
			$('#billscontents').val(tmp);
		});
});


});
