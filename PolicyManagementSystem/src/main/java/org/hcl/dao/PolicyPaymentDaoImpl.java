package org.hcl.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.hcl.entities.PolicyPayment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PolicyPaymentDaoImpl implements PolicyPaymentDao {
	SessionFactory sessionFactory;
	public PolicyPaymentDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public PolicyPaymentDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public PolicyPayment getPolicy(Integer policyId) {
		Session session = sessionFactory.getCurrentSession();
		return (PolicyPayment)session.get(PolicyPayment.class, policyId);
	}
	@Transactional
	@Override
	public List<PolicyPayment> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.PolicyPayment");
		List<PolicyPayment> policy = query.list();
		return policy;
	}
	@Transactional
	@Override
	public boolean update(Integer policyId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("update org.hcl.entities.PolicyPayment set status=:s where policyId =:i");
		query.setParameter("s", "paid");
		query.setParameter("i", policyId);
		int i = query.executeUpdate();
		if(i>=0)
			return true;
		return false;
	}
	
	

}
