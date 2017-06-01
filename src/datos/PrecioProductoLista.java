package datos;

import java.util.Set;

public class PrecioProductoLista {

	private long idPrecioProductoLista;
	private Producto producto;
	private ListaPrecio listaPrecio;
	private double precio;
	
	
	public PrecioProductoLista() {
	}


	public PrecioProductoLista(Producto producto, double precio) {
		super();
		this.producto = producto;
		this.precio = precio;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public ListaPrecio getListaPrecio() {
		return listaPrecio;
	}


	public void setListaPrecio(ListaPrecio listaPrecio) {
		this.listaPrecio = listaPrecio;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public long getIdPrecioProductoLista() {
		return idPrecioProductoLista;
	}


	public void setIdPrecioProductoLista(long idPrecioProductoLista) {
		this.idPrecioProductoLista = idPrecioProductoLista;
	}


	@Override
	public String toString() {
		return "PrecioProductoLista [idPrecioProductoLista=" + idPrecioProductoLista + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
