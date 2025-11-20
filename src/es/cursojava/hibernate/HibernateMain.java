package es.cursojava.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class HibernateMain {
    public static void main(String[] args) {

        try {
            SessionFactory sessionFactory = new Configuration()
                    .configure() // Carga hibernate.cfg.xml
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            System.out.println("conectado");
                     
            Transaction tx = session.beginTransaction();
            Company c1 = new Company(null,"Compnay 1", "A.S", "123ABC", "Money lanundering",new Date());
            Company c2= new Company(null,"Compnay 2", "A.S", "123ABC", "Hacking",new Date());
            
            session.persist(c1);
            session.persist(c2);
            
            
            tx.commit();
            Query<Company> query = session.createQuery("from Company", Company.class);
            List<Company> companies = query.list();
            for (Company company : companies) {
				if(company!=null) {
					System.out.println(company);
				}
			}
            
        } catch (Throwable ex) {
            System.err.println("Error al crear la SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
