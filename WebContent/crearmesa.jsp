<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Jefe de salón | Crear mesa</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>

	<script type="text/javascript">
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
					$("#response").html(data);
				})
			});
		});
	</script>
</head>
<body>
	<%@ include file="/cabecerajds.jsp" %>
	
	<div class="jumbotron">
		<div id="container" class="container">
			<h2>Crear Nueva Mesa</h2>			
			<form class="form-horizontal">
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Salón:</label>
					<div class="col-sm-5">
						<input type="salon" class="form-control" id="salon"
							placeholder="Ingrese salon">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nroMesa">N° Mesa:</label>
					<div class="col-sm-1">
						<input type="nroMesa" class="form-control" id="nroMesa" placeholder="Mesa">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="cantidadComensales">Capacidad:</label> 
					<div class="col-sm-1">
						<select class="form-control" id="cantidadComensales">
							<option>2</option>
							<option>4</option>
							<option>6</option>
							<option>8</option>
						</select>					
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button id="guardar" type="submit" class="btn btn-default">Guardar</button>
					</div>
				</div>
			</form>


		</div>


	</div>
	
	<div id="response">
	</div>
	


</body>
</html>