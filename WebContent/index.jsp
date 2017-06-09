<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Inicio</title>
	
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link href="css/personal.css" rel="stylesheet">
    
</head>
<body>
	<%@ include file="cabeceras/cabecera.jsp"%>
    
    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
        </div>
        <div class="col-md-4">
		  <form>
            <div class="form-group">
              <h2>Acceder</h2>
              <input type="text" placeholder="Usuario" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Contraseña" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Iniciar sesión</button>
          </form>
       </div>
        <div class="col-md-4">
        </div>
      </div>

      <hr>
      
    </div> <!-- /container -->

</body>
</html>