package org.hcl.services;

import org.hcl.dao.AdminDao;
import org.hcl.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
	private AdminDao dao;
	public AdminServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public AdminServiceImpl(AdminDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Integer insertAdmin(Admin admin) {
		return dao.insert(admin);
		
	}
	@Override
	public boolean isValidAdmin(Integer vendorId, String password) {

		return dao.isValidAdmin(vendorId, password);
	}

}
