package testComandaABM;

import negocio.ComandaABM;
import datos.Producto;
import datos.Comanda;
import dao.ProductoDao;

public class TestEliminarProducto {
	
	public static void main(String[] args) {
		
		
		try {
			ComandaABM abm = new ComandaABM();
			ProductoDao productoDao = new ProductoDao();
			
			Producto producto = productoDao.traerProducto(1);
			abm.eliminarProducto(1, producto);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
