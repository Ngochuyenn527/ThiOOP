package de1;

import java.util.ArrayList;

public interface LaptopManager {
	public boolean update(int id) throws NullPointerException;

	public boolean add(Laptop l) throws NullPointerException;

	public boolean del(Laptop l) throws NullPointerException;

	public ArrayList<Laptop> search(String name) throws NullPointerException;

	public boolean sortedname() throws NullPointerException;

	public boolean sortedscreen() throws NullPointerException;

	public double getTotal() throws NullPointerException;

}
