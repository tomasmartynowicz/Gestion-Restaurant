package dao;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.Comanda;
import datos.Producto;

public class ComandaDao {
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

	public int agregar(Comanda objeto) {
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

	public void actualizar(Comanda objeto) throws HibernateException {
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

	public void eliminar(Comanda objeto) throws HibernateException {
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

	public Comanda traerComanda(long idComanda) throws HibernateException {
		Comanda objeto = null;
		try {
			iniciaOperacion();
			objeto = (Comanda) session.get(Comanda.class, idComanda);
			Hibernate.initialize(objeto.getCliente());
			Hibernate.initialize(objeto.getEmpleado());
			Hibernate.initialize(objeto.getMesa());
		} finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Comanda> traerComandaPorEmpleado(long idEmpleado) {
		List<Comanda> objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Comanda c where c.empleado=" + idEmpleado + " and c.estado=" + 1;
			objeto = session.createQuery(hql).list();
			for(Comanda comanda : objeto) {
				Hibernate.initialize(comanda.getMesa());
			}
		} finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Comanda> traerComandaPorFecha(GregorianCalendar fechaYHora){
		List<Comanda> objeto = null;
		try{
			iniciaOperacion();
			String hql="from Comanda c where c.fechaYHora=" +fechaYHora;
			objeto=session.createQuery(hql).list();
			for(Comanda comanda: objeto){
				Hibernate.initialize(comanda.getFechaYHora());
			}
		}
		finally{
			session.close();
		}
		return objeto;
	}
	
	public Comanda traerComandaYProductos(long idComanda) throws HibernateException {
		Comanda objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Comanda c where c.idComanda=" + idComanda;
			objeto = (Comanda) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getLstProducto());
			for(Producto p : objeto.getLstProducto()) {
				Hibernate.initialize(p.getRubro());
			}
		} finally {
			session.close();
		}
		return objeto;
	}

}