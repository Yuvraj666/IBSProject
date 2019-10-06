package com.cg.ibs.loanmgmt.dao;

import java.util.Map;

import com.cg.ibs.loanmgmt.bean.CustomerBean;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public class CustomerDaoImpl implements CustomerDao {
	public static DataBase base = new DataBase();
	public static Map<String, LoanMaster> loanData = base.getLoanMasterData();
	public static Map<String, CustomerBean> customerData = base.getCustomerBeanData();

	public boolean updateEMI(LoanMaster loanMaster) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanMaster getHistory(String userId) {
		
		return loanData.get(userId);
		
		// List<LoanMaster> loanMasters = new ArrayList<LoanMaster>(loanData.val);
		// List<LoanMaster> customerLoanMasters = new ArrayList<LoanMaster>();
		// for (LoanMaster string : customerLoanMasters) {
		// System.out.println(string);
		// }

//		for (Entry<String, LoanMaster> entry: loanMasterData.entrySet()) {
//			loanMasters.add(entry.getValue());
//			}
		// return loanMaster;
	}

	public void saveDocument(StringBuilder sb) throws Exception {
		// TODO Auto-generated method stub

	}

	public LoanMaster setEMIDetails(LoanMaster loanMaster) {
		loanMaster.setNumberOfEmis(loanMaster.getNumberOfEmis());
		return loanMaster;

	}
}
