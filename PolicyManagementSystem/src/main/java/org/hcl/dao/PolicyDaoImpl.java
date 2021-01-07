package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.entities.Policy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.context.spi.CurrentSessionContext;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PolicyDaoImpl implements PolicyDao {
	SessionFactory sessionFactory;
	public PolicyDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public PolicyDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public Integer insert(Policy policy) {
		Session session = sessionFactory.getCurrentSession();
		Integer i = (Integer)session.save(policy);
		return i;
	}
	@Transactional
	@Override
	public List<Policy> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy");
		List<Policy> policy = query.list();
		return policy;
	}
	@Transactional
	@Override
	public Policy update(Policy policy) {
		Session session = sessionFactory.getCurrentSession();
		session.update(policy);
		return policy;
	}
	@Transactional
	@Override
	public List<Policy> findPolicy(String txt) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy where (policyName LIKE '%"+txt+"%' or companyName LIKE '%"+txt+"%' or policyType LIKE '%"+txt+"%' or policyDuration LIKE "+txt+" or policyAmount LIKE "+txt+" or policyId LIKE "+txt+")");
		List<Policy> policy = query.list();
		return policy;
	}
	
	@Transactional
	@Override
	public Policy getPolicy(Integer policyId) {
		Session session = sessionFactory.getCurrentSession();
		return (Policy)session.get(Policy.class, policyId);
	}
	/*@Transactional
	@Override
	public Policy searchByPolicyName(String policyName) {
		Session session = sessionFactory.getCurrentSession();
		return (Policy)session.get(Policy.class, policyName);
	}*/
	

}
