package object;

import java.util.ArrayList;
import java.util.List;

public class MobileManagerImpl implements MobileManager {
	private ArrayList<Mobile> list;
	
	public MobileManagerImpl() {
		this.list = new ArrayList<Mobile>();
	}

	public MobileManagerImpl(ArrayList<Mobile> list) {
		this.list = list;
	}

	@Override
	public boolean addMobile(Mobile m) throws NullPointerException {
		boolean find = false;
		try {
		for (Mobile mobile : this.list) {
			if(mobile.getProduct_id() == m.getProduct_id()) {
				find = true;
				break;
			}
		}
		
		}catch(NullPointerException ex){
			ex.printStackTrace();
		}
		if(find) return false;
		else {
			this.list.add(m);
			return true;
		}
	}
	
	@Override
	public boolean delMobile(Mobile m) throws NullPointerException{
		boolean result = false;
		try {
		for (Mobile mobile : this.list) {
			if(mobile.getProduct_price() == m.getProduct_id()) {
				list.remove(mobile);
				result = true;
			}
		}
		
		} catch(NullPointerException ex){
			ex.printStackTrace();
		}
		return result;
	}
	
	@Override
	public List<Mobile> searchMobile(String name) throws NullPointerException{
		ArrayList<Mobile> results = new ArrayList<Mobile>();
		try {
		for (Mobile mobile : this.list) {
			if(mobile.getProduct_name().contains(name)) {
				results.add(mobile);
			}
		}
		
		}catch(NullPointerException ex){
			ex.printStackTrace();
		}
		return results;
	}

	@Override
	public double getTotalStorage() throws NullPointerException{
		double sum = 0;
		try {
		for (Mobile mobile : this.list) {
			sum += mobile.getTotalPrice(); 
		}
		
		}catch(NullPointerException ex){
			ex.printStackTrace();
		}
		return sum;
	}

}

