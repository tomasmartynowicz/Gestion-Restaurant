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

public class ControladorTraerModificarComanda extends HttpServlet {
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
			try {	
				ComandaABM comandaAbm = new ComandaABM();
				
				response.setContentType("text/html;charset=UTF-8");
				int idComanda = Integer.parseInt(request.getParameter("idComanda"));
				
				Comanda comanda = comandaAbm.traerComanda(idComanda);
				
				request.setAttribute("comanda", comanda);
				request.getRequestDispatcher("/modificarcomandaparticular.jsp").forward(request, response);
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}

	} 
}
