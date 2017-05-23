package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Comanda {

	
	private int idComanda;
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


	public int getIdComanda() {
		return idComanda;
	}


	protected void setIdComanda(int idComanda) {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idComanda;
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
		Comanda other = (Comanda) obj;
		if (idComanda != other.idComanda)
			return false;
		return true;
	}
	
	
	
	
}
