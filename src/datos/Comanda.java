package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Comanda {

	
	private long idComanda;
	private Empleado empleado;
	private Cliente cliente;
	private int estado;
	private GregorianCalendar fechaYHora;
	private Mesa mesa;
	private Set<Producto>lstProducto;
	
	
	public Comanda() {
	}


	public Comanda(Empleado empleado, Cliente cliente, int estado, GregorianCalendar fechaYHora, Mesa mesa) {
		this.empleado = empleado;
		this.cliente = cliente;
		this.estado = estado;
		this.fechaYHora = fechaYHora;
		this.mesa = mesa;
	}


	public long getIdComanda() {
		return idComanda;
	}


	protected void setIdComanda(long idComanda) {
		this.idComanda = idComanda;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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


	public Mesa getMesa() {
		return mesa;
	}


	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}


	public Set<Producto> getLstProducto() {
		return lstProducto;
	}


	public void setLstProducto(Set<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}


	@Override
	public String toString() {
		return "Comanda [idComanda=" + idComanda + ", empleado=" + empleado + ", cliente=" + cliente + ", estado="
				+ estado + ", fechaYHora=" + fechaYHora + ", mesa=" + mesa + "]";
	}
	
	
	
	
}
