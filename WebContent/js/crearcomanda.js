$(document).ready(function() {
	$('#guardar').click(function() {
		var idMesa = $('#idMesa').val();
		var dni = $('#dni').val();
		$.ajax({
			method : "POST",
			url : "CrearComanda",
			data : {
				idMesa : idMesa,
				dni : dni,		
			},	
			async : false
		}).done(function(data) {
			$("#respuesta").html(data);
		})
	});
});