package negocio;

import dao.UsuarioDao;
import datos.Categoria;
import datos.Empleado;
import datos.Usuario;

public class UsuarioABM {
	private UsuarioDao dao= new UsuarioDao();
	
	//Si usuario no existe, o clave es erronea.. devuelve NULL
	public Usuario iniciarSesion(String usuario, String pass){
		Usuario u = dao.traerUsuario(usuario);
		if(u != null){
			if(u.getClave() != pass) u = null;
		}
		return u;
	}
	
	public Usuario altaDeUsuario(Empleado empleado, String nombreUsuario, String clave, Categoria categoria)throws Exception{
		nombreUsuario= nombreUsuario.toLowerCase(); //nombres de usuario se convierten en minusculas
		Usuario u = dao.traerUsuario(empleado);
		if((u != null) && !u.isBaja()) throw new Exception("El empleado ya tiene un usuario");
		Usuario u2 = dao.traerUsuario(nombreUsuario);
		
		if(u == null){ //el empleado no tiene usuario
			if(u2 != null) throw new Exception("El nombre de usuario ya está en uso");
			u = new Usuario(nombreUsuario, clave, empleado, categoria);
			dao.agregar(u); //se crea usuario
		}
		else{ //el empleado tiene usuario pero dado de baja
			if((u2 != null) && (u2.getEmpleado().getIdEmpleado() != empleado.getIdEmpleado())) throw new Exception("El nombre de usuario ya está en uso");
			u.setNombreUsuario(nombreUsuario);
			u.setClave(clave);
			u.setCategoria(categoria);
			u.setEmpleado(empleado);
			u.setBaja(false);
			dao.actualizar(u); //se reemplazan todos los atrib y se da de alta
		}
		return u;
	}
	
	public Usuario bajaDeUsuario(Usuario usuario){
		usuario.setBaja(true);
		dao.actualizar(usuario);
		return usuario;
	}
	
	public Usuario modificarUsuario(Usuario usuario){
		dao.actualizar(usuario);
		return usuario;
	}
}
