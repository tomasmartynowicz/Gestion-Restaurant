package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductoDao;
import dao.RubroDao;
import datos.Comanda;
import datos.Producto;
import datos.Rubro;
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
				RubroDao rubroDao = new RubroDao();
				try{
					Producto p = pDao.traerProducto(idProducto);
					coabm.agregarProducto(idComanda, p);;
					
					
					Comanda c = coabm.traerComandaYProductos(idComanda);
					List<Rubro> lstRubro = rubroDao.traerRubro();
					
					request.setAttribute("lstRubro", lstRubro);
					request.setAttribute("comanda", c);
					request.getRequestDispatcher("/listaproductos.jsp").forward(request, response);
					
				}
				catch(Exception e){
					response.sendError(500, "Error en el controlador de AgregarProducto:" + e.getMessage());
				}
				
				
				
	} 
}