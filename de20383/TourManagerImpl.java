package de20383;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TourManagerImpl implements TourManager {
	private ArrayList<Tour> list;
	
	public TourManagerImpl() {
		this.list = new ArrayList<Tour>();
	}

	@Override
	public boolean addTour(Tour t) throws NullPointerException {
		boolean find = false;
		try {
		for (Tour tour : list) {
			if(tour.getProduct_id() == t.getProduct_id()) {
				find = true;
				break;
			}
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		if(find) return false;
		else {
			list.add(t);
			return true;
		}		
	}

	@Override
	public boolean delTour(Tour t) throws NullPointerException {
		try {
		for (Tour tour : list) {
			if(tour.getProduct_id() == t.getProduct_id()){
				this.list.remove(tour);
				return true;
				}
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Tour> searchTour(String name) throws NullPointerException {
		ArrayList<Tour> results = new ArrayList<Tour>();
		try {
		for (Tour tour : this.list) {
			if(tour.getProduct_name().contains(name)) {
				results.add(tour);
			}
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return results;
	}

	@Override
	public ArrayList<Tour> searchTour(double price) throws NullPointerException {
		ArrayList<Tour> results = new ArrayList<Tour>();
		try {
		for (Tour tour : this.list) {
			if(tour.getProduct_price() == price) {
				results.add(tour);
			}
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return results;
	}

	@Override
	public boolean sortedTour() throws NullPointerException {
		try {
		Collections.sort(list, new Comparator<Tour>() {
			@Override
			public int compare(Tour o1, Tour o2) {
				double result = o1.getProduct_price() - o2.getProduct_price();
				if(result < 0) {
					return -1;
				}
				else if(result > 0) {
					return 1;

				}
				else {
					return 0;
				}
			}
		});
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return true;
	}

	@Override
	public double getTotalStorage() {
		double sum = 0;
		try {
			for (Tour tour : list) {
				sum += tour.getTotalPrice();
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return sum;
	}
	
	public void printList() {
		for (Tour tour : list) {
			System.out.println(tour);
		}
	}
	
	

}
