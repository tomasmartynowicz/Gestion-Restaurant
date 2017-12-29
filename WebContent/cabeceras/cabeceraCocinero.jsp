<%@page import="datos.Comanda"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cocinero-Mostrar Comandas por fecha</title>
</head>
<body>
	<%@ include file="cabecera.jsp" %>
		<div class="jumbotron">
			<div class="container">
			<h1>Platos a realizar en la fecha</h1>
			<form class="navbar-form navbar-right">
				<div class="form-group">
				<label for="fechaYHora">Consultar Fecha formato AAAA-MM-DD </label>
				<input id=fechaYHora name="fechaYHora">
		</div>
		 <input id="consultar" type="button" class="btn btn-sucess" value="Consultar" />
		 </form>
		 </div>
		 <ul class="nav pull-right">
           		 <li>
           			 <form method="POST" action="/GestionRestaurant/CerrarSesion">
						<button type="submit" class="btn btn-success navbar-btn">Cerrar sesión</button>
					</form>
				</li>
        	</ul> 
		 </div>
		
		
		
</body>
</html>