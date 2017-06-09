package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import dao.TipoClienteDao;
import datos.Cliente;
import datos.Comanda;
import datos.Mesa;
import negocio.ComandaABM;
import negocio.MesaABM;

public class ControladorModificarComanda extends HttpServlet {
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
				int nroMesa = Integer.parseInt(request.getParameter("nroMesa"));
				int dni = Integer.parseInt(request.getParameter("dni"));
				int idComanda = Integer.parseInt(request.getParameter("idComanda"));
				MesaABM mesaabm = new MesaABM();
				ComandaABM coabm = new ComandaABM();
				Comanda comanda = new Comanda();
				String mensaje;
				try{
					comanda = coabm.traerComanda(idComanda);
					Mesa mesa = mesaabm.traerMesa(nroMesa);
					ClienteDao cdao = new ClienteDao();
					Cliente c = cdao.traerCliente(dni);
					if(c==null){
						c = new Cliente();
						c.setDni(dni);
						TipoClienteDao tcdao = new TipoClienteDao();
						c.setTipoCliente(tcdao.traerTipoCliente(2));
						int idCliente = cdao.agregar(c);
						c = cdao.traerCliente(idCliente);
					}
					comanda.setCliente(c);
					comanda.setMesa(mesa);
					coabm.modificar(comanda);
					mensaje = "La comanda ha sido modificada";
					request.setAttribute("mensaje", mensaje);
				}
				catch(Exception e){
					mensaje = e.getMessage();
					request.setAttribute("mensaje", mensaje);
				}
				request.getRequestDispatcher("/iniciocamarero.jsp").forward(request, response);
	} 
}
