<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>    
   
<%
	List<String> mesas = (List) request.getAttribute("mesas");
	for (String mesa : mesas) { 
%>
<option value="<%=mesa%>"><%=mesa%></option>
<% } %>