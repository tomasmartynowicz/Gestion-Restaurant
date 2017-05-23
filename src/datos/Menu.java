package datos;

import java.util.GregorianCalendar;

public class Menu {

	
	private int idMenu;
	private String nombre;
	private GregorianCalendar fecha;
	private int diaDeLaSemana;
	
	
	public Menu() {
	}


	public Menu(String nombre, GregorianCalendar fecha, int diaDeLaSemana) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.diaDeLaSemana = diaDeLaSemana;
	}


	public int getIdMenu() {
		return idMenu;
	}


	protected void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
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
		return diaDeLaSemana;
	}


	public void setDiaDeLaSemana(int diaDeLaSemana) {
		this.diaDeLaSemana = diaDeLaSemana;
	}
	
	
	@Override
	public String toString() {
		return "Menu [idMenu=" + idMenu + ", nombre=" + nombre + ", fecha=" + fecha + ", diaDeLaSemana=" + diaDeLaSemana
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMenu;
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
		Menu other = (Menu) obj;
		if (idMenu != other.idMenu)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	
	
	
}
