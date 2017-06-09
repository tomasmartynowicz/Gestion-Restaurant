package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Comanda;
import negocio.ComandaABM;

public class ControladorEliminarComanda extends HttpServlet {
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
				int idComanda = Integer.parseInt(request.getParameter("idComanda"));
				ComandaABM coabm = new ComandaABM();
				try{
					coabm.eliminar(idComanda);
				}
				catch(Exception e){
					response.sendError(500, "Error en el controlador de Eliminar Comanda");
				}
				request.getRequestDispatcher("/iniciocamarero.jsp").forward(request, response);
	} 
}