$(document).ready(function() {
	$('#guardar').click(function() {
		var salon = $('#salon').val();
		var nroMesa = $('#nroMesa').val();
		var cantidadComensales = $('#cantidadComensales').val()
		$.ajax({
			method : "POST",
			url : "CrearMesa",
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