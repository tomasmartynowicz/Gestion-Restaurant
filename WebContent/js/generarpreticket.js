$(document).ready(function() {
	$('#guardar').click(function() {
		var nroMesa = $('#mesas').val();
		var dni = $('#dni').val()
		$.ajax({
			method : "POST",
			url : "GenerarPreticket",
			data : {
				nroMesa : nroMesa,
				dni : dni
			},
			async : false
		}).done(function(data) {
			$("#preticket").html(data);
		})
	});
});