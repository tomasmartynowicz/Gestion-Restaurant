package negocio;

import java.util.List;

import dao.MesaDao;
import datos.Mesa;

public class MesaABM {
	MesaDao dao = new MesaDao();
	
	public Mesa traerMesaYDetalle(int nro){
		return dao.traerMesaYDetalle(nro);
	}
	
	
	public Mesa traerMesa(int nroMesa)throws Exception{
		Mesa m=dao.traerMesa(nroMesa);
		if(m==null)throw new Exception("La mesa con id: "+nroMesa+",no existe");
		return m;
	}
	
	
	public int crearMesa(int cantidadComensales,int salon,int nroMesa)throws Exception{
		Mesa m=dao.traerMesa(nroMesa);
		if(m!=null)throw new Exception("Ya existe mesa con id: "+nroMesa);
		int union=0;//no esta unida a nada
		int estado=1;//libre
		Mesa nuevaMesa= new Mesa(nroMesa,cantidadComensales,salon,union,estado);
		dao.agregar(nuevaMesa);
		return nuevaMesa.getNroMesa();
	}
	
	
	public void modificarMesa(Mesa mesa)throws Exception{
		dao.actualizar(mesa);	
	}
	
	public void eliminarMesa(int nroMesa)throws Exception{
		Mesa m=dao.traerMesa(nroMesa);
		if(m==null)throw new Exception("La mesa no existe");
		dao.eliminar(m);
	}
	
	public void redefinirMesa(Mesa mesa1,Mesa mesa2){
		int nroMesaParaUnion=mesa1.getNroMesa();
		Mesa bdd1=dao.traerMesa(mesa1.getNroMesa());
		Mesa bdd2=dao.traerMesa(mesa2.getNroMesa());
		mesa1.setUnion(nroMesaParaUnion);
		mesa2.setUnion(nroMesaParaUnion);
		bdd1=mesa1;
		bdd2=mesa2;
		dao.actualizar(bdd1);
		dao.actualizar(bdd2);
	}
	
	public List<Mesa> traerMesas(int salon){
		return dao.traerMesaPorSalon(salon);
	}
	
	
}
