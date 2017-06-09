<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="datos.Mesa" %> 

<% Mesa mesa = (Mesa) request.getAttribute("mesa");
   String tipo = (String) request.getAttribute("tipo");
%>

<!-- Para formularios de mesa a modificar -->
<% if(tipo.equals("modificar")) { %>

<!-- Id de la mesa -->
<div class="form-group">
	<input id="idMesa" type="hidden" value="<%= mesa.getIdMesa() %>" />
</div>

<!-- Nuevo numero de mesa -->
<div class="form-group">
	<label class="control-label col-sm-2" for="nroMesa">Nuevo N°
		Mesa:</label>
	<div class="col-sm-1">
		<input type="nroMesa" class="form-control" id="nroMesa"
			placeholder="Mesa" value="<%= mesa.getNroMesa() %>">
	</div>
</div>

<!-- salon -->
<div class="form-group">
	<label class="control-label col-sm-2" for="salon">Salón:</label>
	<div class="col-sm-1">
		<input id="salon" class="form-control" value="<%= mesa.getSalon() %>" />
	</div>
	
</div>

<!-- Capacidad -->
<div class="form-group">
	<label class="control-label col-sm-2">Capacidad:</label>
	<div class="col-sm-1">
		<input id="capacidad" class="form-control" value="<%= mesa.getCapacidad() %>" />
	</div>
</div>
	
<!-- Para formulario que no sea de modificar -->
<%} else { %>

<!-- Id de la mesa -->
<div class="form-group">
	<input id="idMesa" type="hidden" value="<%= mesa.getIdMesa() %>" />
</div>

<!-- salon -->
<div class="form-group">
	<label class="control-label col-sm-2" for="salon">Salón:</label>
	<label class="control-label col-sm-1"><%= mesa.getSalon() %></label>
</div>

<!-- Capacidad -->
<div class="form-group">
	<label class="control-label col-sm-2">Capacidad:</label>
	<label class="control-label col-sm-1"><%= mesa.getCapacidad() %></label>
</div>

<% } %>