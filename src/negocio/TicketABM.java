package negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

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
		ticket.setFechaYHora(new GregorianCalendar());
		List<PrecioProductoLista> pplborrar= new ArrayList<PrecioProductoLista>();
		for(Comanda co: ticket.getMesa().getLstComanda()){
			for(Producto p: co.getLstProducto()){
				for(PrecioProductoLista ppl: p.getLstPrecioProductoLista()){
					
					if(ppl.getListaPrecio().getTipoCliente().getIdTipoCliente() != c.getTipoCliente().getIdTipoCliente())
						pplborrar.add(ppl);
					else total+=ppl.getPrecio();
				}
				for(PrecioProductoLista ppl: pplborrar){
					p.getLstPrecioProductoLista().remove(ppl);
				}
			}
		}
		
		return ticket;
	}
}
