package negocio;

import dao.TicketDao;
import datos.Cliente;
import datos.Comanda;
import datos.Mesa;
import datos.PrecioProductoLista;
import datos.Producto;
import datos.Ticket;

public class TicketABM {
	TicketDao dao = new TicketDao();
	
	public Ticket generarPreticket(Mesa m, Cliente c){
		double total = 0;
		Ticket ticket = new Ticket();
		MesaABM mesaabm = new MesaABM();
		ticket.setCliente(c);
		ticket.setMesa(mesaabm.traerMesaYDetalle(m.getNroMesa()));
		for(Comanda co: ticket.getMesa().getLstComanda()){
			for(Producto p: co.getLstProducto()){
				for(PrecioProductoLista ppl: p.getLstPrecioProductoLista()){
					if(ppl.getListaPrecio().getTipoCliente().getIdTipoCliente() != c.getTipoCliente().getIdTipoCliente())
						p.getLstPrecioProductoLista().remove(ppl);
					else total+=ppl.getPrecio();
				}
			}
		}
		return ticket;
	}
}
