package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.MesaABM;

public class ControladorCrearMesa extends HttpServlet {
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
				int salon = Integer.parseInt(request.getParameter("salon"));
				int nroMesa = Integer.parseInt(request.getParameter("nroMesa"));
				int cantidadComensales = Integer.parseInt(request.getParameter("cantidadComensales"));
				MesaABM abm = new MesaABM();
				
				abm.crearMesa(cantidadComensales, salon, nroMesa);				
				
				String mensaje = "Mesa creada";
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("/ajax/ajaxopfinalizada.jsp").forward(request, response);
				
			} catch(Exception e) {
				String mensaje = "Error: la mesa ya existe en la base de datos. Ingrese una nueva mesa";
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("/ajax/ajaxopfinalizada.jsp").forward(request, response);
			}
				
				
				
				
	} 
}
