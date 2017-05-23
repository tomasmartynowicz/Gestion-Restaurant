package datos;

public class Subrubro {
	private int idSubrubro;
	private String nombre;
	
	
	public Subrubro() {
	}


	public Subrubro( String nombre) {
		this.nombre = nombre;
	}


	public int getIdSubrubro() {
		return idSubrubro;
	}


	protected void setIdSubrubro(int idSubrubro) {
		this.idSubrubro = idSubrubro;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Subrubro [idSubrubro=" + idSubrubro + ", nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSubrubro;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Subrubro other = (Subrubro) obj;
		if (idSubrubro != other.idSubrubro)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	

}
