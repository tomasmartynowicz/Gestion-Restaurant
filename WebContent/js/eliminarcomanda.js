$(document).ready(function() {
	$('#eliminar').click(function() {
		var idComanda = $('#idComanda').val();
		$.ajax({
			method : "POST",
			url : "EliminarComanda",
			data : {
				idComanda : idComanda
			},
			async : false
		}).done(function(data) {
			location.reload();
		})
	});
});