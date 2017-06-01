package datos;

import java.util.Set;

public class Mesa {
	
	private long idMesa;
	private int nroMesa;
	private int capacidad;
	private int salon;
	private int union;
	private int estado;
	private Set<Comanda> lstComanda;
	private Set<ReporteMesa>lstReporteMesa;
	
	
	public Mesa() {
	}


	public Mesa(int nroMesa, int capacidad, int salon, int union, int estado) {
		this.nroMesa = nroMesa;
		this.capacidad = capacidad;
		this.salon = salon;
		this.union = union;
		this.estado = estado;
	}


	public long getIdMesa() {
		return idMesa;
	}


	protected void setIdMesa(long idMesa) {
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


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
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


	
	
	

}
