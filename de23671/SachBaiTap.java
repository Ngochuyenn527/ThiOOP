package de23671;

public class SachBaiTap extends Book {
	private String year;
	private double price;

	public SachBaiTap() {
	}

	public SachBaiTap(String title, String author, String year, double price) {
		super(title, author);
		this.year = year;
		try {
			if(price > 0) {
				this.price = price;
			}
			else {
				throw new Exception("gia phai phai la so duong");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public String getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void setPrice(double price) {
		try {
			if(price > 0) {
				this.price = price;
			}
			else {
				throw new Exception("gia phai phai la so duong");
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Override
	public String toString() {
		return "SachBaiTap " + super.toString() + " year=" + year + ", price=" + price;
	}

	@Override
	public void getInfo() {
		this.toString();
	}

}
