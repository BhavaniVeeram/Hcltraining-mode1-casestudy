package org.hcl.services;

import java.util.List;

import org.hcl.dao.PolicyDao;
import org.hcl.entities.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PolicyServiceImpl implements PolicyService {
	private PolicyDao policyDao;
	public PolicyServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public PolicyServiceImpl(PolicyDao policyDao) {
		super();
		this.policyDao = policyDao;
	}
	
	/**
	 * @return the policyDao
	 */
	public PolicyDao getPolicyDao() {
		return policyDao;
	}
	/**
	 * @param policyDao the policyDao to set
	 */
	public void setPolicyDao(PolicyDao policyDao) {
		this.policyDao = policyDao;
	}
	@Override
	public Integer createPolicy(Policy policy) {
		return policyDao.insert(policy);
	}
	@Override
	public List<Policy> getPolicies() {
		return policyDao.getAll();
	}
	@Override
	public Policy updatePolicy(Policy policy) {
		return policyDao.update(policy);
		
	}
	@Override
	public List<Policy> findPolicy(String text) {
		return policyDao.findPolicy(text);
	}
	
	
	 @Override public Policy getPolicyId(Integer policyId) { return
	 policyDao.getPolicy(policyId); }
	 
	 /* @Override public Policy searchByPolicyName(String policyName) { return
	 * policyDao.searchByPolicyName(policyName); }
	 */
	
	
	
}
