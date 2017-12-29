package controladores;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import negocio.ComandaABM;
import negocio.Funciones;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Comanda;
import datos.Mesa;

public class ControladorTraerComandasPorFecha extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	 throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	 throws ServletException, IOException {
		procesarPeticion(request, response);
	}
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException {
		try{
			response.setContentType("text/html;charset=UTF-8");
			String fecha=request.getParameter("fechaYHora");
			int anio=Integer.parseInt(fecha.substring(0, 4));
			int mes=Integer.parseInt(fecha.substring(5,7));
			int dia=Integer.parseInt(fecha.substring(8,10));
			int hora=Integer.parseInt(fecha.substring(11, 13));
			int min=Integer.parseInt(fecha.substring(14, 16));
			int seg=Integer.parseInt(fecha.substring(17, 19));
			GregorianCalendar fechaX=new GregorianCalendar(anio,mes-1,dia,hora,min,seg);
			ComandaABM comandaABM=new ComandaABM();
			List<Comanda> comandasPorFecha=comandaABM.traerComandaPorFecha(fechaX);
			request.setAttribute("comandasPorFecha", comandasPorFecha);
			//despachar
			request.getRequestDispatcher("/ajax/ajaxvistacocinero.jsp").forward(request, response);
		}
		catch(Exception e){
			
		}
	}
	

}
