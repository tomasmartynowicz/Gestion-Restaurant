package datos;

public class Componente {
	
	private long idComponente;
	private double cantidad;
	private Ingrediente ingrediente;
	
	
	
	
	public Componente() {
	}




	public Componente( double cantidad, Ingrediente ingrediente) {
		this.cantidad = cantidad;
		this.ingrediente = ingrediente;
	}




	public long getIdComponente() {
		return idComponente;
	}




	protected void setIdComponente(long idComponente) {
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
	
	
	
	

}
