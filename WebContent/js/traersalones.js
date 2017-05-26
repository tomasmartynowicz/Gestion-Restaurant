$(document).ready(function() {
	$.ajax({
		method : "POST",
		url : "TraerSalones",
		async : false
	}).done(function(data) {
		$("#salones").html(data)
	})
});