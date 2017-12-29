<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="datos.Producto" %>

<% List<Producto> lstProducto = (List<Producto>) request.getAttribute("lstProducto"); %>

<label class="control-label col-sm-2" for="idProducto">Producto:</label>
<div class="col-sm-2">
	<select id="rubros" class="form-control">
		<option selected disabled></option>
		<% for(Producto p : lstProducto) { %>
		<option value="<%= p.getIdProducto() %>"><%= p.getNombre() %></option>
		<% } %>
	</select>
</div>