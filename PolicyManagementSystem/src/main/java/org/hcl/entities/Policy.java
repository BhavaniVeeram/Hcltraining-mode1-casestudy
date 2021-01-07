package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer policyId;

	private String policyName;

	private String policyType;

	private Integer policyDuration;

	private double policyAmount;

	private String companyName;
	public Policy() {
		// TODO Auto-generated constructor stub
	}
	
	public Policy(Integer policyId, String policyName, String policyType, Integer policyDuration, double policyAmount,
			String companyName) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.policyDuration = policyDuration;
		this.policyAmount = policyAmount;
		this.companyName = companyName;
	}

	/**
	 * @return the policyName
	 */
	public String getPolicyName() {
		return policyName;
	}
	/**
	 * @param policyName the policyName to set
	 */
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	/**
	 * @return the policyType
	 */
	public String getPolicyType() {
		return policyType;
	}
	/**
	 * @param policyType the policyType to set
	 */
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	/**
	 * @return the policyDuration
	 */
	public Integer getPolicyDuration() {
		return policyDuration;
	}
	/**
	 * @return the policyId
	 */
	public Integer getPolicyId() {
		return policyId;
	}

	/**
	 * @param policyId the policyId to set
	 */
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	/**
	 * @param policyDuration the policyDuration to set
	 */
	public void setPolicyDuration(Integer policyDuration) {
		this.policyDuration = policyDuration;
	}
	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}
	/**
	 * @param policyAmount the policyAmount to set
	 */
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
