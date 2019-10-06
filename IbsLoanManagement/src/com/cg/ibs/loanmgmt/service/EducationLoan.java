package com.cg.ibs.loanmgmt.service;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class EducationLoan extends Loan {
	private final float INTEREST_RATE = 11.35f;
	public final double LOAN_LIMIT = 5000000;

	public EducationLoan() {
		setLoanType(LoanType.EDUCATION_LOAN);
	}

	@Override
	public float getInterestRate() {
		return INTEREST_RATE;
	}

	@Override
	public boolean isValidLoanAmount(double loanAmount) {
		if (loanAmount < LOAN_LIMIT && loanAmount > LOAN_LOWER_LIMIT) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "*****\n Loan Type = " + getLoanType() + "\n Interest Rate=" + INTEREST_RATE + "\n Loan Amount= " + getLoanAmount() + ",\n Loan Tenure ="
				+ getLoanTenure() + " Months " + "\n Emi Amount= "+ getEmiAmount() + "\n *****";
	}

}
