package dao;


import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Comanda;
import datos.Mesa;
import datos.PrecioProductoLista;
import datos.Producto;

public class MesaDao {
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

	public int agregar(Mesa objeto) {
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

	public void actualizar(Mesa objeto) throws HibernateException {
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

	public void eliminar(Mesa objeto) throws HibernateException {
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

	public Mesa traerMesa(long idMesa) throws HibernateException {
		Mesa objeto = null;
		try {
			iniciaOperacion();
			objeto = (Mesa) session.get(Mesa.class, idMesa);
			Hibernate.initialize(objeto.getLstReporteMesa());
			Hibernate.initialize(objeto.getLstComanda());
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Mesa traerMesa(int nro) throws HibernateException {
		Mesa objeto = null;
		try {
			iniciaOperacion();
			objeto = (Mesa) session.createQuery("from Mesa m where m.nroMesa =" + nro).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Mesa traerMesaYDetalle(int nro) throws HibernateException {
		Mesa objeto = null;
		try {
			iniciaOperacion();
			objeto = (Mesa) session.createQuery("from Mesa m where m.nroMesa =" + nro).uniqueResult();
			Hibernate.initialize(objeto.getLstComanda());
			for(Comanda c: objeto.getLstComanda()){
				Hibernate.initialize(c.getLstProducto());
				for(Producto p: c.getLstProducto()){
					Hibernate.initialize(p.getLstPrecioProductoLista());
					for(PrecioProductoLista ppl: p.getLstPrecioProductoLista()){
						Hibernate.initialize(ppl.getListaPrecio());
						Hibernate.initialize(ppl.getListaPrecio().getTipoCliente());
					}
				}
			}
		} finally {
			session.close();
		}
		return objeto;
	}

	
	@SuppressWarnings("unchecked")
	public List<Mesa> traerMesaPorSalon(int salon){
		List<Mesa> lstMesas=null;
		try{
			iniciaOperacion();
			lstMesas=(List<Mesa>)session.createQuery("from Mesa m where m.salon ="+salon).list() ;
		}
		finally{
			session.close();
		}
		return lstMesas;
	}
}