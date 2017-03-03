package com.munimjee.dao.registration;

import java.util.List;



import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.munimjee.models.Model;
import com.munimjee.models.registration.ModelModules;
import com.munimjee.util.HibernateUtil;

public class ModuleDao  {
	final static Logger log = Logger.getLogger(ModuleDao.class);
	String hql = "";
	Session session = null;
	Query query = null;
	Transaction transaction = null;
	public ModelModules add(ModelModules module){
		boolean flag = false;
		
		try
		{
			session = HibernateUtil.getSeesionfactory().openSession();
			transaction = session.beginTransaction();
			System.out.println(module.getModuleName());
			 session.save(module);
			 System.out.println(module.getModuleId());
			
			transaction.commit();
			flag = true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			log.error(e.getMessage());
		}
		finally
		{
			session.close();
		}
		return module;
	}

	public boolean delete(int id) {
		boolean flag = false;
		try
		{
			session = HibernateUtil.getSeesionfactory().openSession();
			hql = "from ModelModules M where M.moduleId = :moduleid";
			query = session.createQuery(hql);
			query.setParameter("moduleid", id);
			List<ModelModules> modules = query.list();
			if(modules!=null&&modules.size()>0)
			{
				ModelModules module = modules.get(0);
				transaction = session.beginTransaction();
				session.delete(module);
				transaction.commit();
				flag = true;
			}
			
		}
		catch(Exception e)
		{
			log.error(e.getStackTrace());
		}
		finally
		{
			session.close();
		}
		return flag;
	}

	public ModelModules update(ModelModules module) {
		
		boolean flag = false;
		ModelModules updated = null;
		try
		{
			System.out.println(module.getModuleName()+module.getModuleId());
			session = HibernateUtil.getSeesionfactory().openSession();
			transaction = session.beginTransaction();
			session.update(module);
			transaction.commit();
			updated = module;
		}
		catch(Exception e)
		{
			log.error(e.getStackTrace());
		}
		finally
		{
			session.close();
		}
		return updated;
	}

	public List<ModelModules> getAll() {
		List<ModelModules> modules  = null;
		try
		{
			session = HibernateUtil.getSeesionfactory().openSession();
			hql = "From ModelModules M";
			query = session.createQuery(hql);
			modules = query.list();
			
			
			
			
		}
		catch(Exception e)
		{
			log.error(e.getStackTrace());
		}
		finally
		{
			session.close();
		}
		return modules;
	}

	public ModelModules get(int id) {
		// TODO Auto-generated method stub
		List<ModelModules> modules  = null;
		ModelModules module = null;
		try
		{
			session = HibernateUtil.getSeesionfactory().openSession();
			hql = "From ModelModules M where M.moduleId = :moduleId";
			query = session.createQuery(hql);
			query.setParameter("moduleId",id);
			modules = query.list();
			if(modules!=null&&modules.size()>0)
			{
				module=modules.get(0);
			}
			
			
			
		}
		catch(Exception e)
		{
			log.error(e.getStackTrace());
		}
		finally
		{
			session.close();
		}
		return module;
	}
	
	public boolean exists(ModelModules module)
	{
		List<ModelModules> modules  = null;
		ModelModules module1 = null;
		boolean flag = false;
		try
		{
			session = HibernateUtil.getSeesionfactory().openSession();
			hql = "From ModelModules M where M.moduleName = :moduleName";
			query = session.createQuery(hql);
			query.setParameter("moduleId",module1.getModuleName());
			modules = query.list();
			if(modules!=null&&modules.size()>0)
			{
				module1=modules.get(0);
			}
			if(module1!=null)
			{
				flag = true;
			}
			
			
		}
		catch(Exception e)
		{
			log.error(e.getStackTrace());
		}
		finally
		{
			session.close();
		}
		return flag;
	}

}
