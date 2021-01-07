package org.hcl.dao;

import org.hcl.entities.Admin;

public interface AdminDao {
	// for inserting admin details
	Integer insert(Admin admin);
	boolean isValidAdmin(Integer vendorId, String password);
}
