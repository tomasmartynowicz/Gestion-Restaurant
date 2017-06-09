<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %> 
<%@ page import="datos.Mesa" %>     
   
<option selected disabled></option>
   
<%
	List<Mesa> mesas = (List<Mesa>) request.getAttribute("mesas");
	for (Mesa mesa : mesas) { 
%>
<option value="<%=mesa.getNroMesa()%>"><%=mesa.getNroMesa()%></option>
<% } %>