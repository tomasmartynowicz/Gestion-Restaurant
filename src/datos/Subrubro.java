package datos;

public class Subrubro {
	
	private long idSubrubro;
	private String nombre;
	
	
	public Subrubro() {
	}


	public Subrubro( String nombre) {
		this.nombre = nombre;
	}


	public long getIdSubrubro() {
		return idSubrubro;
	}


	protected void setIdSubrubro(long idSubrubro) {
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
	
	
	

}
