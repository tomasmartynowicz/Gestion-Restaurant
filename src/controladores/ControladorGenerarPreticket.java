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
import datos.Ticket;
import negocio.MesaABM;
import negocio.TicketABM;

public class ControladorGenerarPreticket extends HttpServlet {
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
				MesaABM mabm = new MesaABM();
				try{
					Mesa mesa = mabm.traerMesa(nroMesa);
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
					TicketABM tabm = new TicketABM();
					Ticket preticket = tabm.generarPreticket(mesa, c);
					request.setAttribute("preticket", preticket);
				}
				catch(Exception e){
					response.sendError(500, "Error en el controlador de GenerarPreticket: " + e.getMessage());
				}
				request.getRequestDispatcher("ajax/ajaxvistapreticket.jsp").forward(request, response);
	} 
}
