package com.cg.ibs.loanmgmt.dao;

import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface BankDao {
	public boolean saveLoan(LoanMaster loanMaster);
	public boolean savePreClosure(LoanMaster loanMaster);
	public void getDocument(String sb) throws Exception;

}
