package com.iasa.ka23.ManagementSystem.db;

import org.hibernate.SessionFactory;

public class HibernateUtil {	
	
	    private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
			return sessionFactory;
		}

		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}    
 
    
 
}
