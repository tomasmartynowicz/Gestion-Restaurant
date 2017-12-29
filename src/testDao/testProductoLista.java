package testDao;

import datos.Comanda;
import datos.Producto;
import negocio.ComandaABM;

public class testProductoLista {

	public static void main(String[] args) {
		ComandaABM cabm = new ComandaABM();
		try{
			Comanda c = cabm.traerComanda(1);
			for(Producto p: c.getLstProducto()){
				c.getLstProducto().remove(p);
			}
			System.out.println(c.getLstProducto());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
