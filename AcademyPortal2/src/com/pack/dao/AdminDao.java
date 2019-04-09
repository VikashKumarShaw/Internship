package com.pack.dao;

import java.util.List;

import com.pack.entity.AdminDetails;
import com.pack.entity.BatchAllocate;
import com.pack.entity.BatchUpdate;
import com.pack.entity.FacultyRegistration;
import com.pack.entity.Login;
import com.pack.entity.Module;
import com.pack.entity.SkillMaster;

public interface AdminDao {

	public AdminDetails loginAdmin(Login login);
	public void addBatch(BatchAllocate batchAllocate);
	public void addFaculty(FacultyRegistration facultyRegistration);
	public void addAdmin(AdminDetails admin);
	public List<SkillMaster> getAllSkills();
	public List<FacultyRegistration> getAllFaculty();
	public List<BatchAllocate> getAllBatch();
	public void updateBatch(BatchUpdate batchUpdate);
	public void module(Module module); 

}
