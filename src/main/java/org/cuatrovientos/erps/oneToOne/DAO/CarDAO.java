package org.cuatrovientos.erps.oneToOne.DAO;

import java.util.List;

import org.cuatrovientos.erps.oneToOne.HibernateSession;
import org.cuatrovientos.erps.oneToOne.DAOInteface.CarDAOInterface;
import org.cuatrovientos.erps.oneToOne.models.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class CarDAO implements CarDAOInterface{

	public Car selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Car car = (Car) session.get(Car.class, id);
	    
	    session.close();
	    return car;
	}

	public List<Car> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Car> cars = session.createCriteria(Car.class).list();
		
		session.close();
		return cars;
	}

	public void insert(Car car) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(car);
	         
	    session.getTransaction().commit();
	    session.close();
		
	}

	public void update(Car car) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	 
	    session.beginTransaction();
	 
	    session.merge(car);
	 
	    session.getTransaction().commit();
	    session.close();
	}

	public void delete(Car car) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(car);
	 
	    session.getTransaction().commit();
	    session.close();
		
	}

}
