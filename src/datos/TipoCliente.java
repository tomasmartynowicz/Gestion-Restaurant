package datos;

public class TipoCliente {
	
	private int idTipoCliente;
	private String nombre;
	
	
	
	
	public TipoCliente() {
	}




	public TipoCliente(String nombre) {
		this.nombre = nombre;
	}




	public int getIdTipoCliente() {
		return idTipoCliente;
	}




	protected void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTipoCliente;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		TipoCliente other = (TipoCliente) obj;
		if (idTipoCliente != other.idTipoCliente)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	

}
