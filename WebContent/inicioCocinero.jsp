<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cocinero</title>
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	<script src="js/traerComandaPorFecha.js"></script>
	<script>
	$('#consultar').click(function (){
		$(document).ready(function(){
			$ajax({
				method:"POST",
				url: "TraerComandaFechaCocinero",
				data: {
					accion : "",
					nombre:" Comandas a realizar en la fecha"
				},
				async :false
			}).done(function(data){
				$("#comandasPorFecha").html(data);
			})
		});
	});
	</script>
</head>
<body>
	<%@ include file="cabeceras/cabeceraCocinero.jsp" %>
	<div class="jumbotron">
		<div id="response" class="container">
			<h2>Comandas</h2>
			<div id="comandas">
			</div>
		</div>
	</div>
	

</body>
</html>