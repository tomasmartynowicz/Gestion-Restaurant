package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class HistorialComanda {
	
	private int idHistorialComanda;
	private Empleado empleado;
	private GregorianCalendar fechaYHora;
	private Mesa mesa;
	private Ticket ticket;
	private Set<Producto> lstProducto;
	
	
	
	public HistorialComanda() {
	}



	public HistorialComanda(int idHistorialComanda, Empleado empleado, GregorianCalendar fechaYHora, Mesa mesa,
			Ticket ticket) {
		this.idHistorialComanda = idHistorialComanda;
		this.empleado = empleado;
		this.fechaYHora = fechaYHora;
		this.mesa = mesa;
		this.ticket = ticket;
	}



	public int getIdHistorialComanda() {
		return idHistorialComanda;
	}



	public void setIdHistorialComanda(int idHistorialComanda) {
		this.idHistorialComanda = idHistorialComanda;
	}



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public GregorianCalendar getFechaYHora() {
		return fechaYHora;
	}



	public void setFechaYHora(GregorianCalendar fechaYHora) {
		this.fechaYHora = fechaYHora;
	}



	public Mesa getMesa() {
		return mesa;
	}



	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}



	public Ticket getTicket() {
		return ticket;
	}



	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}



	public Set<Producto> getLstProducto() {
		return lstProducto;
	}



	public void setLstProducto(Set<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}



	@Override
	public String toString() {
		return "HistorialComanda [idHistorialComanda=" + idHistorialComanda + ", empleado=" + empleado + ", fechaYHora="
				+ fechaYHora + ", mesa=" + mesa + ", ticket=" + ticket + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idHistorialComanda;
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
		HistorialComanda other = (HistorialComanda) obj;
		if (idHistorialComanda != other.idHistorialComanda)
			return false;
		return true;
	}
	
	
	

	
}
