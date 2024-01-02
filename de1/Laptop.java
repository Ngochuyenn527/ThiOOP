package de1;

public class Laptop extends Product {
	private String manufacturer;
	private double screensize;

	public Laptop() {
	}

	public Laptop(int id, String name, double price, int quantity, String manufacturer, double screensize) {
		super(id, name, price, quantity);
		this.manufacturer = manufacturer;
		this.screensize = screensize;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	@Override
	public String toString() {
		return "Laptop" + super.toString() + " MF=" + manufacturer + ", S=" + screensize;
	}

	@Override
	public double getAmount() {
		return this.getPrice() * this.getQuantity();
	}

}
