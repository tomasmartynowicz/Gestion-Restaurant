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
</head>
<body>
	<%@ include file="cabecerajds.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h2>Modificar Mesa</h2>
			
			<form class="form-horizontal">
				<!-- Seleccionar Salon -->
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Salón:</label> 
					<div class="col-sm-5">
						<select id="salones" class="form-control" onchange="traerMesas()">
						</select>					
					</div>
				</div>
				
				<!-- Seleccionar Mesa -->
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Mesa:</label> 
					<div class="col-sm-1">
						<select class="form-control" id="mesas">
							<option selected="selected"></option>
						</select>					
					</div>
				</div>
				
				<!-- Nuevos datos -->
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Nuevo Salón:</label>
					<div class="col-sm-5">
						<input type="nuevoSalon" class="form-control" id="nuevoSalon"
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
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Guardar</button>
					</div>
				</div>
			</form>	
				
		</div>
	</div>

</body>
</html>