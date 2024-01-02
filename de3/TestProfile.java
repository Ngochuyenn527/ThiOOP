package de3;

import java.util.ArrayList;

public class TestProfile {
	public static void main(String[] args) {
		Employ e1 = new Employ(1, "huyen", 3423, 45, 234);
		Employ e2 = new Employ(2, "duong", 43, 45, 234);
		Employ e3 = new Employ(3, "thang", 2222, 45, 234);
		Employ e4 = new Employ(4, "trung", 4342, 45, 234);
		Employ e5 = new Employ(5, "thuy", 657, 45, 234);
		
		EManagerImpl emi = new EManagerImpl();
		
		emi.add(e1);
		emi.add(e2);
		emi.add(e3);
		emi.add(e4);
		emi.add(e5);
		
		System.out.println("List after add");
		emi.printList();
		
		System.out.println("\nList after update:");
		emi.update(2);
		emi.printList();

		System.out.println("\nList after delete:");
		emi.del(e5);
		emi.printList();
		
		System.out.println("\nSearch list:");
		ArrayList<Employ> result = emi.search("huyen");
		for (Employ employ : result) {
			System.out.println(employ);
		}
		
		
		System.out.println("\nTotal:" + emi.getTotalSalary());

	}

}
