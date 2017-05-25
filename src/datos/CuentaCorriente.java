package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class CuentaCorriente {
	
	private long idCuentaCorriente;
	private String descripcion;
	private GregorianCalendar fechaAlta;
	private boolean baja;
	private Set<Cliente> lstCliente;
	private double total;
	
	
	
	
	
	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public CuentaCorriente() {
	}


	public CuentaCorriente( String descripcion, GregorianCalendar fechaAlta, boolean baja) {
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.baja = baja;
	}


	public long getIdCuentaCorriente() {
		return idCuentaCorriente;
	}


	protected void setIdCuentaCorriente(long idCuentaCorriente) {
		this.idCuentaCorriente = idCuentaCorriente;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}


	public void setFechaAlta(GregorianCalendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}


	public boolean isBaja() {
		return baja;
	}


	public void setBaja(boolean baja) {
		this.baja = baja;
	}


	public Set<Cliente> getLstCliente() {
		return lstCliente;
	}


	public void setLstCliente(Set<Cliente> lstCliente) {
		this.lstCliente = lstCliente;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [idCuentaCorriente=" + idCuentaCorriente
				+ ", descripcion=" + descripcion + ", fechaAlta=" + fechaAlta
				+ ", baja=" + baja + ", lstCliente=" + lstCliente + ", total="
				+ total + "]";
	}

	

}
