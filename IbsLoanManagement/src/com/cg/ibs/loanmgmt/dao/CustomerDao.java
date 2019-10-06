package com.cg.ibs.loanmgmt.dao;

import com.cg.ibs.loanmgmt.bean.LoanMaster;

public interface CustomerDao {

	public boolean updateEMI(LoanMaster loanMaster);

	public LoanMaster setEMIDetails(LoanMaster loanMaster);

	public LoanMaster getHistory(String userId);

	public void saveDocument(StringBuilder sb) throws Exception;

}