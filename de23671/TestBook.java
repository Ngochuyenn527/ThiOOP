package de23671;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestBook {
	ArrayList<SachGiaoTrinh> list = new ArrayList<SachGiaoTrinh>();
	
	public void taoDuLieu(){
		for(int i=0; i<3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap thong tin cho quyen sach thu "+(i+1));
			SachGiaoTrinh sgt = new SachGiaoTrinh();
			sgt.setTitle(sc.nextLine());
			sgt.setAuthor(sc.nextLine());
			sgt.setYear(sc.nextLine());
			sgt.setPrice(sc.nextDouble());		

			list.add(sgt);
		}
			//sx tang dan theo gia
			Collections.sort(list, Comparator.comparing(SachGiaoTrinh::getPrice));
			
			for (SachGiaoTrinh sachGiaoTrinh : list) {
				System.out.println(sachGiaoTrinh);
			}
	
		}
	
	public void timKiem(String tieude) {
		Scanner sc = new Scanner(System.in);
		
		for (SachGiaoTrinh sachGiaoTrinh : list) {
			if(sachGiaoTrinh.getTitle().equals(tieude)) {
				System.out.println("Tieu de "+ tieude + " da co trong danh sach. Vui long nhap lai thong tin");
				sachGiaoTrinh.setTitle(sc.nextLine());
				sachGiaoTrinh.setAuthor(sc.nextLine());
				sachGiaoTrinh.setYear(sc.nextLine());
				sachGiaoTrinh.setPrice(sc.nextDouble());
			}
		}
		
		//sx tang dan theo nam
		Collections.sort(list, Comparator.comparing(SachGiaoTrinh::getYear));
		
		System.out.println("List sau khi sua va sx year:");
		for (SachGiaoTrinh sachGiaoTrinh : list) {
			System.out.println(sachGiaoTrinh);
		}

	}
	
	public static void main(String[] args) {
		TestBook tb = new TestBook();
		tb.taoDuLieu();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tieu de muon tim:");
		String tieude = sc.nextLine();
		tb.timKiem(tieude);
	}
	
	

}
