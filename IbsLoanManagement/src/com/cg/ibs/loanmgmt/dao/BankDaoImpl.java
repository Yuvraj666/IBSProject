package com.cg.ibs.loanmgmt.dao;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import com.cg.ibs.loanmgmt.bean.LoanMaster;

public class BankDaoImpl implements BankDao {

	public boolean saveLoan(LoanMaster loanMaster) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean savePreClosure(LoanMaster loanMaster) {
		// TODO Auto-generated method stub
		return false;
	}

	public void getDocument(String sb) throws Exception {
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
				new FileOutputStream("./downloads/duplicate.pdf"));
		bufferedOutputStream.write(sb.toString().getBytes());
		bufferedOutputStream.flush();
		bufferedOutputStream.close();// TODO Auto-generated method stub

	}

}
