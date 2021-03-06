<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Jefe de salón | Modificar Mesa</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	
	<script src="js/traersalones.js"></script>
	<script src="js/traermesas.js"></script>
	
	<script src="js/habilitarboton.js"></script>
	
	<script src="js/modificarmesa.js"></script>
</head>
<body>
	<%@ include file="cabeceras/cabecerajds.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h2>Modificar Mesa</h2>
			
			<form class="form-horizontal">
							
				<!-- Seleccionar Mesa -->
				<div class="form-group">
					<label class="control-label col-sm-2" for="mesas">N° Mesa:</label>
					<div class="col-sm-1">
						<select class="form-control select" id="mesas" onchange="traerMesa()">
						</select>
					</div>
				</div>
				<div id="mesa">
				</div>
				
				<!-- Guardar -->
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button id="guardar" type="submit" class="btn btn-default" disabled>Guardar</button>
					</div>
				</div>
				<input id="tipo" type="hidden" value="modificar" />
			</form>	
				
		</div>
	</div>
	<div id="respuesta">
	</div>

</body>
</html>