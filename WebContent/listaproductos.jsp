<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Comanda | Platos y Bebidas</title>

	<!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/bootstrap-theme.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="css/personal.css" rel="stylesheet">
	
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	
	
	<script>
		function traerProductos() {
			var idRubro = $('#rubros').val();
			if(idRubro != null) {
				$.ajax({
					method : "POST",
					data: {idRubro : idRubro},
					url : "TraerListaProductosPorRubro",
					async : false
				}).done(function(data) {
					$("#productos").html(data)
				})
			}
		}
	</script>

</head>
<body>
	<%@ include file="cabeceras/cabeceracamarero.jsp"%>
	<%@ page import="datos.Rubro"%>
	<%@ page import="datos.Comanda"%>
	<%@ page import="datos.Producto"%>
	<%@ page import="java.util.Set"%>
	<%@ page import="java.util.List"%>
	<%
		Comanda comanda = (Comanda) request.getAttribute("comanda");
		List<Rubro> lstRubro = (List<Rubro>) request.getAttribute("lstRubro");
	%>

	<div class="jumbotron">
		<div class="container">
			<div class="row divtable">
				<div class="col-sm-2 divth">Comanda N° <%= comanda.getIdComanda()%></div>
			</div>
		</div>
		<div class="container">
			<div class="row divtable divtr">
				<div class="col-sm-2 divth">N°</div>
				<div class="col-sm-2 divth">Nombre</div>
				<div class="col-sm-2 divth">Rubro</div>
				<div class="col-sm-2 divth"></div>
				<div class="col-sm-2 divth"></div>
			</div>

			<% 				
			Set<Producto> lstProducto = comanda.getLstProducto();

			for (Producto p : lstProducto) { 
			%>
			<form method="POST" action="/GestionRestaurant/EliminarProducto">
				
				<input name="idComanda" type="hidden" value="<%= comanda.getIdComanda()%>"/>
				<input name="idProducto" type="hidden" value="<%= p.getIdProducto()%>"/>
								
 				<div class="row divtable divtr">
					
					<div class="col-sm-2"><%=p.getIdProducto()%><input
							type="hidden" name="idComanda" value="<%=p.getIdProducto()%>" />
					</div>
					<div class="col-sm-2"><%=p.getNombre()%></div>
					<div class="col-sm-2"><%=p.getRubro().getNombre()%></div>
					<div class="col-sm-2">
						<button id="eliminar" type="submit"
							class="btn btn-default btn-sm btn-danger">Eliminar</button>
					</div>
				</div>
			</form>


			<% } %>
		</div>
		
		<div id="container" class="container">
			<h3>Agregar Producto</h3>
			<div class="row divtable">
				<div class="col-sm-2 divth">Comanda N° <%= comanda.getIdComanda()%></div>
			</div>
				
			<form class="form-horizontal" method="POST" action="/GestionRestaurant/AgregarProducto">	
				<input name="idComanda" type="hidden" value="<%= comanda.getIdComanda()%>" />
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="rubro">Rubro:</label>
					<div class="col-sm-2" >
						<select id="rubros" class="form-control" onchange="traerProductos()">
							<option selected disabled></option>
							<% for(Rubro r : lstRubro) { %>
							<option value="<%= r.getIdRubro() %>"><%= r.getNombre() %></option>
							<% } %>
						</select>
					</div>
				</div>
				
				<div id="productos" class="form-group">
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