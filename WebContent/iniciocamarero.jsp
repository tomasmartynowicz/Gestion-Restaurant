<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Jefe de salón</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
</head>
<body>
	<%@ include file="/cabeceracamarero.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h2>Comandas</h2>
			<table class="table">
				<tr>
					<th>N°</th>
					<th>Salon</th>
					<th>Mesa</th>
					<th>Cliente</th>
					<th>Hora</th>
					<th></th>
					<th></th>
				</tr>
				<tr>
					<td class="vert-align">1</td>
					<td class="vert-align">Cafeteria</td>
					<td class="vert-align">3</td>
					<td class="vert-align">Carlos Rodriguez</td>
					<td class="vert-align">09:32</td>
					<td class="vert-align"><button type="submit" class="btn btn-default btn-sm">Platos y Bebidas</button></td>
					<td class="vert-align"><button type="submit" class="btn btn-danger btn-sm">Anular</button></td>
				</tr>
				<tr>
					<td class="vert-align">2</td>
					<td class="vert-align">Cafeteria</td>
					<td class="vert-align">5</td>
					<td class="vert-align">Carla Martinez</td>
					<td class="vert-align">09:37</td>
					<td class="vert-align"><button type="submit" class="btn btn-default btn-sm">Platos y Bebidas</button></td>
					<td class="vert-align"><button type="submit" class="btn btn-danger btn-sm">Anular</button></td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>