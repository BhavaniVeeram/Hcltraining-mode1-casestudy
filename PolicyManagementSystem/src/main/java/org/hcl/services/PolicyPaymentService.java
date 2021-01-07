package org.hcl.services;

import java.util.List;


import org.hcl.entities.PolicyPayment;

public interface PolicyPaymentService {
	List<PolicyPayment> getPolicies();
	public PolicyPayment getPolicyId(Integer policyId);
	public boolean update(Integer policyId);
}
