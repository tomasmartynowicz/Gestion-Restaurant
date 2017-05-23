package datos;

import java.util.Set;

public class Vianda {

	
	private int idVianda;
	private String nombre;
	private Set<Producto>lstProducto;
	
	
	public Vianda(){
		
	}


	public Vianda( String nombre) {
		this.nombre = nombre;
	}


	public int getIdVianda() {
		return idVianda;
	}


	protected void setIdVianda(int idVianda) {
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
		return "Vianda [idVianda=" + idVianda + ", nombre=" + nombre + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idVianda;
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
		Vianda other = (Vianda) obj;
		if (idVianda != other.idVianda)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
