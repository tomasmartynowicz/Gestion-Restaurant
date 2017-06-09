package datos;

public class Permiso {
	private long idPermiso;
	private String nombre;
	private String descripcion;
	
	public Permiso(){}
	
	public Permiso(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public long getIdPermiso() {
		return idPermiso;
	}


	public void setIdPermiso(long idPermiso) {
		this.idPermiso = idPermiso;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
