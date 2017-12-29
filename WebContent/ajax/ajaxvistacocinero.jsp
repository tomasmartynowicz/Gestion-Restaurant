<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %> 
<%@ page import="datos.Comanda" %>  
<option selected disabled></option>

<%

List<Comanda> comandasPorFecha = (List<Comanda>) request.getAttribute("fechaYHora");
for(Comanda c: comandasPorFecha){
	%>
<option value="<%=c.getFechaYHora()%>">option>
<%} %>
