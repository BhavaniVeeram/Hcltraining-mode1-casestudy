package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Policy;

public interface PolicyDao {
	Integer insert(Policy policy);
	List<Policy> getAll();
	public Policy update(Policy policy);
	public Policy getPolicy(Integer policyId);
	public List<Policy> findPolicy(String text);
	
}
