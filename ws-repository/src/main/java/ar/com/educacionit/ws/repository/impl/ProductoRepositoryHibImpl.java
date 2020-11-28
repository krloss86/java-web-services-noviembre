package ar.com.educacionit.ws.repository.impl;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import ar.com.educacionit.ws.domain.HibernateUtils;
import ar.com.educacionit.ws.domain.Producto;
import ar.com.educacionit.ws.repository.ProductoRepository;

public class ProductoRepositoryHibImpl implements ProductoRepository {

	public Producto getByID(Long id) {
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		
		Session session = factory.getCurrentSession();

		Producto producto = null;
		
		try {

			// All the action with DB via Hibernate
			// must be located in one transaction.
			// Start Transaction.
			session.getTransaction().begin();

			// Create an HQL statement, query the object.
			String sql = "Select e from " + Producto.class.getName() + " e where e.id=:id ";

			// Create Query object.
			Query<Producto> query = session.createQuery(sql);

			query.setParameter("id", id);

			// Execute query.
			Optional<Producto> employees = query.uniqueResultOptional();

			if(employees.isPresent()) {
				producto = employees.get();
				
				System.out.println(producto);
			}
			
			// Commit data.
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			// Rollback in case of an error occurred.
			session.getTransaction().rollback();
		}
		
		return producto;
	}

}
