<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>    
<%@ page import="datos.Comanda" %>
<%@ page import ="negocio.Funciones" %>

<!-- <table class="table">
<tr>
	<th>N°</th>
	<th>Salon</th>
	<th>Mesa</th>
	<th>Fecha y Hora</th>
	<th></th>
	<th></th>
	<th></th>
</tr>



	


</table> -->

<div class="container">
	<div class="row divtable divtr">
		<div class="col-sm-2 divth">N°</div>
		<div class="col-sm-2 divth">Mesa</div>
		<div class="col-sm-2 divth">Salón</div>
		<div class="col-sm-2 divth">Fecha y Hora</div>
		<div class="col-sm-2 divth"></div>
	</div>
	
	<%
	List<Comanda> comandas = (List<Comanda>) request.getAttribute("comandas");
	String accion = (String) request.getAttribute("accion");
	String nombre = (String) request.getAttribute("nombre");
	String boton = (String) request.getAttribute("boton");
	
	for (Comanda comanda : comandas) {
	%>
	<form method="POST" action="<%= accion%>">
	<div class="row divtable divtr">
		<div class="col-sm-2"><%=comanda.getIdComanda()%><input
				type="hidden" name="idComanda" value="<%=comanda.getIdComanda()%>" /></div>
		<div class="col-sm-2"><%=comanda.getMesa().getNroMesa()%></div>
		<div class="col-sm-2"><%=comanda.getMesa().getSalon()%></div>
		<div class="col-sm-2"><%=Funciones.traerFechaCortaHora(comanda.getFechaYHora())%></div>
		<div class="col-sm-2">
			<button id="<%= nombre %>" type="submit"
					class="btn btn-default btn-sm <%= boton%>"><%= nombre %></button>
		</div>

	</div>
	</form>


<% } %>
</div>