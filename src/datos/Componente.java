package datos;

public class Componente {
	
	private int idComponente;
	private double cantidad;
	private Ingrediente ingrediente;
	
	public Componente() {
	}

	public Componente(int idComponente, double cantidad, Ingrediente ingrediente) {
		this.idComponente = idComponente;
		this.cantidad = cantidad;
		this.ingrediente = ingrediente;
	}

	public int getIdComponente() {
		return idComponente;
	}

	public void setIdComponente(int idComponente) {
		this.idComponente = idComponente;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	@Override
	public String toString() {
		return "Componente [idComponente=" + idComponente + ", cantidad=" + cantidad + ", ingrediente=" + ingrediente
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cantidad);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + idComponente;
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
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
		Componente other = (Componente) obj;
		if (Double.doubleToLongBits(cantidad) != Double.doubleToLongBits(other.cantidad))
			return false;
		if (idComponente != other.idComponente)
			return false;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		return true;
	}
	
	
}
