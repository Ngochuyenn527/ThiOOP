package de23404;

public abstract class Employee implements IEmployee {
	private String name;
	private int paymentPerHour;

	public Employee() {
	}

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public String getName() {
		return name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

	@Override
	public String toString() {
		return "Employee N=" + name + " PPH=" + paymentPerHour;
	}

	@Override
	public abstract int calculateSalary();

}
