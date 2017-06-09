$(document).ready(function() {
	$('select').change(function() {
		if ($("input").filter(function() {
			return $.trim($(this).val()).length == 0
		}).length == 0 && $('option[disabled]:selected').length == 0) {
			$("#guardar").removeAttr("disabled");
		} else {
			$("#guardar").attr("disabled", "disabled");
		}
	});
	$('input').keyup(function() {
		if ($("input").filter(function() {
			return $.trim($(this).val()).length == 0
		}).length == 0 && $('option[disabled]:selected').length == 0) {
			$("#guardar").removeAttr("disabled");
			
		} else {
			$("#guardar").attr("disabled", "disabled");
		}
	});
	
});