package object;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {
	private static ArrayList<Mobile> list;
	
	public void generateList(int n) {
		list = new ArrayList<Mobile>(n);
		
		ArrayList<Integer> ids = new ArrayList<Integer>();
		
		//name
		String [] pn = {"Iphone", "Oppo", "Samsung", "LG"};
		
		//mm
		String [] mm = {"Apple", "CMP1", "CMP2", "CMP3"};
		
		int element;
		while(list.size() < n) {
			Mobile m = new Mobile();
			
			element = (int)(Math.random()*10);
			if(!ids.contains(element)) {
				ids.add(element);
				m.setProduct_id(element);
			}
			
			element = (int)(Math.random()*pn.length);
			m.setProduct_name(pn[element]);
			
			element = (int)(Math.random()*1000);
			m.setProduct_price(element);
			
			element = (int)(Math.random()*100);
			m.setProduct_total(element);
			
			element = (int)(Math.random()*mm.length);
			m.setMobile_manufacturer(mm[element]);
			
			element = (int)(Math.random()*9);
			m.setMobile_ram(element);
			
			list.add(m);
		}
	}
	
	public void printList() {
		list.forEach(m->{
			System.out.println(m);
		});
		System.out.println("\n");
	}
	
	public void printList(List<Mobile> list) {
		list.forEach(m->{
			System.out.println(m);
		});
	}
	
	public static void main(String[] args) {
		int n = 1 + (int)(Math.random()*6);
		
		TestProduct tp = new TestProduct();
		
		tp.generateList(n);
		tp.printList();
		
		
		MobileManagerImpl mmi = new MobileManagerImpl(list);
		mmi.addMobile(new Mobile(9,"LapTop", 7777, 7, "CMP7", 8));
		tp.printList();
		
		mmi.delMobile(new Mobile(2, null, n, n, null, n));
		tp.printList();
		
		tp.printList(mmi.searchMobile("Samsung"));
		
		System.out.println("\nTotal:" + mmi.getTotalStorage());
		
		

	}

}

