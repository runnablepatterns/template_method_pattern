package com.runnablepatterns.templatemethodpattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to handle payable persons.
 * It will contain the payment process algorithm. 
 */
public abstract class PayablePerson {
	
	/**
	 * Variables to store payment details
	 */
	private double salaryAmount = 0;
	private double deductionAmount = 0;

	/**
	 * Template Method.
	 * This method contains the algorithm steps and structure. It is final so the subclasses can't change it.
	 */
	public final void processPayment() {
		// call specific steps to process the payment
		getSalary();
		getDeduction();
		sendPayment();
		notifyAccountant();
		sendPaymentCopy();
	}
	
	/**
	 * This method has to be implemented by subclasses.
	 * It calculates the salary.
	 */
	abstract void getSalary();
	
	/**
	 * This method has to be implemented by subclasses.
	 * It calculates the deduction.
	 */
	abstract void getDeduction();
	
	/**
	 * This method has to be implemented by subclasses
	 * It sends the money.
	 */
	abstract void sendPayment();
	
	/**
	 * This method is used by all subclasses.
	 */
	final void notifyAccountant() {
		System.out.println("Sending notification to Accountant Department.");
	}
	
	/**
	 * This method is a hook. As you can see, it has the default implementation.
	 * Subclasses can then override this
	 */
	void sendPaymentCopy() {
		System.out.println("No copy needed by default.");
	}

	/**
	 * Gets the salary
	 * @return the salary
	 */
	public double getSalaryAmount() {
		return salaryAmount;
	}

	/**
	 * Set the salary
	 * @param salaryAmount
	 */
	public void setSalaryAmount(double salaryAmount) {
		this.salaryAmount = salaryAmount;
	}

	/**
	 * Gets the deduction
	 * @return the deduction
	 */
	public double getDeductionAmount() {
		return deductionAmount;
	}

	/**
	 * Sets the deduction
	 * @param deductionAmount
	 */
	public void setDeductionAmount(double deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
}
