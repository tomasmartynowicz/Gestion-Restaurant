package datos;

import java.util.Set;

public class Rubro {

	
	private int idRubro;
	private String nombre;
	private Set<Producto> lstProducto;
	
	
	public Rubro() {
	}


	public Rubro(String nombre) {
		this.nombre = nombre;
	}


	public int getIdRubro() {
		return idRubro;
	}


	protected void setIdRubro(int idRubro) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idRubro;
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
		Rubro other = (Rubro) obj;
		if (idRubro != other.idRubro)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}	
	
	
	
	
}
