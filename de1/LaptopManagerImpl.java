package de1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaptopManagerImpl implements LaptopManager {
	private ArrayList<Laptop> list;

	public LaptopManagerImpl() {
		this.list = new ArrayList<Laptop>();
	}

	public void printList() {
		for (Laptop laptop : list) {
			System.out.println(laptop);
		}
	}

	@Override
	public boolean update(int id) throws NullPointerException {
		try {
			for (Laptop laptop : list) {
				if (laptop.getId() == id) {
					this.list.remove(laptop);
					this.list.add(new Laptop(8, "Vostro", 3423, 4, "Androi", 15.6));
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean add(Laptop l) throws NullPointerException {
		boolean find = false;
		try {
			for (Laptop laptop : list) {
				if (laptop.getId() == l.getId()) {
					find = true;
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (find)
			return false;
		else {
			this.list.add(l);
			return true;
		}
	}

	@Override
	public boolean del(Laptop l) throws NullPointerException {
		try {
			for (Laptop laptop : list) {
				if (l.getId() == laptop.getId()) {
					this.list.remove(laptop);
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Laptop> search(String name) throws NullPointerException {
		ArrayList<Laptop> results = new ArrayList<Laptop>();
		try {
			for (Laptop laptop : list) {
				if (laptop.getName().contains(name)) {
					results.add(laptop);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return results;
	}
	
	@Override
	public boolean sortedname() throws NullPointerException {
		Collections.sort(list, new Comparator<Laptop>() {
			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return true;
	}

	@Override
	public boolean sortedscreen() throws NullPointerException {
		Collections.sort(list, new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				double value = o1.getScreensize()-o2.getScreensize();
				if(value > 0) {
					return 1;
				}
				else if(value < 0 ) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});
		return true;
	}

	@Override
	public double getTotal() throws NullPointerException {
		double sum = 0;
		try {
			for (Laptop laptop : list) {
				sum += laptop.getAmount();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return sum;
	}



}
