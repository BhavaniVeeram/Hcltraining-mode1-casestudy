package org.hcl.dao;

import org.hcl.entities.User;

import java.util.List;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao {
	SessionFactory sessionFactory;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public Integer insert(User user) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer)session.save(user);
		return i;
	}
	@Transactional
	@Override
	public boolean isValidUser(Integer userId, String password) {
		boolean isValid = true;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.User u where u.userId =:us and u.password =:p ");
		query.setParameter("us", userId);
		query.setParameter("p", password);
		List results = query.list();
		if(results.isEmpty()) {
			isValid = false;
		}
		return isValid;
	}

}
