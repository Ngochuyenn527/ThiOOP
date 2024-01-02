package de3;

import java.util.ArrayList;

public class EManagerImpl implements EManager {
	private ArrayList<Employ> list;

	public EManagerImpl() {
		this.list = new ArrayList<Employ>();
	}

	@Override
	public boolean update(int id) throws NullPointerException {
		try {
			for (Employ employ : list) {
				if (employ.getId() == id) {
					this.list.remove(employ);
					this.list.add(new Employ(9, "huyen", 7777, 45, 234));
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean add(Employ e) throws NullPointerException {
		boolean find = false;
		try {
			for (Employ employ : list) {
				if (employ.getId() == e.getId()) {
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
			this.list.add(e);
			return true;
		}
	}

	@Override
	public boolean del(Employ e) throws NullPointerException {
		try {
			for (Employ employ : list) {
				if (employ.getId() == e.getId()) {
					this.list.remove(employ);
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Employ> search(String name) throws NullPointerException {
		ArrayList<Employ> results = new ArrayList<Employ>();

		try {
			for (Employ employ : list) {
				if (employ.getName().contains(name)) {
					results.add(employ);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return results;
	}

	@Override
	public double getTotalSalary() throws NullPointerException {
		double sum = 0;
		try {
			for (Employ employ : list) {
				sum += employ.getSalary();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return sum;
	}

	public void printList() {
		for (Employ employ : list) {
			System.out.println(employ);
		}
	}

}
