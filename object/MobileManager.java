package object;

import java.util.List;

public interface MobileManager {
	public boolean addMobile(Mobile m) throws NullPointerException;
	public boolean delMobile(Mobile m) throws NullPointerException;
	public List<Mobile> searchMobile(String name) throws NullPointerException;
	public double getTotalStorage() throws NullPointerException;

}
