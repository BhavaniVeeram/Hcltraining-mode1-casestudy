package org.hcl.services;

import java.util.List;

import org.hcl.dao.PolicyPaymentDao;
import org.hcl.entities.PolicyPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PolicyPaymentServiceImpl implements PolicyPaymentService {
	public PolicyPaymentDao dao;
	public PolicyPaymentServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public PolicyPaymentServiceImpl(PolicyPaymentDao dao) {
		super();
		this.dao = dao;
	}

	/**
	 * @return the dao
	 */
	public PolicyPaymentDao getDao() {
		return dao;
	}
	/**
	 * @param dao the dao to set
	 */
	public void setDao(PolicyPaymentDao dao) {
		this.dao = dao;
	}
	@Override
	public List<PolicyPayment> getPolicies() {
		return dao.getAll();
	}

	@Override
	public PolicyPayment getPolicyId(Integer policyId) {
		return dao.getPolicy(policyId);
	}
	@Override
	public boolean update(Integer policyId) {
		// TODO Auto-generated method stub
		return dao.update(policyId);
	}
	
	

}
