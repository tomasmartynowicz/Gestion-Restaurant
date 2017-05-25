package datos;

public class Ingrediente {
	
	private long idIngrediente;
	private String nombre;
	private double stock;
	private String unidad;
	
	
	public Ingrediente() {
	}


	public Ingrediente(String nombre, double stock, String unidad) {
		this.nombre = nombre;
		this.stock = stock;
		this.unidad = unidad;
	}


	public long getIdIngrediente() {
		return idIngrediente;
	}


	protected void setIdIngrediente(long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getStock() {
		return stock;
	}


	public void setStock(double stock) {
		this.stock = stock;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}


	@Override
	public String toString() {
		return "Ingrediente [idIngrediente=" + idIngrediente + ", nombre=" + nombre + ", stock=" + stock + ", unidad="
				+ unidad + "]";
	}
	
	
	
	
	
	
	
	

}
