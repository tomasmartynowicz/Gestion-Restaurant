package datos;

public class Cliente {
	
	private int idCliente;
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


	public int getIdCliente() {
		return idCliente;
	}


	protected void setIdCliente(int idCliente) {
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
		return "Cliente [idCliente=" + idCliente + ", tipoCliente=" + tipoCliente + ", dni=" + dni + ", habitacion="
				+ habitacion + ", cuentaCorriente=" + cuentaCorriente + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		result = prime * result + idCliente;
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
		Cliente other = (Cliente) obj;
		if (dni != other.dni)
			return false;
		if (idCliente != other.idCliente)
			return false;
		return true;
	}
	
	
	
	
	
	

}
