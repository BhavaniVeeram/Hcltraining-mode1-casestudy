package org.hcl.services;

import org.hcl.entities.User;

public interface UserService {
	public Integer insertUser(User user);
	boolean isValidUser(Integer userId, String password);
}
