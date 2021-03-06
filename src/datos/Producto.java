package datos;

import java.util.Set;

public class Producto {
	
	private long idProducto;
	private String nombre;
	private String descripcion;
	private boolean baja;
	private Set<Componente> lstComponente;
	private Set<PrecioProductoLista> lstPrecioProductoLista;
	private Rubro rubro;
	private Set<Subrubro> lstSubrubro;
	
	public Producto() {
	}

	public Producto(String nombre, String descripcion, boolean baja, Rubro rubro) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.baja = baja;
		this.rubro = rubro;
	}

	public long getIdProducto() {
		return idProducto;
	}

	protected void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
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

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Set<Componente> getLstComponente() {
		return lstComponente;
	}

	public void setLstComponente(Set<Componente> lstComponente) {
		this.lstComponente = lstComponente;
	}

	public Set<PrecioProductoLista> getLstPrecioProductoLista() {
		return lstPrecioProductoLista;
	}

	public void setLstPrecioProductoLista(Set<PrecioProductoLista> lstPrecioProductoLista) {
		this.lstPrecioProductoLista = lstPrecioProductoLista;
	}

	public Rubro getRubro() {
		return rubro;
	}

	public void setRubro(Rubro rubro) {
		this.rubro = rubro;
	}

	public Set<Subrubro> getLstSubrubro() {
		return lstSubrubro;
	}

	public void setLstSubrubro(Set<Subrubro> lstSubrubro) {
		this.lstSubrubro = lstSubrubro;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", baja="
				+ baja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idProducto ^ (idProducto >>> 32));
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
		Producto other = (Producto) obj;
		if (idProducto != other.idProducto)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	
	

}
