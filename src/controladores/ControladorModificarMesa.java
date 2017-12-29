package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MesaDao;
import datos.Mesa;
import negocio.MesaABM;

public class ControladorModificarMesa extends HttpServlet {
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

				int idMesa = Integer.parseInt(request.getParameter("idMesa"));
				int salon = Integer.parseInt(request.getParameter("salon"));
				int nroMesa = Integer.parseInt(request.getParameter("nroMesa"));
				int capacidad = Integer.parseInt(request.getParameter("capacidad"));
				MesaABM mesaabm = new MesaABM();
				Mesa mesa = new Mesa();
				String mensaje;
				MesaDao mdao= new MesaDao();
				try{
					mesa = mdao.traerMesa((long)idMesa);
					if(mesa==null)throw new Exception("Mesa no existe: " + idMesa);
					mesa.setSalon(salon);
					mesa.setNroMesa(nroMesa);
					mesa.setCapacidad(capacidad);
					mesaabm.modificarMesa(mesa);
					mensaje = "La mesa ha sido modificada";
					request.setAttribute("mensaje", mensaje);
				}
				catch(Exception e){
					mensaje = "Fallo en modificar mesa: " + e.getMessage();
					request.setAttribute("mensaje", mensaje);
				}
				request.getRequestDispatcher("ajax/ajaxopfinalizada.jsp").forward(request, response);
	} 
}
