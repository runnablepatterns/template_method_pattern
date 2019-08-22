package com.runnablepatterns.templatemethodpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle consultant payment.
 *  
 */
public class Consultant extends PayablePerson {

	@Override
	void getSalary() {
		setSalaryAmount(1800);
		System.out.println("Calculating hourly salary.");
	}

	@Override
	void getDeduction() {
		setDeductionAmount(getSalaryAmount()*0.05);
		System.out.println(String.format("5%s Deduction of $%s is: $%s.", "%", getSalaryAmount(), getDeductionAmount()));
	}

	@Override
	void sendPayment() {
		System.out.println("Printing check.");
	}
	
	@Override
	void sendPaymentCopy() {
		System.out.println("Sending payment copy via email.");
	}

}
