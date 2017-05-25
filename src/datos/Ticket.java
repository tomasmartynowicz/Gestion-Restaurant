package datos;

import java.util.GregorianCalendar;

public class Ticket {

	
	private long idTicket;
	private Cliente cliente;
	private Mesa mesa;
	private boolean cortesia;
	private Empleado empleado;
	private int estado;
	private GregorianCalendar fechaYHora;
	
	public Ticket() {
	}

	public Ticket(Cliente cliente, Mesa mesa, boolean cortesia, Empleado empleado, int estado,
			GregorianCalendar fechaYHora) {
		this.cliente = cliente;
		this.mesa = mesa;
		this.cortesia = cortesia;
		this.empleado = empleado;
		this.estado = estado;
		this.fechaYHora = fechaYHora;
	}

	public long getIdTicket() {
		return idTicket;
	}

	protected void setIdTicket(long idTicket) {
		this.idTicket = idTicket;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public boolean isCortesia() {
		return cortesia;
	}

	public void setCortesia(boolean cortesia) {
		this.cortesia = cortesia;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public GregorianCalendar getFechaYHora() {
		return fechaYHora;
	}

	public void setFechaYHora(GregorianCalendar fechaYHora) {
		this.fechaYHora = fechaYHora;
	}

	@Override
	public String toString() {
		return "Ticket [idTicket=" + idTicket + ", cliente=" + cliente + ", mesa=" + mesa + ", cortesia=" + cortesia
				+ ", empleado=" + empleado + ", estado=" + estado + ", fechaYHora=" + fechaYHora + "]";
	}
	
	
	
	
	
}
