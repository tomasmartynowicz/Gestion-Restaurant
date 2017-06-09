<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Camarero | Modificar Comanda</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	
	<script src="js/habilitarboton.js"></script>
	
</head>
<body>
	<%@ include file="cabeceras/cabeceracamarero.jsp"%>
	
	<%@ page import="datos.Comanda"%>
	<%@ page import="datos.Mesa"%>
	<%@ page import="datos.Cliente"%>
	<%@ page import="negocio.Funciones" %>

	<%
		Comanda comanda = (Comanda) request.getAttribute("comanda");
	%>

	<div class="jumbotron">
		<div class="container">


			<h2>Modificar Comanda</h2>
			<form class="form-horizontal">
			
				<h4>Comanda</h4>
				<div class="form-group">
					<label class="control-label col-sm-2">ID:</label> 
					<label class="control-label col-sm-1"><%=comanda.getIdComanda()%></label>
					<input type="hidden" id="idComanda" value="<%=comanda.getIdComanda()%>" />
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="fechaYHora">Fecha y Hora:</label>
					<label class="control-label col-sm-2"><%=Funciones.traerFechaCortaHora(comanda.getFechaYHora()) %></label>
					<div class="col-sm-1">
						<input type="hidden" class="form-control" id="fechaYHora" value="<%= comanda.getFechaYHora()%>">
					</div>					
				</div>
				
				<h4>Mesa</h4>
				<div class="form-group">
					<input id="idMesa" type="hidden" value="<%= comanda.getMesa().getIdMesa() %>" />
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="nroMesa">N° Mesa:</label>
					<div class="col-sm-1">
						<input type="nroMesa" class="form-control" id="nroMesa" value="<%= comanda.getMesa().getNroMesa()%>">
					</div>
				</div>
				
				<h4>Cliente</h4>
				<div class="form-group">
					<label class="control-label col-sm-2" for="dni">DNI:</label>
					<div class="col-sm-2">
						<input type="dni" class="form-control" id="dni" value="<%= comanda.getCliente().getDni()%>">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="habitacion">Habitacion:</label>
					<div class="col-sm-2">
						<input type="habitacion" class="form-control" id="habitacion" value="<%= comanda.getCliente().getHabitacion()%>">
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
</body>
</html>