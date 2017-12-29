package dao;


import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Empleado;
import datos.Usuario;

public class UsuarioDao {
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

	public int agregar(Usuario objeto) {
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

	public void actualizar(Usuario objeto) throws HibernateException {
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

	public void eliminar(Usuario objeto) throws HibernateException {
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

	public Usuario traerUsuario(long idUsuario) throws HibernateException {
		Usuario objeto = null;
		try {
			iniciaOperacion();
			objeto = (Usuario) session.get(Usuario.class, idUsuario);
		} finally {
			session.close();
		}
		return objeto;
	}

	public Usuario traerUsuario(String nombreUsuario) throws HibernateException {
		Usuario objeto = null;
		try {
			iniciaOperacion();
			objeto = (Usuario) session.createQuery(
					"from Usuario u where u.nombreUsuario = '" + nombreUsuario + "'").uniqueResult();
			if(objeto != null) Hibernate.initialize(objeto.getEmpleado());
		} finally {
			session.close();
		}
		return objeto;
	}
	
	public Usuario traerUsuario(Empleado e) throws HibernateException {
		Usuario objeto = null;
		try {
			iniciaOperacion();
			String hql="from Usuario u inner join fetch u.empleado e where e.idEmpleado =" + e.getIdEmpleado();
			objeto = (Usuario) session.createQuery(hql).uniqueResult();
			if (objeto!=null){
				Hibernate.initialize(objeto.getCategoria());
				Hibernate.initialize(objeto.getCategoria().getLstPermiso());
			}
		} finally {
			session.close();
		}
		return objeto;
	}

}