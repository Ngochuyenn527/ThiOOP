package de23404;

public class PartTimeEmployee extends Employee implements IEmployee {
	private int workingHours;

	public PartTimeEmployee() {
	}

	public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee " + super.toString() + " WH=" + workingHours;
	}

	@Override
	public int calculateSalary() {
		return (int) (this.getPaymentPerHour() * this.getWorkingHours());
	}

}
