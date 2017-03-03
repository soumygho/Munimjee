package com.munimjee.test;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

import com.munimjee.models.registration.ModelOrganization;
import com.munimjee.models.registration.ModelOrganizationType;
import com.munimjee.models.registration.ModelUser;
import com.munimjee.models.registration.ModelUserSession;
import com.munimjee.util.HibernateUtil;

public class AppTest {
final static Logger logger = Logger.getLogger(AppTest.class);
	public static void main(String[] args) {
		Session session = HibernateUtil.getSeesionfactory().openSession();
		try
		{
			logger.info("Executing Apptest");
			String hql = "From ModelOrganization";
			Query query = session.createQuery(hql);
			List<ModelOrganization> organizations = query.list();
			ModelOrganization organization = null;
			for(ModelOrganization org : organizations)
			{
				organization = org;
			}
			session.beginTransaction();
		/*	ModelOrganizationType organizationType = new ModelOrganizationType();
			organizationType.setOrganizationType("IT");
			session.save(organizationType);
			ModelOrganization organization = new ModelOrganization();
			organization.setIsOrganizationMunimjeeFlag("Y");
			organization.setOrganizationName("Munimjee LTD");
			organization.setOrganizationType(organizationType);
			//organization.setPackageId(0);
			organization.setValidOrganizationFlag("Y");
			organization.setDateOfRegistration(new Date());
			organizationType.getOrganizations().add(organization);
			session.save(organization);*/
			ModelUser modelUser = new ModelUser();
			modelUser.setEmailId("soumya@gmail1.com");
			modelUser.setFirstName("Soumya");
			modelUser.setLastName("Ghosh");
			modelUser.setMobileNo(9614843);
			modelUser.setPassword("9933");
			modelUser.setUserId("soumyagcetts");
			System.out.println("trying to insert");
			session.save(modelUser);
			
			System.out.println("user sequence : "+modelUser.getUserSequesnce());
			ModelUserSession userSession = new ModelUserSession();
			userSession.setUser(modelUser);
			userSession.setOrganization(organization);
			userSession.setDtLogin(new Date());
			userSession.setDtlogout(new Date());
			session.save(userSession);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			System.out.println("error occured : "+e.getMessage());
			session.close();
		}
		session = HibernateUtil.getSeesionfactory().openSession();
		String hql = "From ModelOrganization";
		Query query = session.createQuery(hql);
		System.out.println("getting list");
		List<ModelOrganization> organizations = query.list();
		for(ModelOrganization org : organizations)
		{
			System.out.println(org.getOrganizationName()+org.getOrganizationType().getOrganizationType());
		}
		hql = "from ModelUser U where U.userSequence = 1";
		query = session.createQuery(hql);
		System.out.println("getting list");
		List<ModelUser> users = query.list();
		for(ModelUser user : users)
		{
			System.out.println(user.getFirstName()+user.getEmailId());
		}
	}

}