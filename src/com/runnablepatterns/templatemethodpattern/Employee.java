package com.runnablepatterns.templatemethodpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle employee payment.
 *  
 */
public class Employee extends PayablePerson {

	@Override
	void getSalary() {
		setSalaryAmount(1500);
		System.out.println("Calculating base salary.");
	}

	@Override
	void getDeduction() {
		setDeductionAmount(getSalaryAmount()*0.11);
		System.out.println(String.format("11%s Deduction of $%s is: $%s.", "%", getSalaryAmount(), getDeductionAmount()));
	}

	@Override
	void sendPayment() {
		System.out.println("Transfering payment to account.");
	}

}
