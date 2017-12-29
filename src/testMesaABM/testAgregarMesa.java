package testMesaABM;

import datos.Mesa;
import negocio.MesaABM;

public class testAgregarMesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			MesaABM m= new MesaABM();
			//crear mesa
			/*
			int nroMesa=1;
			int salon=1;
			int cantidadComensales=5;
			System.out.println("Mesa que se crea: "+m.crearMesa(cantidadComensales, salon, nroMesa));
		*/
			
			//modificar mesa
		/*	Mesa m1=m.traerMesa(3);
			m1.setNroMesa(1);
			m1.setCapacidad(5);
			m1.setUnion(0);
			
			m.modificarMesa(m1);
		 */ 
		
		
			//ELIMINAR MESA.
			/*int nroMesa=1;
			
			m.eliminarMesa(nroMesa);
			*/
			
			
			//Redefinir mesa -- este metodo cambia el campo union , y le asigna el id de la primera mesa
			// a las 2 mesas que se estan uniendo
			Mesa mesa2=m.traerMesa(2);
			Mesa mesa3=m.traerMesa(3);
			
			m.redefinirMesa(mesa2, mesa3);
			
			
			
			
			/*
			//traer mesas por salon
			int salon=1;
			System.out.println(""+m.traerMesas(salon));
		*/
		}
		catch(Exception e){
			System.out.println("Excepcion: "+e.getMessage());
		}
		
	}

}
