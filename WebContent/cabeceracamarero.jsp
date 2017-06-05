<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="pull-left" href="iniciojds.jsp"><IMG
				src="/GestionRestaurant/imagenes/LogoUnla50x46.png"></a>
		</div>
		
		<!-- Navegador -->
		<div id="navbar" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="iniciocamarero.jsp">Home</a></li>
				
				<!-- Dropdown Comanda -->
				 <li class="dropdown">
                	<a href="#" data-toggle="dropdown" class="dropdown-toggle">Comanda <b class="caret"></b></a>
                	<ul class="dropdown-menu">
                    	<li><a href="#">Crear</a></li>
                    	<li><a href="#">Modificar</a></li>
                    	<li><a href="#">Eliminar</a></li>
                	</ul>
            	</li>
			</ul>
			
			<!-- Cerrar Sesion -->
			<ul class="nav pull-right">
           		 <li>
           			 <form>
						<button type="submit" class="btn btn-success navbar-btn">Cerrar sesión</button>
					</form>
				</li>
        	</ul> 
		</div>
	</div>
</nav>