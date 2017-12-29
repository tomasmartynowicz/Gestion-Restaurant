<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="datos.Ticket" %>
<%@ page import="datos.Comanda" %>
<%@ page import="datos.Producto" %>
<%@ page import="datos.PrecioProductoLista" %>
<%@ page import="negocio.Funciones" %>
<% Ticket preticket = (Ticket) request.getAttribute("preticket");  %>

<h2>Preticket</h2>
<div class="row divtable divtr">
	<div class="divth">ID: <%= preticket.getIdTicket() %></div>
</div>
<div class="row divtable divtr">
	<div class="divth">Fecha y Hora: <%= Funciones.traerFechaCortaHora(preticket.getFechaYHora()) %></div>
</div>
<h3>Cliente</h3>
<div class="row divtable divtr">
	<div class="divth">DNI: <%= preticket.getCliente().getDni() %></div>
</div>
<div class="row divtable divtr">
	<div class="divth">Habitacion: <%= preticket.getCliente().getHabitacion() %></div>
</div>
<h3>Mesa</h3>
<div class="row divtable divtr">
	<div class="divth">N°: <%= preticket.getMesa().getNroMesa() %></div>
</div>
<div class="row divtable divtr">
	<div class="divth">Salón: <%= preticket.getMesa().getSalon() %></div>
</div>
<h3>Productos</h3>
<%
	PrecioProductoLista precio = null;
	for(Comanda comanda : preticket.getMesa().getLstComanda()) {
		for(Producto producto : comanda.getLstProducto()) {
			for(PrecioProductoLista precioProducto : producto.getLstPrecioProductoLista()) {
					precio = precioProducto;
			}
%>

<div class="row divtable divtr">
	<div class="divth"><%= producto.getNombre() %>...........$<%= precio.getPrecio() %></div>
	
	
</div>	

<% 
		}
	}
%>



