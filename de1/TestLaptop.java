package de1;

import java.util.ArrayList;

public class TestLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(1, "Asus", 29384, 2, "Androi", 15.6);
		Laptop l2 = new Laptop(2, "Macbook", 34342, 2, "Androi", 13);
		Laptop l3 = new Laptop(3, "Dell", 46565, 6, "Androi", 14);
		Laptop l4 = new Laptop(4, "Vostro", 3423, 4, "Androi", 15.6);
		Laptop l5 = new Laptop(5, "AK", 3534535, 2, "Androi", 15);

		LaptopManagerImpl l = new LaptopManagerImpl();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.printList();

		System.out.println("\nList after update:");
		l.update(4);
		l.printList();

		System.out.println("\nList after add:");
		l.add(new Laptop(7, "AK", 7777777, 7, "Androi", 77));
		l.printList();

		System.out.println("\nList after delete:");
		l.del(l1);
		l.printList();

		System.out.println("\nSearch list: ");
		ArrayList<Laptop> results = l.search("Macbook");
		for (Laptop laptop : results) {
			System.out.println(laptop);
		}
		
		System.out.println("\nList after sortedname:");
		l.sortedname();
		l.printList();
		
		System.out.println("\nList after sortedscreen:");
		l.sortedscreen();
		l.printList();

		System.out.println("\nTotal: " + l.getTotal());

	}

}
