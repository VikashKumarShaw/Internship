package com.pack.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.entity.AdminDetails;
import com.pack.entity.BatchAllocate;
import com.pack.entity.BatchUpdate;
import com.pack.entity.FacultyRegistration;
import com.pack.entity.Login;
import com.pack.entity.Module;
import com.pack.entity.SkillMaster;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	
	public AdminDetails loginAdmin(Login login) {
		// TODO Auto-generated method stub
		Session s=this.sessionFactory.openSession();
		/*sessionFactory.getCurrentSession().createQuery(arg0);*/
		//Transaction t=s.beginTransaction();
		System.out.println(login.getUsername());
		System.out.println(login.getPassword());
		Query q=s.createQuery("from AdminDetails l where l.adminid=:username and l.password=:password");
		q.setParameter("username", login.getUsername());
		q.setParameter("password", login.getPassword());
		AdminDetails l1= null;
		try
		{
		l1=(AdminDetails)q.uniqueResult();
		System.out.println("-------------------"+l1.getAdminid());
		return l1;
		}
		catch(Exception e)
		{
			System.out.println("======================================mmmmmm");
			return null;
		}
	}

	
	public void addBatch(BatchAllocate batchAllocate) {
		// TODO Auto-generated method stub
	        this.sessionFactory.getCurrentSession().save(batchAllocate);
	}


	public void addFaculty(FacultyRegistration facultyRegistration) {
		// TODO Auto-generated method stub
		System.out.println("inside facultyregistration dao");
		this.sessionFactory.getCurrentSession().save(facultyRegistration);
	}
	
	public void addAdmin(AdminDetails admin) {
		this.sessionFactory.getCurrentSession().save(admin);
		Session s=null;
		Transaction t=null;
		try{
		s = this.sessionFactory.openSession();
		t = s.beginTransaction();
		Login login=new Login();
		login.setUsername(admin.getAdminid());
		login.setPassword(admin.getPassword());
		this.sessionFactory.getCurrentSession().save(login);
		}
		catch(Exception e){
			System.out.println("Error gettinga admin entity "+e);
			
		}
		finally{
	
			t.commit();
		}
		
		
		
	}

	public List<SkillMaster> getAllSkills() {
		// TODO Auto-generated method stub
		List<SkillMaster> l=new ArrayList();
		l=this.sessionFactory.getCurrentSession().createQuery("from SkillMaster").list();
		/*return this.sessionFactory.getCurrentSession().createQuery("from SkillMaster").list();*/
		System.out.println(l);
		return l;
	}


	public List<FacultyRegistration> getAllFaculty() {
		// TODO Auto-generated method stub
		List<FacultyRegistration> l=new ArrayList();
		l=this.sessionFactory.getCurrentSession().createQuery("from FacultyRegistration").list();
		return l;
	}


	
	public List<BatchAllocate> getAllBatch() {
		// TODO Auto-generated method stub
		List<BatchAllocate> l=new ArrayList();
		l=this.sessionFactory.getCurrentSession().createQuery("from BatchAllocate").list();
		return l;
	}



	public void updateBatch(BatchUpdate batchUpdate) {
		// TODO Auto-generated method stub
		Session s=this.sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("update BatchAllocate b set b.closedate=:closedate where b.batchid=:batchid");
		q.setParameter("closedate", batchUpdate.getClosedate());
		q.setParameter("batchid", batchUpdate.getBatchid());
		System.out.println("---------------------------------"+batchUpdate.getBatchid());
		System.out.println("---------------------------------"+batchUpdate.getClosedate());
		q.executeUpdate();
		t.commit();
	}
	
	public void module(Module module) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(module);
		
	} 
	
}
