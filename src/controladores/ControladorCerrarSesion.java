package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ControladorCerrarSesion extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	 throws ServletException, IOException {
		procesarPeticion(request,response);
		
	}
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        procesarPeticion(request, response);
    }
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException {
		 	response.setContentType("text/html;charset=UTF-8");
		 	try{ 
		 		
	        HttpSession sesion = request.getSession(true); //devuelvo la sesion relacionada con la peticion
	        sesion.invalidate(); //cierro sesion
	        response.sendRedirect("index.jsp"); //redirecciono
		 	}
		 	catch(Exception e){
		 		response.sendError(500,"ERROR al cerrar sesion");
		 	}
	}
	
	

}
