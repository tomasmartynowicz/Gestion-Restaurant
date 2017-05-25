package dao;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import datos.CuentaCorriente;

public class CuentaCorrienteDao {
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

	public int agregar(CuentaCorriente objeto) {
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

	public void actualizar(CuentaCorriente objeto) throws HibernateException {
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

	public void eliminar(CuentaCorriente objeto) throws HibernateException {
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

	public CuentaCorriente traerCuentaCorriente(long idCuentaCorriente) throws HibernateException {
		CuentaCorriente objeto = null;
		try {
			iniciaOperacion();
			objeto = (CuentaCorriente) session.get(CuentaCorriente.class, idCuentaCorriente);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public CuentaCorriente traerCuentaCorrienteYCliente(long idCuentaCorriente) throws HibernateException {
		CuentaCorriente objeto = null;
		try {
			iniciaOperacion();
			String hql = "from CuentaCorriente cc where cc.idCuentaCorriente =" + idCuentaCorriente;
			objeto = (CuentaCorriente) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getLstCliente());
		} finally {
			session.close();
		}
		return objeto;
	}

}