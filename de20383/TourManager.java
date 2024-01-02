package de20383;

import java.util.ArrayList;

public interface TourManager {
	public boolean addTour(Tour t) throws NullPointerException;

	public boolean delTour(Tour t) throws NullPointerException;
	
	public ArrayList<Tour> searchTour(String name)throws NullPointerException;
	
	public ArrayList<Tour> searchTour(double price)throws NullPointerException;
	
	public boolean sortedTour() throws NullPointerException;
	
	public double getTotalStorage();
}
