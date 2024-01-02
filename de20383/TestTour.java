package de20383;

import java.util.ArrayList;

public class TestTour {
	public static void main(String[] args) {
		Tour t1 = new Tour(1, "ride_hourse", 4342, 12, "2n1d", "bus");
		Tour t2 = new Tour(2, "ride_cat", 3432, 89, "2n1d", "taxi");
		Tour t3 = new Tour(3, "ride_lion", 111, 6, "2n1d", "moto");
		Tour t4 = new Tour(4, "ride_tiger", 7676, 2, "2n1d", "car");
		Tour t5 = new Tour(5, "ride_eagle", 4533, 3, "2n1d", "bus");
		
		TourManagerImpl tmi = new TourManagerImpl();
		
		System.out.println("List after add:");
		tmi.addTour(t1);
		tmi.addTour(t2);
		tmi.addTour(t3);
		tmi.addTour(t4);
		tmi.addTour(t5);
		tmi.printList();
		
		System.out.println("\nList after delete: ");
		tmi.delTour(t5);
		tmi.printList();
		
		System.out.println("\nSearch name:");
		ArrayList<Tour> result1 = tmi.searchTour("ride_tiger");
		for (Tour tour : result1) {
			System.out.println(tour);
		}
		
		System.out.println("\nSearch price:");
		ArrayList<Tour> result2 = tmi.searchTour(111.0);
		for (Tour tour : result2) {
			System.out.println(tour);
		}
		
		System.out.println("\nList after softed");
		tmi.sortedTour();
		tmi.printList();
		
		System.out.println("Total: " + tmi.getTotalStorage());

	}
	
	


}
