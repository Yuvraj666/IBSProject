package com.cg.ibs.loanmgmt.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.List;

import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;
import com.cg.ibs.loanmgmt.dao.CustomerDao;
import com.cg.ibs.loanmgmt.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	Loan loan;
	Document document = new Document();
	CustomerDao customerDao = new CustomerDaoImpl();

	public Loan calculateEmi(Loan loan) {
		float rate = loan.getInterestRate() / (12 * 100);
		loan.setEmiAmount(((loan.getLoanAmount() * rate * Math.pow((rate + 1), loan.getLoanTenure()))
				/ (Math.pow((rate + 1), loan.getLoanTenure()) - 1)));
		return loan;

	}

	public Loan applyLoan() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getDocument(Document document) throws Exception {

		BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream(document.getPathOfDocument()));
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = bufferedInputStream.read()) != -1) {
			sb.append((char) ch);
		}
		bufferedInputStream.close();
		System.out.println(sb);
		customerDao.saveDocument(sb);
	}

	public boolean applyPreClosure(long loanNumber) {

		return false;
	}

	public boolean verifyApplicableForEmi(String loanNumber) {
		boolean check = verifyEMIPayment(getEMIDetails(loanNumber));
		return check;
	}

	public LoanMaster getHistory(String userId) {
		return customerDao.getHistory(userId); // TODO Auto-generated method
												// stub

	}

	public boolean loanCustomerInputVerificationService(Loan loan) {
		boolean amountValid = loan.isValidLoanAmount(loan.getLoanAmount());
		boolean tenureValid = loan.isValidTenure(loan.getLoanTenure());
		boolean check = false;
		if (amountValid & tenureValid) {
			check = true;
		}
		return check;

	}

	public LoanMaster getEMIDetails(String loanNumber) {

		return null;

	}

	public boolean verifyEMIPayment(LoanMaster loanMaster) {
		boolean check = false;
		if (loanMaster.getTotalNumberOfEmis() > loanMaster.getNumberOfEmis()) {
			check = true;
		}
		return check;
	}

	public boolean verifyTransaction(double presentAmount, double emiAmount) {
		boolean result = false;
		if (presentAmount == emiAmount) {
			result = true;
		}
		return result;
	}

	// public LoanNumber updateEMI(LoanNumber loanNumber);
	//
	// public LocalDate getNextDate();

	public LoanMaster payEMI(String loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}
}
