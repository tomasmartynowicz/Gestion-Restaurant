package datos;

public class Usuario {

	
	private long idUsuario;
	private String nombreUsuario;
	private String clave;
	private Empleado empleado;
	
	
	
	public Usuario() {
	}


	public Usuario(String nombreUsuario, String clave, Empleado empleado) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
		this.setEmpleado(empleado);
	}



	public long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getNombreUsuario() {
		return nombreUsuario;
	}



	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", clave=" + clave
				+ ", empleado=" + empleado + "]";
	}
	
	
	
	
}
