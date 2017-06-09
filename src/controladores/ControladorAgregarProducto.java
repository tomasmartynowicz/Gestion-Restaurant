package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoDao;
import datos.Comanda;
import datos.Producto;
import negocio.ComandaABM;

public class ControladorAgregarProducto extends HttpServlet {
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
				int idComanda = Integer.parseInt(request.getParameter("idComanda"));
				int idProducto = Integer.parseInt(request.getParameter("idProducto"));
				ComandaABM coabm = new ComandaABM();
				ProductoDao pDao = new ProductoDao();
				try{
					Comanda c = coabm.traerComanda(idComanda);
					Producto p = pDao.traerProducto(idProducto);
					c.agregar(p);
					coabm.modificar(c);
				}
				catch(Exception e){
					response.sendError(500, "Error en el controlador de AgregarProducto:" + e.getMessage());
				}
				request.getRequestDispatcher("todavia nose que va ak ajaj").forward(request, response);
	} 
}