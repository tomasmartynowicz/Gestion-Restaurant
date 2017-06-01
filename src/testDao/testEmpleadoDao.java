package testDao;

import java.util.List;

import dao.ClienteDao;
import dao.ComandaDao;
import dao.ComponenteDao;
import dao.CuentaCorrienteDao;
import dao.EmpleadoDao;
import dao.HistorialComandaDao;
import dao.IngredienteDao;
import dao.ListaPrecioDao;
import dao.MenuDao;
import dao.MesaDao;
import dao.ProductoDao;
import dao.TicketDao;
import dao.UsuarioDao;
import dao.ViandaDao;
import datos.Comanda;
import datos.Componente;
import datos.CuentaCorriente;
import datos.Empleado;
import datos.HistorialComanda;
import datos.Ingrediente;
import datos.ListaPrecio;
import datos.Menu;
import datos.Mesa;
import datos.PrecioProductoLista;
import datos.Producto;
import datos.Ticket;
import datos.Usuario;
import datos.Vianda;
import negocio.TicketABM;

public class testEmpleadoDao {

	public static void main(String[] args) {
		TicketABM tabm = new TicketABM();
		MesaDao mesadao = new MesaDao();
		ClienteDao cdao= new ClienteDao();
		int id = 3;
		System.out.println("\n---> TraerPrestamo idPrestamo=" + id
				+ "\n\n");
		try{
			Ticket obj = tabm.generarPreticket(mesadao.traerMesa(3), cdao.traerCliente(1));
			System.out.println("PreTicket:" + obj);
			System.out.println(obj.getMesa());
			System.out.println(obj.getMesa().getLstComanda());
			for(Comanda c: obj.getMesa().getLstComanda()){
				System.out.println(c.getLstProducto());
				for(Producto p: c.getLstProducto()){
					System.out.println(p.getLstPrecioProductoLista());
					for(PrecioProductoLista ppl: p.getLstPrecioProductoLista()){
						System.out.println(ppl.getListaPrecio());
						System.out.println(ppl.getListaPrecio().getTipoCliente());
					}
				}
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
