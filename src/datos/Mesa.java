package datos;

import java.util.Set;

public class Mesa {
	private int idMesa;
	private int nroMesa;
	private int capacidad;
	private int salon;
	private int union;
	private char estado;
	private Set<Comanda> lstComanda;
	private Set<ReporteMesa>lstReporteMesa;
	
	
	public Mesa() {
	}


	public Mesa(int nroMesa, int capacidad, int salon, int union, char estado) {
		this.nroMesa = nroMesa;
		this.capacidad = capacidad;
		this.salon = salon;
		this.union = union;
		this.estado = estado;
	}


	public int getIdMesa() {
		return idMesa;
	}


	protected void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}


	public int getNroMesa() {
		return nroMesa;
	}


	public void setNroMesa(int nroMesa) {
		this.nroMesa = nroMesa;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getSalon() {
		return salon;
	}


	public void setSalon(int salon) {
		this.salon = salon;
	}


	public int getUnion() {
		return union;
	}


	public void setUnion(int union) {
		this.union = union;
	}


	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}


	public Set<Comanda> getLstComanda() {
		return lstComanda;
	}


	public void setLstComanda(Set<Comanda> lstComanda) {
		this.lstComanda = lstComanda;
	}


	public Set<ReporteMesa> getLstReporteMesa() {
		return lstReporteMesa;
	}


	public void setLstReporteMesa(Set<ReporteMesa> lstReporteMesa) {
		this.lstReporteMesa = lstReporteMesa;
	}


	@Override
	public String toString() {
		return "Mesa [idMesa=" + idMesa + ", nroMesa=" + nroMesa + ", capacidad=" + capacidad + ", salon=" + salon
				+ ", union=" + union + ", estado=" + estado + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidad;
		result = prime * result + idMesa;
		result = prime * result + nroMesa;
		result = prime * result + salon;
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
		Mesa other = (Mesa) obj;
		if (capacidad != other.capacidad)
			return false;
		if (idMesa != other.idMesa)
			return false;
		if (nroMesa != other.nroMesa)
			return false;
		if (salon != other.salon)
			return false;
		return true;
	}	
	

}
