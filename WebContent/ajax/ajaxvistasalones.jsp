<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>

<option value="0">Seleccione un salón</option>
<% List<String> salones=(List)request.getAttribute("salones");
	for(String salon : salones){ %>
		<option value="<%= salon %>"><%=
					salon %></option>
<% } %>