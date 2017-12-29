package controladores;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Usuario;
import negocio.UsuarioABM;


public class ControladorIniciarSesion extends HttpServlet {
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
			response.setContentType("text/html;charset=UTF-8");
			
			String usuario = request.getParameter("usuario");
			String contrasenia = request.getParameter("contrasenia");
			UsuarioABM uabm = new UsuarioABM();
			Usuario u = new Usuario();

			u = uabm.iniciarSesion(usuario, contrasenia);
			if (u == null)
				throw new Exception("Error en el controlador de IniciarSesion: Usuario o Contrasenia erronea");

			HttpSession session = request.getSession();
			session.setAttribute("empleado", u.getEmpleado());
			session.setAttribute("categoria", u.getCategoria());

			// Dependiendo la categoria se muestran distintas vistas
			switch ((int) u.getCategoria().getIdCategoria()) {
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
		} catch (Exception e) {
			response.sendError(500, "Error en el controlador de IniciarSeion:" + e.getMessage());
		}

	} 
}