package org.hcl.services;

import java.util.List;

import org.hcl.entities.Policy;


public interface PolicyService {
	public Integer createPolicy(Policy policy);
	List<Policy> getPolicies();
	public Policy updatePolicy(Policy policy);
	public Policy getPolicyId(Integer policyId);
	List<Policy> findPolicy(String text);
}
