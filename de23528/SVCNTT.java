package de23528;

import java.util.Scanner;

public class SVCNTT extends SinhVien {
	
	public SVCNTT() {
	}
	
	public SVCNTT(String maSV, String tenSV, double diemLT, double diemTH) {
		super();
	}

	@Override
	public boolean datChuan() {
		if(this.getDiemLT() >= 5 && this.getDiemTH() >= 5) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setData() {
		Scanner sc = new Scanner(System.in);
		
		String maSV = sc.nextLine();
		try {
			if(maSV != null || !maSV.trim().isEmpty()) {
				this.setMaSV(maSV);			}
			else {
				throw new IllegalAccessException("maSV khong duoc de trong");
			}
		}catch(IllegalAccessException i) {
			System.out.println(i.getMessage());
		}
		

		String tenSV = sc.nextLine();
		this.setTenSV(tenSV);

		double diemLT = sc.nextDouble();
		this.setDiemLT(diemLT);

		double diemTH = sc.nextDouble();
		this.setDiemTH(diemTH);
	}

	public void getData() {
		System.out.println(this.getMaSV());
		System.out.println(this.getTenSV());
		System.out.println(this.getDiemLT());
		System.out.println(this.getDiemTH());

	}

	@Override
	public String toString() {
		return "SVCNTT "+super.toString()+ datChuan();
	}
	
	
	
	

}
