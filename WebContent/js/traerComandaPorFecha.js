$(document).ready(function() {
	$.ajax({
		method : "POST",
		url : "TraerComandaFechaCocinero",
		async : false
	}).done(function(data) {
		$("#comandasPorFecha").html(data)
	})
});


function traerComandaPorFecha(){
	var fecha = $("#fecha").val();
		$.ajax({
			method : "POST",
			url : "TraerComandaFechaCocinero",
			data : {
					fechaYHora:fechaYHora
			},
			async : false
		}).done(function(data) {
			$("#comanda").html(data)
		})
}