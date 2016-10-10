package org.cuatrovientos.erps.oneToOne.DAO;

import java.util.List;

import org.cuatrovientos.erps.oneToOne.HibernateSession;
import org.cuatrovientos.erps.oneToOne.DAOInteface.InsuranceDAOInterface;
import org.cuatrovientos.erps.oneToOne.models.Insurance;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsuranceDAO implements InsuranceDAOInterface{

	public Insurance selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Insurance insurance = (Insurance) session.get(Insurance.class, id);
	    
	    session.close();
	    return insurance;
	}

	public List<Insurance> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Insurance> insurances = session.createQuery("from cars").list();
	    
	    session.close();
	    return insurances;
	}

	public void insert(Insurance insurance) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(insurance);
	         
	    session.getTransaction().commit();
	    session.close();
		
	}

	public void update(Insurance insurance) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(insurance);
	 
	    session.getTransaction().commit();
	    session.close();
		
	}

	public void delete(Insurance insurance) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(insurance);
	 
	    session.getTransaction().commit();
	    session.close();
		
	}

}
