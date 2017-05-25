package test;

import java.util.List;

import dao.CuentaCorrienteDao;
import dao.EmpleadoDao;
import dao.UsuarioDao;
import datos.CuentaCorriente;
import datos.Empleado;
import datos.Usuario;


public class TestEmpleadoDao {

		public static void main(String[] args) {
			CuentaCorrienteDao ccdao = new CuentaCorrienteDao();
			long id = 1;
			System.out.println("\n---> TraerPrestamo idPrestamo=" + id
					+ "\n\n");
			try{
				CuentaCorriente cc = ccdao.traerCuentaCorrienteYCliente(id);
				System.out.println("El empleado es este..." + cc);
				}
			catch (Exception e){
				System.out.println(e);
			}
		}
		
}

