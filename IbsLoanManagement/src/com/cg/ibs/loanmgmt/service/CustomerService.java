package com.cg.ibs.loanmgmt.service;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;


public interface CustomerService {
	public Loan applyLoan();

	public Loan calculateEmi(Loan loan);

	public void getDocument(Document document) throws Exception;

	public boolean applyPreClosure(long loanNumber);

	public boolean verifyApplicableForEmi(String loanNumber);

	public LoanMaster payEMI(String loanNumber);

	public LoanMaster getHistory(String userId);

	public boolean loanCustomerInputVerificationService(Loan loan);

}