package es.cursojava.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure() // hibernate.cfg.xml
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError("SessionFactory creation failed: " + ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
//	private static Session session;
//	
//	private static Session getSession() {
//		SessionFactory sessionFactory = new Configuration()
//                .configure() // Carga hibernate.cfg.xml
//                .buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        
//		return session;
//	}
//	
//	public static Session getSessionFactory() {
//		if(session == null || !session.isOpen()) {
//			session = getSession();
//		}
//		return session;
//	}
}
