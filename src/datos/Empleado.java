package datos;

public class Empleado {
	
	private long idEmpleado;
	private String tipoEmpleado;
	private String nombre;
	private String apellido;
	
	
	
	public Empleado() {
	}



	public Empleado(String tipoEmpleado, String nombre, String apellido, Usuario usuario) {
		this.tipoEmpleado = tipoEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
	}



	public long getIdEmpleado() {
		return idEmpleado;
	}



	protected void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}



	public String getTipoEmpleado() {
		return tipoEmpleado;
	}



	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", tipoEmpleado="
				+ tipoEmpleado + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}
	
	
}
