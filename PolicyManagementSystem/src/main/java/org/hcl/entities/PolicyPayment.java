package org.hcl.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyPayment {
	@Id
	private Integer policyId;
	private Date billDate;
	private double paymentAmount;
	private double fine;
	private Date dueDate;
	private String status;
	public PolicyPayment() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	public PolicyPayment(Integer policyId, Date billDate, double paymentAmount, double fine, Date dueDate,
			String status) {
		super();
		this.policyId = policyId;
		this.billDate = billDate;
		this.paymentAmount = paymentAmount;
		this.fine = fine;
		this.dueDate = dueDate;
		this.status = status;
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
	 * @return the billDate
	 */
	public Date getBillDate() {
		return billDate;
	}

	/**
	 * @param billDate the billDate to set
	 */
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	/**
	 * @return the paymentAmount
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	/**
	 * @return the fine
	 */
	public double getFine() {
		return fine;
	}

	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) {
		this.fine = fine;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
