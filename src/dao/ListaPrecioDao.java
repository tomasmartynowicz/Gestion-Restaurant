package dao;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.ListaPrecio;
import datos.PrecioProductoLista;

public class ListaPrecioDao {
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he)
			throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(ListaPrecio objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(ListaPrecio objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	public void eliminar(ListaPrecio objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}

	//Solo nombre de lista de precio para el tipo de cliente
	public ListaPrecio traerListaPrecio(long idListaPrecio) throws HibernateException {
		ListaPrecio objeto = null;
		try {
			iniciaOperacion();
			objeto = (ListaPrecio) session.get(ListaPrecio.class, idListaPrecio);
			Hibernate.initialize(objeto.getTipoCliente());
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Lista con los precios de los productos
	public ListaPrecio traerListaPrecioYDetalle(long idListaPrecio) throws HibernateException {
		ListaPrecio objeto = null;
		try {
			iniciaOperacion();
			objeto = (ListaPrecio) session.get(ListaPrecio.class, idListaPrecio);
			Hibernate.initialize(objeto.getTipoCliente());
			Hibernate.initialize(objeto.getLstPrecioProductoLista());
			for(PrecioProductoLista p: objeto.getLstPrecioProductoLista()){
				Hibernate.initialize(p.getProducto());
			}
		} finally {
			session.close();
		}
		return objeto;
	}

}