package model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Query query = session.createQuery("from employe");
		List<?> employe = query.getResultList();
		session.getTransaction().commit();
		session.close();
		System.out.println("Nombre d'employés : " + employe.size());

	}

}
