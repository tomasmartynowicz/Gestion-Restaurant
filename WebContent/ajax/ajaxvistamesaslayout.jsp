<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="datos.Mesa" %>      
  <div id="layout">
<%
	int ocupado = 0, libre=0, terminando=0;
	List<Mesa> mesas = (List)request.getAttribute("mesas");
	String color="", estado="";
	for (Mesa mesa : mesas) {
		switch(mesa.getEstado()){
		case 1:
			color="green";
			estado="LIBRE";
			libre+=1;
			break;
		case 2:
			color="red";
			estado="OCUPADO";
			ocupado+=1;
			break;
		case 3:
			color="blue";
			estado="TERMINANDO";
			terminando+=1;
			break;
		}
%>
<div style="border-color:<%=color %>" class="mesa">
<div class="nummesa"><%=mesa.getNroMesa()%></div>
<div class="desc">Capacidad: <%=mesa.getCapacidad() %><br/><%=estado %><br/>
	<%if(mesa.getUnion()!=0){ %>
	<%="Union:" %>
	<%=mesa.getUnion()%>
	<% } %>
</div>
</div>
<% } %>
</div>
<div id="container">

  <canvas id="chart" width="600" height="500"></canvas>

  <table id="chartData">

    <tr>
      <th>Estado de mesa</th><th>Cantidad</th>
     </tr>

    <tr style="color: green">
      <td>Libre</td><td><%=libre %></td>
    </tr>

    <tr style="color: red">
      <td>Ocupado</td><td><%=ocupado %></td>
    </tr>

    <tr style="color: blue">
      <td>Terminando</td><td><%=terminando %></td>
    </tr>


  </table>

</div>