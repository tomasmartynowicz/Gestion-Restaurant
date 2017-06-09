$(document).ready(function() {
	$('#guardar').click(function() {
		var idComanda = $('#idComanda').val();
		var 
		$.ajax({
			method : "POST",
			url : "ModificarComanda",
			data : {
				salon : salon,
				nroMesa : nroMesa,
				cantidadComensales : cantidadComensales
			},
			async : false
		}).done(function(data) {
			$("#respuesta").html(data);
		})
	});
});