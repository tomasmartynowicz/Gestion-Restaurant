package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class ListaPrecio {
	
	private long idListaPrecio;
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



	public long getIdListaPrecio() {
		return idListaPrecio;
	}



	protected void setIdListaPrecio(long idListaPrecio) {
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
	public String toString() {
		return "ListaPrecio [idListaPrecio=" + idListaPrecio + ", descripcion=" + descripcion + ", baja=" + baja
				+ ", fechaVigencia=" + fechaVigencia + "]";
	}




	

	
	
}
