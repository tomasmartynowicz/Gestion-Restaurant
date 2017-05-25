package datos;

import java.util.Set;

public class Rubro {

	
	private long idRubro;
	private String nombre;
	private Set<Producto> lstProducto;
	
	
	public Rubro() {
	}


	public Rubro(String nombre) {
		this.nombre = nombre;
	}


	public long getIdRubro() {
		return idRubro;
	}


	protected void setIdRubro(long idRubro) {
		this.idRubro = idRubro;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Set<Producto> getLstProducto() {
		return lstProducto;
	}


	public void setLstProducto(Set<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}


	@Override
	public String toString() {
		return "Rubro [idRubro=" + idRubro + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
}
