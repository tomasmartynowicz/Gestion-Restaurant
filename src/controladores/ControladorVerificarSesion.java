package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datos.Categoria;
import datos.Empleado;
import datos.Usuario;
import negocio.UsuarioABM;

public class ControladorVerificarSesion extends HttpServlet {
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
			
		if (request.getSession().getAttribute("categoria") == null) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		} else {
			HttpSession session = request.getSession();
			Categoria categoria = (Categoria) session.getAttribute("categoria");

			// Dependiendo la categoria se muestran distintas vistas
			switch ((int) categoria.getIdCategoria()) {
			case 1:
				// administrador
				request.getRequestDispatcher("").forward(request, response);
				break;
			case 2:
				// jefe de salon
				request.getRequestDispatcher("/iniciojds.jsp").forward(request, response);
				break;
			case 3:
				// gerente de alimentos y bebidas
				request.getRequestDispatcher("").forward(request, response);
				break;
			case 4:
				// camarero
				request.getRequestDispatcher("/iniciocamarero.jsp").forward(request, response);
				break;
			case 5:
				// cocinero
				request.getRequestDispatcher("").forward(request, response);
				break;
			}

		}

	} 
}
