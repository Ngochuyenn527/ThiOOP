package de23774;

import java.util.Scanner;

public class TestSach {

	Scanner sc = new Scanner(System.in);

	public void nhap() {
		System.out.println("Nhap vao so sach muon them");
		int sls = sc.nextInt();
		QLSACHImpl qli = new QLSACHImpl();

		
		for(int i=0; i<sls; i++) {
			SACH s = new SACH();
			System.out.println("nhap thong tin tg");
			TACGIA tg = new TACGIA();
			String hoten = sc.nextLine();
			tg.setHoten(hoten);
			
			String gioitinh = sc.nextLine();
			tg.setGioitinh(gioitinh);
			
			String email = sc.nextLine();
			tg.setEmail(email);
			
			s.setTacgia(tg);
			
			System.out.println("Nhap thong tin cho sach");
			String ten = sc.nextLine();
			s.setTensach(ten);
			
			int id = sc.nextInt();
			s.setId(id);
			
			int sl = sc.nextInt();
			s.setSl(sl);
			
			
			int nxb = sc.nextInt();
			s.setNxb(nxb);
			
			double gia = sc.nextDouble();
			s.setGia(gia);
			
			qli.add(s);
		}
	}

	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		TestSach ts = new TestSach();
		QLSACHImpl qli = new QLSACHImpl();

		int n;
		do {
		System.out.println("CHUONG TRINH QUAN LY SACH");
		System.out.println("---------------------------");
		System.out.println("1.Nhap sach.\n"+ "2.Hien thi\n"+ "3.Them\n"+ "4.Sua\n"+ "5.Xoa\n"+ "6.Thoat\n");
		n = sc.nextInt();

		
		if(n==1) {
			ts.nhap();
		}
		else if(n==2) {
			qli.display();
		}
		}
		while(n != 6);
	}

}
