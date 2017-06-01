package datos;

import java.util.Set;

public class Vianda {

	
	private long idVianda;
	private String nombre;
	private Set<Producto>lstProducto;
	
	
	public Vianda(){
		
	}


	public Vianda( String nombre) {
		this.nombre = nombre;
	}


	public long getIdVianda() {
		return idVianda;
	}


	protected void setIdVianda(long idVianda) {
		this.idVianda = idVianda;
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
		return "Vianda [idVianda=" + idVianda + ", nombre=" + nombre + ", lstProducto=" + lstProducto + "]";
	}

	
		
	
	
	
}
