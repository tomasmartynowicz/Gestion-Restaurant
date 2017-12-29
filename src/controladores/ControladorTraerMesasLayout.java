package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Mesa;
import negocio.MesaABM;

public class ControladorTraerMesasLayout extends HttpServlet {
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
				
				response.setContentType("text/html;charset=UTF-8");
				int salon =Integer.parseInt(request.getParameter("salon"));
				MesaABM mesaabm = new MesaABM();
				List<Mesa> mesas = mesaabm.traerMesas(salon);
				request.setAttribute("mesas", mesas);
				request.getRequestDispatcher("ajax/ajaxvistamesaslayout.jsp").forward(request, response);
	} 
}