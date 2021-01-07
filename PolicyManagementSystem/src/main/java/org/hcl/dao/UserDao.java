package org.hcl.dao;

import org.hcl.entities.User;

public interface UserDao {
	Integer insert(User user);
	boolean isValidUser(Integer userId, String password);
}
