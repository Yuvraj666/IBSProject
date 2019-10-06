package com.cg.ibs.loanmgmt.bean;

import java.time.LocalDate;


public class LoanMaster {
	private static long incLoanNumber=1000;
	private String loanNumber;
	private double loanAmount;
	private int loanTenure;
	private double emiAmount;
	private CustomerBean customerBean;
	private int numberOfEmis;
	private int totalNumberOfEmis;
	private LocalDate appliedDate;

	
	public LoanMaster(String loanNumber, double loanAmount, int loanTenure, double emiAmount, CustomerBean customerBean,
			int numberOfEmis, int totalNumberOfEmis, LocalDate appliedDate) {
		super();
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.emiAmount = emiAmount;
		this.customerBean = customerBean;
		this.numberOfEmis = numberOfEmis;
		this.totalNumberOfEmis = totalNumberOfEmis;
		this.appliedDate = appliedDate;
	}


	public static long generateLoanNumber() {
		return ++incLoanNumber;
	}
	

	public LoanMaster() {
		super();
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public String setLoanNumber(long loanNum) {
		this.loanNumber =Long.toString(loanNum);
		return loanNumber;
	}

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}

	public int getNumberOfEmis() {
		return numberOfEmis;
	}
	public void setNumberOfEmis(int numberOfEmis) {
		this.numberOfEmis = numberOfEmis;
	}

	public int getTotalNumberOfEmis() {
		return totalNumberOfEmis;
	}

	public void setTotalNumberOfEmis(int totalNumberOfEmis) {
		this.totalNumberOfEmis = totalNumberOfEmis;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	@Override
	public String toString() {
		return "Loan [\n, Customer Details = " + customerBean.toString() + "\n Loan Number=" + loanNumber + "\n Loan Amount=" + loanAmount + ",\n Loan Tenure=" + loanTenure
				+ ",\n Emi Amount=" + emiAmount +  ", Number Of EMI's=" + numberOfEmis
				+ ",\n Total Number Of EMI's=" + totalNumberOfEmis + ",\n Applied Date=" + appliedDate + "]";
	}
	
	

}
