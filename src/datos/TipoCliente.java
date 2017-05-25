package datos;

public class TipoCliente {
	
	private long idTipoCliente;
	private String nombre;
	
	
	
	
	public TipoCliente() {
	}




	public TipoCliente(String nombre) {
		this.nombre = nombre;
	}




	public long getIdTipoCliente() {
		return idTipoCliente;
	}




	protected void setIdTipoCliente(long idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	@Override
	public String toString() {
		return "TipoCliente [idTipoCliente=" + idTipoCliente + ", nombre="
				+ nombre + "]";
	}
	
	
	
	

}
