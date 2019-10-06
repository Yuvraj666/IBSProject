package com.cg.ibs.loanmgmt.ui;

import java.util.Scanner;

import com.cg.ibs.loanmgmt.bean.Document;
import com.cg.ibs.loanmgmt.bean.LoanMaster;
import com.cg.ibs.loanmgmt.service.CustomerService;
import com.cg.ibs.loanmgmt.service.CustomerServiceImpl;
import com.cg.ibs.loanmgmt.service.EducationLoan;
import com.cg.ibs.loanmgmt.service.HomeLoan;
import com.cg.ibs.loanmgmt.service.Loan;
import com.cg.ibs.loanmgmt.service.PersonalLoan;
import com.cg.ibs.loanmgmt.service.VehicleLoan;

public class User {
	public static Scanner read;
	CustomerService customerService = new CustomerServiceImpl();
	Document document = new Document();
	Loan loan;

	private void init() throws Exception {
		CustomerOptions customerChoice = null;
		String customerId;
		while (customerChoice != CustomerOptions.EXIT) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (CustomerOptions menu : CustomerOptions.values()) {
				System.out.println((menu.ordinal() + 1) + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 1 && ordinal < (CustomerOptions.values().length) + 1) {
				customerChoice = CustomerOptions.values()[ordinal - 1];
				switch (customerChoice) {
				case APPLY_LOAN:
					selectLoanType();
					break;
				case PAY_EMI:
					break;
				case APPLY_PRECLOSURE:
					break;
				case VIEW_HISTORY:
					System.out.println(" Enter your customer ID");
					customerId = read.next();
					getLoanDetails(customerId);
					break;
				case EXIT:
					System.out.println("Thank You! Come Again.");
					break;
				}

			} else {
				System.out.println("Invalid Option.");
				customerChoice = null;
			}
		}
	}

	private void selectLoanType() throws Exception {
		LoanTypes choice = null;
		while (choice != LoanTypes.GO_BACK) {
			System.out.println("Menu");
			System.out.println("--------------------");
			System.out.println("Choice");
			System.out.println("--------------------");
			for (LoanTypes menu : LoanTypes.values()) {
				System.out.println((menu.ordinal() + 1) + "\t" + menu);
			}
			System.out.println("Choice");
			int ordinal = read.nextInt();
			if (ordinal >= 1 && ordinal < (LoanTypes.values().length) + 1) {
				choice = LoanTypes.values()[ordinal - 1];

				switch (choice) {
				case HOME_LOAN:
					createHomeLoan();
					acceptDocument();
					break;
				case EDUCATION_LOAN:
					createEducationLoan();
					acceptDocument();
					break;
				case PERSONAL_LOAN:
					createPersonalLoan();
					acceptDocument();
					break;
				case VEHICLE_LOAN:
					createVehicleLoan();
					acceptDocument();
					break;
				case GO_BACK:
					System.out.println("Thank You!");
					break;
				}
			} else {
				System.out.println("Invalid Loan Type Selection!!");
				choice = null;

			}

		}

	}

	private void createHomeLoan() throws Exception {
		loan = new HomeLoan();
		System.out.print("Interest Rate for Home Loan is : ");
		System.out.println(loan.getInterestRate() + "%");
		boolean check = false;
		while (check != true) {
			System.out.println("Enter the Loan Amount required  : ");
			System.out.println("***Minimum Loan Limit = 10 Thousand***");
			System.out.println("***Maximum Loan Limit = 2 Crores***");
			loan.setLoanAmount(read.nextDouble());
			System.out.println("Enter the Loan Tenure : ");
			System.out.println("***Tenure should be in months and multiple of 6***");
			loan.setLoanTenure(read.nextInt());
			check = customerService.loanCustomerInputVerificationService(loan);
			if (check == false) {
				System.out.println("Invalid inputs");
			}
		}
		loan = customerService.calculateEmi(loan);
		System.out.println(loan);
	}

	private void createPersonalLoan() throws Exception {
		loan = new PersonalLoan();
		System.out.print("Interest Rate for Home Loan is : ");
		System.out.println(loan.getInterestRate() + "%");
		boolean check = false;
		while (check != true) {
			System.out.println("Enter the Loan Amount required  : ");
			System.out.println("***Minimum Loan Limit = 10 Thousand***");
			System.out.println("***Maximum Loan Limit = 2 Crores***");
			loan.setLoanAmount(read.nextDouble());
			System.out.println("Enter the Loan Tenure : ");
			System.out.println("***Tenure should be in months and multiple of 6***");
			loan.setLoanTenure(read.nextInt());
			check = customerService.loanCustomerInputVerificationService(loan);
			if (check == false) {
				System.out.println("Invalid inputs");
			}
		}
		loan = customerService.calculateEmi(loan);
		System.out.println(loan);
	}

	private void createVehicleLoan() throws Exception {
		loan = new VehicleLoan();
		System.out.print("Interest Rate for Home Loan is : ");
		System.out.println(loan.getInterestRate() + "%");
		boolean check = false;
		while (check != true) {
			System.out.println("Enter the Loan Amount required  : ");
			System.out.println("***Minimum Loan Limit = 10 Thousand***");
			System.out.println("***Maximum Loan Limit = 2 Crores***");
			loan.setLoanAmount(read.nextDouble());
			System.out.println("Enter the Loan Tenure : ");
			System.out.println("***Tenure should be in months and multiple of 6***");
			loan.setLoanTenure(read.nextInt());
			check = customerService.loanCustomerInputVerificationService(loan);
			if (check == false) {
				System.out.println("Invalid inputs");
			}
		}
		loan = customerService.calculateEmi(loan);
		System.out.println(loan);
	}

	private void createEducationLoan() throws Exception {
		loan = new EducationLoan();
		System.out.print("Interest Rate for Home Loan is : ");
		System.out.println(loan.getInterestRate() + "%");
		boolean check = false;
		while (check != true) {
			System.out.println("Enter the Loan Amount required  : ");
			System.out.println("***Minimum Loan Limit = 10 Thousand***");
			System.out.println("***Maximum Loan Limit = 2 Crores***");
			loan.setLoanAmount(read.nextDouble());
			System.out.println("Enter the Loan Tenure : ");
			System.out.println("***Tenure should be in months and multiple of 6***");
			loan.setLoanTenure(read.nextInt());
			check = customerService.loanCustomerInputVerificationService(loan);
			if (check == false) {
				System.out.println("Invalid inputs");
			}
		}
		loan = customerService.calculateEmi(loan);
		System.out.println(loan);
	}

	private void acceptDocument() throws Exception {
		System.out.println("Enter the name of the document to be uploaded");
		document.setNameOfDocument(read.next());
		System.out.println("Enetr the path of the document to be uploaded");
		document.setPathOfDocument(read.next());
		customerService.getDocument(document);
	}

	private void getLoanDetails(String userId) {
		// List<LoanMaster> loanMasters = new ArrayList<LoanMaster>();
		LoanMaster loanMaster = customerService.getHistory(userId);

		System.out.println(loanMaster.toString());

	}

	public static void main(String[] args) throws Exception {
		read = new Scanner(System.in);
		User user = new User();
		user.init();
		read.close();
	}
}
