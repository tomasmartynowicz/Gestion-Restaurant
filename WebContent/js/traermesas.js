$(document).ready(function() {
	$.ajax({
		method : "POST",
		url : "TraerMesas",
		async : false
	}).done(function(data) {
		$("#mesas").html(data)
	})
});


function traerMesa() {
	var nroMesa = $("#mesas").val();
	var tipo = $("#tipo").val();
	if(nroMesa != 0) {
		$.ajax({
			method : "POST",
			url : "TraerMesaPorNro",
			data : {nroMesa : nroMesa,
					tipo : tipo 
			},
			async : false
		}).done(function(data) {
			$("#mesa").html(data)
		})
	}
	else{
		$("#mesa").html("");
	}
}