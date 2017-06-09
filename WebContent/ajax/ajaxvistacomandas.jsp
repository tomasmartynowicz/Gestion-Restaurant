<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>    
<%@ page import="datos.Comanda" %>
<%@ page import ="negocio.Funciones" %>

<table class="table">
<tr>
	<th>N°</th>
	<th>Salon</th>
	<th>Mesa</th>
	<th>Fecha y Hora</th>
	<th></th>
	<th></th>
	<th></th>
</tr>


<%
	List<Comanda> comandas = (List<Comanda>) request.getAttribute("comandas");
	String accion = (String) request.getAttribute("accion");
	String nombre = (String) request.getAttribute("nombre");
	String boton = (String) request.getAttribute("boton");
	
	for (Comanda comanda : comandas) {
%>

	<tr>
		<form method="POST" action="<%= accion%>">
			<td class="vert-align"><%=comanda.getIdComanda()%><input
				type="hidden" name="idComanda" value="<%=comanda.getIdComanda()%>" /></td>
			<td class="vert-align"><%=comanda.getMesa().getSalon()%></td>
			<td class="vert-align"><%=comanda.getMesa().getNroMesa()%></td>
			<td class="vert-align"><%=Funciones.traerFechaCortaHora(comanda.getFechaYHora())%>
			<td class="vert-align"><button id="<%= nombre %>" type="submit"
					class="btn btn-default btn-sm <%= boton%>"><%= nombre %></button></td>
		</form>
	</tr>

<% } %>

</table>