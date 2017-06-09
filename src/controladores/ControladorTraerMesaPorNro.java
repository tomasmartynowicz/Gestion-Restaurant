package controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Mesa;
import negocio.MesaABM;

public class ControladorTraerMesaPorNro extends HttpServlet {
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
				String tipo = request.getParameter("tipo");
				
				MesaABM mesaAbm = new MesaABM();
				
				int nroMesa = Integer.parseInt(request.getParameter("nroMesa"));
				
				Mesa mesa = mesaAbm.traerMesa(nroMesa);
				
				request.setAttribute("mesa", mesa);
				request.setAttribute("tipo", tipo);
				request.getRequestDispatcher("/ajax/ajaxvistamesa.jsp").forward(request, response);
				
		} catch(Exception e){
			response.sendError(500, "No hay mesas registradas en la base de datos.");
		}
	} 
}
