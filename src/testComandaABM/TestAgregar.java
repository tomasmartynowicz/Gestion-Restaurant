package testComandaABM;

import negocio.ComandaABM;
import dao.EmpleadoDao;
import dao.MesaDao;
import dao.ClienteDao;
import datos.Mesa;
import datos.Cliente;
import datos.Empleado;



public class TestAgregar {

	public static void main(String[] args) {
		EmpleadoDao empleadoDao = new EmpleadoDao();
		MesaDao mesaDao = new MesaDao();
		ClienteDao clienteDao = new ClienteDao();
		
		Cliente cliente = clienteDao.traerCliente(1);
		Mesa mesa = mesaDao.traerMesa(1);
		Empleado empleado = empleadoDao.traerEmpleado(1);
		
		ComandaABM abm = new ComandaABM();
		
		abm.agregar(empleado, cliente, mesa);
		abm.agregar(empleado, cliente, mesa);
		abm.agregar(empleado, cliente, mesa);
		abm.agregar(empleado, cliente, mesa);
		abm.agregar(empleado, cliente, mesa);
		abm.agregar(empleado, cliente, mesa);
		
	}

}
