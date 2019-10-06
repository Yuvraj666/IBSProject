package com.cg.ibs.loanmgmt.service;

import com.cg.ibs.loanmgmt.bean.LoanType;

public class VehicleLoan extends Loan {
	private final float INTEREST_RATE = 9.25f;
	public final double LOAN_LIMIT = 3000000;

	public VehicleLoan() {
		setLoanType(LoanType.VEHICLE_LOAN);
	}

	@Override
	public float getInterestRate() {
		return INTEREST_RATE;
	}

	@Override
	public boolean isValidLoanAmount(double loanAmount) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "*****\n Loan Type = " + getLoanType() + "\n Interest Rate=" + INTEREST_RATE + "\n Loan Amount= " + getLoanAmount() + ",\n Loan Tenure ="
				+ getLoanTenure() + " Months " + "\n Emi Amount= "+ getEmiAmount() + "\n *****";
	}

}
