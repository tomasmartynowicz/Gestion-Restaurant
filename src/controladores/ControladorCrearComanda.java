package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ClienteDao;
import dao.MesaDao;
import dao.TipoClienteDao;
import datos.Cliente;
import datos.Empleado;
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
				
				String mensaje;
				try{
					response.setContentType("text/html;charset=UTF-8");
					int idMesa = Integer.parseInt(request.getParameter("idMesa"));
					int dni = Integer.parseInt(request.getParameter("dni"));
					HttpSession session = request.getSession();
					Empleado empleado = (Empleado)session.getAttribute("empleado");
					MesaDao mesadao = new MesaDao();
					
					Mesa mesa = mesadao.traerMesa((long)idMesa);
					ClienteDao cdao = new ClienteDao();
					Cliente c = cdao.traerCliente(dni);
					if(c==null){
						c = new Cliente();
						c.setDni(dni);
						TipoClienteDao tcdao = new TipoClienteDao();
						c.setTipoCliente(tcdao.traerTipoCliente(2));
						int idCliente = cdao.agregar(c);
						c = cdao.traerCliente((long)idCliente);
					}
					ComandaABM coabm = new ComandaABM();
					coabm.agregar(empleado, c, mesa); //NO RECIBE EMPLEADO??
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
