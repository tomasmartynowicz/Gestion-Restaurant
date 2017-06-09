$(document).ready(function() {
	$('#modificar').click(function() {
		var idComanda = $('#idComanda').val();
		$.ajax({
			method : "POST",
			url : "TraerModificarComanda",
			data : {
				idComanda : idComanda
			},
			async : false
		}).done(function(data) {
			$("#comanda").html(data);
		})
	});
});