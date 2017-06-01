package testComandaABM;

import negocio.ComandaABM;
import datos.Comanda;
import dao.ProductoDao;
import datos.Producto;

public class TestAgregarProducto {

	public static void main(String[] args) {
		ComandaABM abm = new ComandaABM();
		ProductoDao productoDao = new ProductoDao();
		
		try {
			Producto producto = productoDao.traerProducto(1);
			abm.agregarProducto(1, producto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
