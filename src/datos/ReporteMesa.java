package datos;

import java.util.GregorianCalendar;

public class ReporteMesa {

	
	private int idReporteMesa;
	private char estado;
	private GregorianCalendar fechaInicio;
	private GregorianCalendar fechaFin;
	
	public ReporteMesa() {
	}

	public ReporteMesa(char estado, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public int getIdReporteMesa() {
		return idReporteMesa;
	}

	protected void setIdReporteMesa(int idReporteMesa) {
		this.idReporteMesa = idReporteMesa;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public GregorianCalendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(GregorianCalendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public GregorianCalendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(GregorianCalendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "ReporteMesa [idReporteMesa=" + idReporteMesa + ", estado=" + estado + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + "]";
	}
	
	
	
	
}
