package dao;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Componente;
import datos.Producto;

public class ProductoDao {
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

	public int agregar(Producto objeto) {
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

	public void actualizar(Producto objeto) throws HibernateException {
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

	public void eliminar(Producto objeto) throws HibernateException {
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
	
	public Producto traerProducto(long idProducto) throws HibernateException {
		Producto objeto = null;
		try {
			iniciaOperacion();
			objeto = (Producto) session.get(Producto.class, idProducto);
			Hibernate.initialize(objeto.getLstComponente());
		} finally {
			session.close();
		}
		return objeto;
	}

	public Producto traerProductoYDetalle(long idProducto) throws HibernateException {
		Producto objeto = null;
		try {
			iniciaOperacion();
			objeto = (Producto) session.get(Producto.class, idProducto);
			Hibernate.initialize(objeto.getLstComponente());
			for(Componente c: objeto.getLstComponente()){
				Hibernate.initialize(c.getIngrediente());
			}
			Hibernate.initialize(objeto.getRubro());
			Hibernate.initialize(objeto.getLstSubrubro());
			Hibernate.initialize(objeto.getLstPrecioProductoLista());
		} finally {
			session.close();
		}
		return objeto;
	}

}