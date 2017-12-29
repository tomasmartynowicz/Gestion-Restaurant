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

public class ControladorEliminarMesa extends HttpServlet {
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
				MesaDao mesadao = new MesaDao();
				String mensaje;
				try{
					mesadao.eliminar(mesadao.traerMesa((long)idMesa));
					mensaje = "La mesa ha sido eliminada";
					request.setAttribute("mensaje", mensaje);
				}
				catch(Exception e){
					mensaje = e.getMessage();
					request.setAttribute("mensaje", mensaje);
				}
				request.getRequestDispatcher("ajax/ajaxopfinalizada.jsp").forward(request, response);
	} 
}
