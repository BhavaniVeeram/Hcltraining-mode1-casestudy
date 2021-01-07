package org.hcl.dao;

import java.util.List;

import org.hcl.entities.PolicyPayment;

public interface PolicyPaymentDao {
	public PolicyPayment getPolicy(Integer policyId);
	List<PolicyPayment> getAll();
	public boolean update(Integer policyId);
}
