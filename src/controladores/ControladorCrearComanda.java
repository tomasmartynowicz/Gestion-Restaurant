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
import datos.Mesa;
import negocio.ComandaABM;
import negocio.MesaABM;

public class ControladorCrearComanda extends HttpServlet {
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
				MesaABM mesaabm = new MesaABM();
				String mensaje;
				try{
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
					ComandaABM coabm = new ComandaABM();
					coabm.agregar(null, c, mesa); //NO RECIBE EMPLEADO??
					mensaje = "La comanda ha sido agregada";
					request.setAttribute("mensaje", mensaje);
				}
				catch(Exception e){
					mensaje = e.getMessage();
					request.setAttribute("mensaje", mensaje);
				}
				request.getRequestDispatcher("ajax/ajaxopfinalizada.jsp").forward(request, response);
	} 
}
