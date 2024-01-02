package de23528;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestSV {
	private ArrayList<SVCNTT> list;
	
	public TestSV() {
		this.list = new ArrayList<SVCNTT>();
	}

	public ArrayList<SVCNTT> giaLap() {
		for (int i = 0; i < 3; i++) {
			SVCNTT sv = new SVCNTT();
			System.out.println("Nhap thong tin cho sv thu " + (i + 1));
			sv.setData();
			list.add(sv);
		}

		Collections.sort(list, new Comparator<SVCNTT>() {

			@Override
			public int compare(SVCNTT o1, SVCNTT o2) {
				return o1.getMaSV().compareTo(o2.getMaSV());
			}
		});
		for (SVCNTT svcntt : list) {
			System.out.println(svcntt);
		}
		return list;

	}

	public ArrayList<SVCNTT> timSV(){
		System.out.println("Nhap ten sv:");
		Scanner sc = new Scanner(System.in);
		String tensv = sc.nextLine();
		
			
		for (SVCNTT svcntt : list) {
			if(svcntt.getTenSV().contains(tensv)) {
				System.out.println("Nhap thong tin muon sua:");
				svcntt.setData();
			}	
		}
		for (SVCNTT svcntt : list) {
			System.out.println(svcntt);
		}
		return list;
	}


	
	public static void main(String[] args) {
		TestSV test = new TestSV();
		ArrayList<SVCNTT> result1 = test.giaLap();
		ArrayList<SVCNTT> result2 = test.timSV();

	}

}
