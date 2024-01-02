package de23528;

import java.util.Scanner;

public abstract class SinhVien {
	private String maSV;
	private String tenSV;
	private double diemLT;
	private double diemTH;

	public SinhVien() {
	}

	public SinhVien(String maSV, String tenSV, double diemLT, double diemTH) {
		try {
			if(maSV != null || !maSV.trim().isEmpty()) {
				this.maSV = maSV;
			}
			else {
				throw new IllegalAccessException("maSV khong duoc de trong");
			}
		}catch(IllegalAccessException i) {
			System.out.println(i.getMessage());
		}
		
		this.tenSV = tenSV;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public String getMaSV() {
		return maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;

	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}

	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "SinhVien maSV=" + maSV + ", tenSV=" + tenSV + ", diemLT=" + diemLT + ", diemTH=" + diemTH +" ";
	}

	public abstract boolean datChuan();

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

}
