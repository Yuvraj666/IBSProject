package com.cg.ibs.loanmgmt.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.cg.ibs.loanmgmt.bean.CustomerBean;
import com.cg.ibs.loanmgmt.bean.LoanMaster;

public class DataBase {

	private static Map<String, LoanMaster> loanMasterData = new HashMap<String, LoanMaster>();
	private static Map<String, CustomerBean> customerBeanData = new HashMap<String, CustomerBean>();
	static {
		CustomerBean customerBean = new CustomerBean("Divyam", "Batta", "12345", "dbatta");
		CustomerBean customerBean1 = new CustomerBean("Chetan", "Kohli", "12346", "ckohli");
		CustomerBean customerBean2 = new CustomerBean("Divyasnh", "Batta", "12347", "dgoyal");
		CustomerBean customerBean3 = new CustomerBean("Yuvraj", "Kalra", "12348", "ykalra");

		customerBeanData.put(customerBean.getUserId(), customerBean);
		customerBeanData.put(customerBean1.getUserId(), customerBean1);
		customerBeanData.put(customerBean2.getUserId(), customerBean2);
		customerBeanData.put(customerBean3.getUserId(), customerBean3);
		
		LoanMaster loanMaster = new LoanMaster("997", 2500000.00, 120, 30996.0,customerBean, 120, 60, LocalDate.now());
		LoanMaster loanMaster1 = new LoanMaster("998", 1000000.00, 24, 45800.0, customerBean1, 24, 16, LocalDate.now());
		LoanMaster loanMaster2 = new LoanMaster("999", 500000.00, 24, 23583.0, customerBean2, 24, 23, LocalDate.now());
		LoanMaster loanMaster3 = new LoanMaster("1000", 1000000.00, 60, 46771.0,customerBean3, 60, 50, LocalDate.now());
		
		loanMasterData.put(loanMaster.getLoanNumber(), loanMaster);
		loanMasterData.put(loanMaster1.getLoanNumber(), loanMaster1);
		loanMasterData.put(loanMaster2.getLoanNumber(), loanMaster2);
		loanMasterData.put(loanMaster3.getLoanNumber(), loanMaster3);

	}

	public static Map<String, LoanMaster> getLoanMasterData() {
		return loanMasterData;
	}

	public static void setLoanMasterData(Map<String, LoanMaster> loanMasterData) {
		DataBase.loanMasterData = loanMasterData;
	}

	public static Map<String, CustomerBean> getCustomerBeanData() {
		return customerBeanData;
	}

	public static void setCustomerBeanData(Map<String, CustomerBean> customerBeanData) {
		DataBase.customerBeanData = customerBeanData;
	}

}
