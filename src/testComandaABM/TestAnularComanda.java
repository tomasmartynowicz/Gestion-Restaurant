package testComandaABM;

import negocio.ComandaABM;
import datos.Comanda;

public class TestAnularComanda {

	public static void main(String[] args) {
		ComandaABM abm = new ComandaABM();
		
		try {
			abm.eliminar(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
