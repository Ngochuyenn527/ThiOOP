package de23774;

import java.util.ArrayList;

public class QLSACHImpl implements QLSACH {
	ArrayList<SACH> list = new ArrayList<SACH>();

	@Override
	public boolean display() throws Exception {
		try {
			if(!this.list.isEmpty()) {
				for (SACH sach : list) {
					System.out.println(sach);
				}
				return true;
			}
			else {
				throw new Exception("0 hien thi duoc");
			}
		
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		return false;
	}

	@Override
	public boolean add(SACH s) throws NullPointerException {
		boolean find = false;
		try {
			for (SACH sach : list) {
				if (sach.getId() == s.getId()) {
					find = true;
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (find)
			return false;
		else {
			this.list.add(s);
			return true;
		}
	}

	@Override
	public boolean del(SACH s) throws NullPointerException {
		try {
			for (SACH sach : list) {
				if (sach.getId() == s.getId()) {
					this.list.remove(sach);
					return true;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean edit(int id) throws NullPointerException {
		try {
			for (SACH sach : list) {
				if (sach.getId() == id) {
					this.list.remove(sach);
					System.out.println("Tim thay thong tin co id trung voi id can tim. Nhap thong tin muon sua");
					return true;

				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

}
