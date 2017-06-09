<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Jefe de salón | Eliminar Comanda</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>

	<script>
		$(document).ready(function() {
			$.ajax({
				method : "POST",
				url : "TraerComandas",
				data : {
					accion : "/GestionRestaurant/EliminarComanda",
					nombre : "Eliminar",
					boton : "btn-danger"
				},
				async : false
			}).done(function(data) {
				$("#comandas").html(data)
			})
		});
	</script>
	
</head>
<body>
	<%@ include file="cabeceras/cabeceracamarero.jsp" %>
	
	<div class="jumbotron">
		<div id="response" class="container">
			<h2>Comandas</h2>
			<div id="comandas">
			</div>
		</div>
	</div>
</body>
</html>