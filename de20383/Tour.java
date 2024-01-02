package de20383;

public class Tour extends Product {
	
	private String tour_number_dates;
	private String tour_transport;
	

	public Tour() {
	}

	public Tour(int product_id, String product_name, double product_price, int product_total, String tour_number_dates,
			String tour_transport) {
		super(product_id, product_name, product_price, product_total);
		this.tour_number_dates = tour_number_dates;
		this.tour_transport = tour_transport;
	}
	


	public String getTour_number_dates() {
		return tour_number_dates;
	}

	public String getTour_transport() {
		return tour_transport;
	}

	public void setTour_number_dates(String tour_number_dates) {
		this.tour_number_dates = tour_number_dates;
	}

	public void setTour_transport(String tour_transport) {
		this.tour_transport = tour_transport;
	}

	@Override
	public String toString() {
		return "Tour ["+super.toString()+"tour_number_dates=" + tour_number_dates + ", tour_transport=" + tour_transport + "]";
	}

	@Override
	public double getTotalPrice() {
		return 1.1*this.getProduct_price()*this.getProduct_total();
	}

}
