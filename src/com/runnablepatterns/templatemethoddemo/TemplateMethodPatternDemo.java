package com.runnablepatterns.templatemethoddemo;

import com.runnablepatterns.templatemethodpattern.Consultant;
import com.runnablepatterns.templatemethodpattern.Employee;
import com.runnablepatterns.templatemethodpattern.PayablePerson;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class to demonstrate Template Method Pattern
 *
 */
public class TemplateMethodPatternDemo {

	public static void main(String[] args) {
		// create employee object
		PayablePerson employee = new Employee();
		
		System.out.println("Handling payment for Employee: \n");
		
		// process payment
		employee.processPayment();
		
		// create consultant object
		PayablePerson consultant = new Consultant();
				
		System.out.println("\nHandling payment for Consultant: \n");
				
		// process payment
		consultant.processPayment();
	}

}
