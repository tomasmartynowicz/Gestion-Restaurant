function traerMesasLayout() {
	
	var salon = $("#salones").val()
	if(salon != null) {
		$.ajax({
			method : "POST",
			url : "TraerMesasLayout",
			data : {salon : salon},
			async : false
		}).done(function(data) {
			$("#vista").html(data)
		})
	}
	else{
		$("#vista").html("");
	}
}