package es.cursojava.hibernate.ejercicios.aulas.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UtilHibernate {

	private static Session session;
	
	private static Session getSession() {
		SessionFactory sessionFactory = new Configuration()
                .configure() // Carga hibernate.cfg.xml
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        
		return session;
	}
	
	public static Session getSessionFactory() {
		if(session == null || !session.isOpen()) {
			session = getSession();
		}
		return session;
	}
}
