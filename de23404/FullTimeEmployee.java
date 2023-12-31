package de23404;

public class FullTimeEmployee extends Employee implements IEmployee {
	
	
	public FullTimeEmployee() {
	}
	
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	public String toString() {
		return "FullTimeEmployee "+super.toString();
	}

	@Override
	public int calculateSalary() {
		return 8*this.getPaymentPerHour();
	}
	
}
