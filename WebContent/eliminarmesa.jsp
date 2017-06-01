<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Jefe de Salón | Eliminar Mesa</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js" ></script>
	
	<script src="js/traersalones.js"></script>
	<script src="js/traermesas.js"></script>
</head>
<body>
	<%@ include file="/cabecerajds.jsp" %>
	
	<div class="jumbotron">
		<div class="container">
			<h2>Eliminar Mesa</h2>
			
			<form class="form-horizontal">
				<!-- Seleccionar Mesa a eliminar -->
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Salón:</label> 
					<div class="col-sm-5">
						<select id="salones" class="form-control" id="salon" onchange="traerMesas()">
						</select>					
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2" for="salon">Mesa:</label>
					<div class="col-sm-1">
						<select class="form-control" id="mesas">
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Eliminar</button>
					</div>
				</div>				
			</form>			
			
		</div>
	</div>

</body>
</html>