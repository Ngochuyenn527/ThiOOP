package de3;

public class Employ extends Profile {
	private double salary;
	private double coefficient;
	
	

	public Employ() {
	}

	public Employ(int id, String name, double basesalary, double salary, double coefficient) {
		super(id, name, basesalary);
		this.salary = salary;
		this.coefficient = coefficient;
	}
	



	public double getCoefficient() {
		return coefficient;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}



	@Override
	public String toString() {
		return "Employ ["+super.toString()+"salary=" + salary + ", coefficient=" + coefficient + "]";
	}



	@Override
	public double getSalary() {
		return this.getBasesalary()*this.getCoefficient();
	}

}
