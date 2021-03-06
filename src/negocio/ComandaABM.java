package negocio;


import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.List;

import datos.Producto;
import datos.Mesa;
import datos.Empleado;
import datos.Cliente;
import datos.Comanda;
import dao.ComandaDao;

public class ComandaABM {
	private ComandaDao dao = new ComandaDao();
	
	public Comanda traerComanda(long idComanda) throws Exception{
		Comanda comanda = dao.traerComanda(idComanda);
		
		if(comanda == null) throw new Exception("ERROR, la mesa que desea eliminar no existe");
		
		return comanda;
	}
	
	public int agregar(Empleado empleado, Cliente cliente, Mesa mesa) {
		GregorianCalendar fechaYHora = 
				new GregorianCalendar(TimeZone.getTimeZone("America/Buenos_Aires"));
		
		//TODO Verificar que la mesa exista
		
		Comanda comanda = new Comanda( empleado, cliente
						, fechaYHora
						, mesa);
				
		return dao.agregar(comanda);
	}
	
	public void modificar(Comanda comanda) throws Exception {
		traerComanda(comanda.getIdComanda());
		
		dao.actualizar(comanda);
	}
	
	public void eliminar(long idComanda) throws Exception {
		Comanda comanda = traerComanda(idComanda);
		
		dao.eliminar(comanda);
	}
	
	public void agregarProducto(long idComanda, Producto producto) throws Exception {
		//TODO verificar que el producto existe?
		
		Comanda comanda = traerComanda(idComanda);
		
		comanda.agregar(producto);
		
		dao.actualizar(comanda);
	}
	
	public void eliminarProducto(long idComanda, Producto producto) throws Exception {
		Comanda comanda = traerComanda(idComanda);
		
		comanda.eliminar(producto);
		
		dao.actualizar(comanda);
	}
	
	public List<Comanda> traerComandaPorEmpleado(long idEmpleado) throws Exception {
		List<Comanda> comandas = dao.traerComandaPorEmpleado(idEmpleado);
		
		if(comandas == null) throw new Exception("ERROR, el empleado de id '" + idEmpleado + "' no tiene ninguna comanda registrada");
		
		return comandas;
	}
	
	public Comanda traerComandaYProductos(long idComanda) throws Exception{
		Comanda comanda = dao.traerComandaYProductos(idComanda);
		
		if(comanda == null) throw new Exception("ERROR, la mesa que desea eliminar no existe");
		
		return comanda;
	}
	
	public List<Comanda> traerComandaPorFecha(GregorianCalendar fechaYHora)throws Exception{
		List<Comanda> comandas=dao.traerComandaPorFecha(fechaYHora);
		if(comandas==null) throw new Exception("ERROR, no existe comandas en la fecha");
		return comandas;
	}
	
	
}
