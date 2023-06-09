package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateProvider {
	private static  SessionFactory sessionFactory;
	
	public HibernateProvider() {
		// TODO Auto-generated constructor stub
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();		
		}
		return sessionFactory;
	}

}
