package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import negocio.ComandaABM;
import negocio.MesaABM;
import dao.EmpleadoDao;
import datos.Empleado;
import datos.Mesa;
import datos.Comanda;


public class ControladorTraerComandas extends HttpServlet {
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
			
			HttpSession session = request.getSession();
			Empleado empleado = (Empleado) session.getAttribute("empleado");
			
			String accion = (String) request.getParameter("accion");
			String nombre = (String) request.getParameter("nombre");
			String boton = (String) request.getParameter("boton");
			
			ComandaABM comandaAbm = new ComandaABM();
			List<Comanda> comandas = comandaAbm.traerComandaPorEmpleado(empleado.getIdEmpleado());
			
			request.setAttribute("comandas", comandas);
			request.setAttribute("accion", accion);
			request.setAttribute("nombre", nombre);
			request.setAttribute("boton", boton);
			request.getRequestDispatcher("/ajax/ajaxvistacomandas.jsp").forward(request, response);			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
				
	} 
}
