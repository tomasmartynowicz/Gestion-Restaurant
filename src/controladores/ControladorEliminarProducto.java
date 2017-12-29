package controladores;

import java.io.IOException;
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

public class ControladorEliminarProducto extends HttpServlet {
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
				System.out.println(request.getParameter("idComanda"));
				int idProducto = Integer.parseInt(request.getParameter("idProducto"));
				
				RubroDao rubroDao = new RubroDao();
				ComandaABM coabm = new ComandaABM();
				ProductoDao pDao = new ProductoDao();
				try{
					Producto p = pDao.traerProducto(idProducto);
					coabm.eliminarProducto(idComanda, p);
					
					Comanda c = coabm.traerComandaYProductos(idComanda);
					List<Rubro> lstRubro = rubroDao.traerRubro();
					
					request.setAttribute("lstRubro", lstRubro);
					request.setAttribute("comanda", c);
					request.getRequestDispatcher("/listaproductos.jsp").forward(request, response);
				}
				catch(Exception e){
					response.sendError(500, "Error en el controlador de EliminarProducto:" + e.getMessage());
				}
				
	} 
}