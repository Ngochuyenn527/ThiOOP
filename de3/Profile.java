package de3;

public abstract class Profile {
	private int id;
	private String name;
	private double basesalary;
	
	public Profile() {
	}

	public Profile(int id, String name, double basesalary) {
		this.id = id;
		this.name = name;
		this.basesalary = basesalary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasesalary() {
		return basesalary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", name=" + name + ", basesalary=" + basesalary + "]";
	}
	
	public abstract double getSalary();

}
