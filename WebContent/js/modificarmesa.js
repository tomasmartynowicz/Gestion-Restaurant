$(document).ready(function() {
	$('#guardar').click(function() {
		var idMesa = $('#idMesa').val();
		var nroMesa = $('#nroMesa').val();
		var salon = $('#salon').val();
		var capacidad = $('#capacidad').val()
		$.ajax({
			method : "POST",
			url : "ModificarMesa",
			data : {
				idMesa : idMesa,
				nroMesa : nroMesa,
				salon : salon,
				capacidad : capacidad
			},
			async : false
		}).done(function(data) {
			$("#respuesta").html(data);
		})
	});
});