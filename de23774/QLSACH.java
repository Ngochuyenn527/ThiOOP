package de23774;

public interface QLSACH {
	public boolean display() throws Exception;

	public boolean add(SACH s) throws NullPointerException;

	public boolean del(SACH s) throws NullPointerException;

	public boolean edit(int id) throws NullPointerException;

}
