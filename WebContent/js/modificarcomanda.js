$(document).ready(function() {
	$('#guardar').click(function() {
		var idComanda = $('#idComanda').val();
		var nroMesa = $('#nroMesa').val();
		var dni = $('#dni').val();
		$.ajax({
			method : "POST",
			url : "ModificarComanda",
			data : {
				idComanda : idComanda,
				nroMesa : nroMesa,
				dni : dni
			},
			async : false
		}).done(function(data) {
			$("#respuesta").html(data);
		})
	});
});