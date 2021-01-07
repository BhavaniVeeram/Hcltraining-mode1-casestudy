package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.hcl.entities.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class AdminDaoImpl implements AdminDao {
	SessionFactory sessionFactory;
	public AdminDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public AdminDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public Integer insert(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer)session.save(admin);
		return i;
		}
	@Transactional
	@Override
	public boolean isValidAdmin(Integer vendorId, String password) {
		boolean isValid = true;
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Admin a where a.vendorId =:v and a.password =:p ");
		query.setParameter("v", vendorId);
		query.setParameter("p", password);
		List results = query.list();
		if(results.isEmpty()) {
			isValid = false;
		}
		return isValid;
	}
}
