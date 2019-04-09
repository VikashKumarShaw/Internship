package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.AdminDao;
import com.pack.entity.AdminDetails;
import com.pack.entity.BatchAllocate;
import com.pack.entity.BatchUpdate;
import com.pack.entity.FacultyRegistration;
import com.pack.entity.Login;
import com.pack.entity.Module;
import com.pack.entity.SkillMaster;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao adminDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Transactional
	public AdminDetails loginAdmin(Login login) {
		// TODO Auto-generated method stub
		
		System.out.println("inside service");
		return adminDao.loginAdmin(login);
		
	}

	@Transactional
	public void addBatch(BatchAllocate batchAllocate) {
		// TODO Auto-generated method stub
		adminDao.addBatch(batchAllocate);
	}

	@Transactional
	public void addFaculty(FacultyRegistration facultyRegistration) {
		// TODO Auto-generated method stub
		System.out.println("inside facultyreg service");
		adminDao.addFaculty(facultyRegistration);
	}
	
	@Transactional
	public void addAdmin(AdminDetails admin) {
		// TODO Auto-generated method stub
		adminDao.addAdmin(admin);
		
	}

	@Transactional
	public List<SkillMaster> getAllSkills() {
		return adminDao.getAllSkills();
	}

	@Transactional
	public List<FacultyRegistration> getAllFaculty() {
		// TODO Auto-generated method stub
		return adminDao.getAllFaculty();
	}

	@Transactional
	public List<BatchAllocate> getAllBatch() {
		// TODO Auto-generated method stub
		return adminDao.getAllBatch();
	}

	@Transactional
	public void updateBatch(BatchUpdate batchUpdate) {
		// TODO Auto-generated method stub
		adminDao.updateBatch(batchUpdate);
	}

	
		@Transactional
			public void module(Module module) {
				// TODO Auto-generated method stub
			adminDao.module(module);
			} 
		 

	
}
