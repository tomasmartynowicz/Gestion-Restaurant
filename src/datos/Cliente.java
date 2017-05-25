package datos;

public class Cliente {
	
	private long idCliente;
	private TipoCliente tipoCliente;
	private int dni;  
	private int habitacion;
	private CuentaCorriente cuentaCorriente;
	
	
	
	public Cliente() {
	}


	public Cliente(TipoCliente tipoCliente, int dni, int habitacion, CuentaCorriente cuentaCorriente) {
		this.tipoCliente = tipoCliente;
		this.dni = dni;
		this.habitacion = habitacion;
		this.cuentaCorriente = cuentaCorriente;
	}


	public long getIdCliente() {
		return idCliente;
	}


	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}


	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}


	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public int getHabitacion() {
		return habitacion;
	}


	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}


	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}


	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}


	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", tipoCliente="
				+ tipoCliente + ", dni=" + dni + ", habitacion=" + habitacion
				+ "]";
	}
	
	
	

}
