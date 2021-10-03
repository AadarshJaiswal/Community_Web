package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory factory;
	public static SessionFactory getFactory()
	{
		if(factory==null)
		{
			factory=new Configuration().configure("hibernate.cgf.xml").buildSessionFactory();	
			
		}
		return factory;
	}
	  public static SessionFactory getCurrentSession()
	    {
	    return factory;
	    }
	public void closeFactory()
	{
		if(factory.isOpen())
		{
			factory.close();
		}
	}
}
