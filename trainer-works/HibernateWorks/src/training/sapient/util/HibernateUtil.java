package training.sapient.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	// so the object cannot be created from external application
	private HibernateUtil() {
	}

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {

			Configuration config = new Configuration();

			config.configure();
			
//			config.addAnnotatedClass(annotatedClass)
			
			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}

}
