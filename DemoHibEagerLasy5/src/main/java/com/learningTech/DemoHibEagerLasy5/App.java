package com.learningTech.DemoHibEagerLasy5;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(student1.class).addAnnotatedClass(laptop1.class);
    	org.hibernate.service.ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	SessionFactory sf = config.buildSessionFactory(reg);
    	Session session = sf.openSession();
    	session.beginTransaction();
    	student1 s =(student1) session.get(student1.class, 101);
    	

    	
    	System.out.println(s.getSname());
//    	Collection<laptop1> la = s.getLaptop();
//    	for(laptop1 l : la) {
//    		System.out.println(l);
//    	}
//    	session.getTransaction().commit();
//    	
//    	
    }
}
