package de3;

import java.util.ArrayList;

public interface EManager {
	public boolean update(int id) throws NullPointerException;

	public boolean add(Employ e) throws NullPointerException;

	public boolean del(Employ e) throws NullPointerException;

	public ArrayList<Employ> search(String name) throws NullPointerException;

	public double getTotalSalary() throws NullPointerException;
}
