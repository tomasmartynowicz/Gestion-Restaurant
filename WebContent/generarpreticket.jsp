<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Camarero | Pre-ticket</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	
	<script src="js/generarpreticket.js"></script>
	<script src="js/traermesas.js"></script>
	<script src="js/habilitarboton.js"></script>
</head>
<body>
	<%@ include file="/cabeceras/cabeceracamarero.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<!-- Formulario Crear comanda -->
			<form class="form-horizontal">
				<!-- Seleccionar Mesa -->
				<h4>Mesa</h4>
				<div class="form-group">
					<label class="control-label col-sm-2" for="mesas">Mesa:</label>
					<div class="col-sm-1">
						<select class="form-control select" id="mesas">
						</select>
					</div>
				</div>
				<!-- Informacion del Cliente -->
				<h4>Cliente</h4>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dni">DNI:</label>
					<div class="col-sm-2">
						<input type="dni" class="form-control" id="dni"
							placeholder="Ingrese dni">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button id="guardar" type="button" class="btn btn-default" disabled>Generar Preticket</button>
					</div>
				</div>
				<input id="tipo" type="hidden" value="crear"/>
			</form>
		</div>
		<div class="container">
			<div id="preticket"></div>
		</div>
	</div>

</body>
</html>