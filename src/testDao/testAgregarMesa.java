package testDao;

import dao.CategoriaDao;
import dao.EmpleadoDao;
import dao.MesaDao;
import dao.UsuarioDao;
import datos.Categoria;
import datos.Empleado;
import datos.Mesa;
import datos.Usuario;
import negocio.MesaABM;
import negocio.UsuarioABM;

public class testAgregarMesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioABM uabm = new UsuarioABM();
		EmpleadoDao edao = new EmpleadoDao();
		CategoriaDao cdao = new CategoriaDao();
		Empleado e = edao.traerEmpleado(1);
		Categoria c = cdao.traerCategoria(1);
		try{
			uabm.altaDeUsuario(e, "Damian3332221", "1234", c);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
