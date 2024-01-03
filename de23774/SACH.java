package de23774;

public class SACH {
	private String tensach;
	private int id;
	private TACGIA tacgia;
	private int sl;
	private int nxb;
	private double gia;
	
	public SACH() {
	}

	public SACH(String tensach, int id, TACGIA tacgia, int sl, int nxb, double gia) {
		this.tensach = tensach;
		this.id = id;
		this.tacgia = tacgia;
		this.sl = sl;
		this.nxb = nxb;
		this.gia = gia;
	}

	public String getTensach() {
		return tensach;
	}

	public int getId() {
		return id;
	}

	public TACGIA getTacgia() {
		return tacgia;
	}

	public int getSl() {
		return sl;
	}

	public int getNxb() {
		return nxb;
	}

	public double getGia() {
		return gia;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTacgia(TACGIA tacgia) {
		this.tacgia = tacgia;
	}

	public void setSl(int sl) {
		this.sl = sl;
	}

	public void setNxb(int nxb) {
		this.nxb = nxb;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "SACH [tensach=" + tensach + ", id=" + id + ", tacgia=" + tacgia + ", sl=" + sl + ", nxb=" + nxb
				+ ", gia=" + gia + "]";
	}
	
	

	
	

}
