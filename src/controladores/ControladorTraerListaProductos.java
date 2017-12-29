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

public class ControladorTraerListaProductos extends HttpServlet {
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
				System.out.println("hola");
				ComandaABM comandaAbm = new ComandaABM();
				RubroDao rubroDao = new RubroDao();
				
				int idComanda = Integer.parseInt(request.getParameter("idComanda"));
				
				Comanda comanda = comandaAbm.traerComandaYProductos(idComanda);
				
				List<Rubro> lstRubro = rubroDao.traerRubro();
				
				
				request.setAttribute("lstRubro", lstRubro);
				request.setAttribute("comanda", comanda);
				
				request.getRequestDispatcher("/listaproductos.jsp").forward(request, response);
				
		} catch(Exception e) {
			e.printStackTrace();
		}
				
	} 

}
