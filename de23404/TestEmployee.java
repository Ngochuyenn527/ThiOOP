package de23404;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployee {
	public static void main(String[] args) {

		ArrayList<Employee> employee = new ArrayList<Employee>();

		Employee e;

		// name
		String[] name = { "bui", "thi", "ngoc", "huyen", "ahihi", "ahoho"};

		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 100);

			int element = (int) (Math.random() * name.length);

			int pay = (int) (Math.random() * 10000);

			int hour = 1 + (int) (Math.random() * 12);

			if (n % 2 == 0) {
				e = new PartTimeEmployee(name[element], pay, hour);
			} else {
				e = new FullTimeEmployee(name[element], pay);
			}

			employee.add(e);
		}

		// sort
		Collections.sort(employee, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				double result = o1.calculateSalary() - o2.calculateSalary();
				if (result < 0) {
					return -1;
				} else if (result > 0) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}

		// search name and update
		System.out.println("\nSearch name:");
		ArrayList<Employee> results = new ArrayList<Employee>();
		String name_search = name[(int) (Math.random() * name.length)];
		for (Employee employee2 : employee) {
			if (employee2.getName().contains(name_search)) {
				results.add(employee2);
			}
		}

		for (Employee employee2 : results) {
			employee2.setPaymentPerHour(77777);
		}
		
		//print
		for (Employee employee2 : results) {
			System.out.println(employee2);
		}
		

	}

}
