package com.cg.ibs.loanmgmt.service;


import com.cg.ibs.loanmgmt.bean.CustomerBean;
import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;
import com.cg.ibs.loanmgmt.dao.BankDao;
import com.cg.ibs.loanmgmt.dao.BankDaoImpl;

public class BankServiceImpl implements BankService {
	BankDao bankDao = new BankDaoImpl();

	public boolean verifyLoan(CustomerBean customer, Loan loan, Document document) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanMaster approveLoan(CustomerBean customer, Loan loan, Document document) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verifyPreClosure(long loanNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanMaster approvePreClosure(LoanMaster loanMaster) {
		// TODO Auto-generated method stub
		return null;
	}

}
