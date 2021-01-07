package org.hcl.services;

import org.hcl.entities.Admin;

public interface AdminService {
	public Integer insertAdmin(Admin admin);
	boolean isValidAdmin(Integer vendorId, String password);
}
