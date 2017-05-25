package datos;

import java.util.GregorianCalendar;

public class ReporteMesa {

	
	private long idReporteMesa;
	private GregorianCalendar fechaInicio;
	
	public ReporteMesa() {
	}

	public ReporteMesa(char estado, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
		this.fechaInicio = fechaInicio;
	}

	public long getIdReporteMesa() {
		return idReporteMesa;
	}

	protected void setIdReporteMesa(long idReporteMesa) {
		this.idReporteMesa = idReporteMesa;
	}


	public GregorianCalendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(GregorianCalendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "ReporteMesa [idReporteMesa=" + idReporteMesa + ", fechaInicio="
				+ fechaInicio + "]";
	}


	
	
}
