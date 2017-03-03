package com.munimjee.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;
	static
	{
		try
		{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		catch(Exception e)
		{
			System.out.println("Error occured in hibernate : "+e.getMessage());
		}
		
	}
	public static SessionFactory getSeesionfactory()
	{
		return sessionFactory;
	}
	public static void shutDown()
	{
		getSeesionfactory().close();
	}

}
