package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class ListaPrecio {
	
	private int idListaPrecio;
	private String descripcion;
	private TipoCliente tipoCliente;
	private boolean baja;
	private GregorianCalendar fechaVigencia;
	private Set<PrecioProductoLista> lstPrecioProductoLista;
	
	
	
	
	public ListaPrecio() {
	}



	public ListaPrecio(String descripcion, TipoCliente tipoCliente, boolean baja, GregorianCalendar fechaVigencia) {
		this.descripcion = descripcion;
		this.tipoCliente = tipoCliente;
		this.baja = baja;
		this.fechaVigencia = fechaVigencia;
	}



	public int getIdListaPrecio() {
		return idListaPrecio;
	}



	protected void setIdListaPrecio(int idListaPrecio) {
		this.idListaPrecio = idListaPrecio;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}



	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}



	public boolean isBaja() {
		return baja;
	}



	public void setBaja(boolean baja) {
		this.baja = baja;
	}



	public GregorianCalendar getFechaVigencia() {
		return fechaVigencia;
	}



	public void setFechaVigencia(GregorianCalendar fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}



	public Set<PrecioProductoLista> getLstPrecioProductoLista() {
		return lstPrecioProductoLista;
	}



	public void setLstPrecioProductoLista(Set<PrecioProductoLista> lstPrecioProductoLista) {
		this.lstPrecioProductoLista = lstPrecioProductoLista;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idListaPrecio;
		result = prime * result + ((tipoCliente == null) ? 0 : tipoCliente.hashCode());
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
		ListaPrecio other = (ListaPrecio) obj;
		if (idListaPrecio != other.idListaPrecio)
			return false;
		if (tipoCliente == null) {
			if (other.tipoCliente != null)
				return false;
		} else if (!tipoCliente.equals(other.tipoCliente))
			return false;
		return true;
	}
	

	
	
}
