package datos;

import java.util.Set;

public class Categoria {
	private long idCategoria;
	private String nombre;
	private String descripcion;
	private Set<Permiso> lstPermiso;
	
	public Categoria(){}
	
	public Categoria(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Permiso> getLstPermiso() {
		return lstPermiso;
	}

	public void setLstPermiso(Set<Permiso> lstPermiso) {
		this.lstPermiso = lstPermiso;
	}
	
	
}
