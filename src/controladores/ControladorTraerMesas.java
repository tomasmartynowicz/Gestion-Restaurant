package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.MesaABM;
import datos.Mesa;

public class ControladorTraerMesas extends HttpServlet {
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
				
				
				MesaABM mesaAbm = new MesaABM();
				
				List<Mesa> mesas = mesaAbm.traerMesas();
				
				request.setAttribute("mesas", mesas);

				request.getRequestDispatcher("/ajax/ajaxvistamesas.jsp").forward(request, response);
				
		} catch(Exception e){
			response.sendError(500, "No hay mesas registradas en la base de datos.");
		}
	} 
		
}
