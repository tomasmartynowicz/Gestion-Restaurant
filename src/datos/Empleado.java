package datos;

public class Empleado {
	
	private int idEmpleado;
	private String tipoEmpleado;
	private String nombre;
	private String apellido;
	private Usuario usuario;
	
	
	
	public Empleado() {
	}



	public Empleado(String tipoEmpleado, String nombre, String apellido, Usuario usuario) {
		this.tipoEmpleado = tipoEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
	}



	public int getIdEmpleado() {
		return idEmpleado;
	}



	protected void setIdEmpleado(int idEmpleado) {
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



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", tipoEmpleado=" + tipoEmpleado + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", usuario=" + usuario + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpleado;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (idEmpleado != other.idEmpleado)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
	
	

	
	
}
