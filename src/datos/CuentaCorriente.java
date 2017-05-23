package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class CuentaCorriente {
	
	private int idCuentaCorriente;
	private String descripcion;
	private GregorianCalendar fechaAlta;
	private boolean baja;
	private Set<Cliente> lstClientes;
	
	
	public CuentaCorriente() {
	}
	
	public CuentaCorriente( String descripcion, GregorianCalendar fechaAlta, boolean baja) {
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.baja = baja;
	}


	public int getIdCuentaCorriente() {
		return idCuentaCorriente;
	}


	protected void setIdCuentaCorriente(int idCuentaCorriente) {
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


	public Set<Cliente> getLstClientes() {
		return lstClientes;
	}


	public void setLstClientes(Set<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [idCuentaCorriente=" + idCuentaCorriente + ", descripcion=" + descripcion
				+ ", fechaAlta=" + fechaAlta + ", baja=" + baja + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCuentaCorriente;
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
		CuentaCorriente other = (CuentaCorriente) obj;
		if (idCuentaCorriente != other.idCuentaCorriente)
			return false;
		return true;
	}
	
	
	
	

}
