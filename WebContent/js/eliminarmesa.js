$(document).ready(function() {
	$('#guardar').click(function() {
		var idMesa = $('#idMesa').val();
		$.ajax({
			method : "POST",
			url : "EliminarMesa",
			data : {
				idMesa : idMesa
			},
			async : false
		}).done(function(data) {
			$("#respuesta").html(data);
		})
	});
});