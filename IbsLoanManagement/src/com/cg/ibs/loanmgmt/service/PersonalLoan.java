package com.cg.ibs.loanmgmt.service;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class PersonalLoan extends Loan {
	private final float INTEREST_RATE = 10.75f;
	public final double LOAN_LIMIT = 2000000;

	public PersonalLoan() {
		setLoanType(LoanType.PERSONAL_LOAN);
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
