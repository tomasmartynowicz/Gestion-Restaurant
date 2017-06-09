package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
				
				response.setContentType("text/html;charset=UTF-8");
				String salon = request.getParameter("salon");
				
				if(salon.equals("Cafeteria")) {
					List<String> mesas = new ArrayList<String>();
					mesas.add("1");
					mesas.add("2");
					mesas.add("3");
					mesas.add("4");
					
					request.setAttribute("mesas", mesas);
				}
				if(salon.equals("Bar")) {
					List<String> mesas = new ArrayList<String>();
					mesas.add("1");
					mesas.add("2");
					
					request.setAttribute("mesas", mesas);
				}
				request.getRequestDispatcher("/ajaxvistamesas.jsp").forward(request, response);
	} 
}
