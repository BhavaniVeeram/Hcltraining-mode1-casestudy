package org.hcl.services;

import org.hcl.dao.UserDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{
	private UserDao dao;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}
	@Override
	public Integer insertUser(User user) {
		return dao.insert(user);
	}
	@Override
	public boolean isValidUser(Integer userId, String password) {
		return dao.isValidUser(userId, password);
	}
	

}
