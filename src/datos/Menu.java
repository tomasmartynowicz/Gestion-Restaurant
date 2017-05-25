package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Menu {

	
	private long idMenu;
	private String nombre;
	private GregorianCalendar fecha;
	private int diaDeSemana;
	private Set<Producto> lstProducto;
	
	


	public Menu() {
	}


	public Menu(String nombre, GregorianCalendar fecha, int diaDeLaSemana) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.diaDeSemana = diaDeLaSemana;
	}


	public long getIdMenu() {
		return idMenu;
	}


	protected void setIdMenu(long idMenu) {
		this.idMenu = idMenu;
	}


	public Set<Producto> getLstProducto() {
		return lstProducto;
	}


	public void setLstProducto(Set<Producto> lstProducto) {
		this.lstProducto = lstProducto;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public GregorianCalendar getFecha() {
		return fecha;
	}


	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}


	public int getDiaDeLaSemana() {
		return diaDeSemana;
	}


	public void setDiaDeLaSemana(int diaDeLaSemana) {
		this.diaDeSemana = diaDeLaSemana;
	}
	
	
	@Override
	public String toString() {
		return "Menu [idMenu=" + idMenu + ", nombre=" + nombre + ", fecha=" + fecha + ", diaDeLaSemana=" + diaDeSemana
				+ "]";
	}
	
	
	
	
}
