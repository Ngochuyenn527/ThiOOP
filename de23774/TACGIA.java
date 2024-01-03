package de23774;

public class TACGIA {
	private String hoten;
	private String gioitinh;
	private String email;

	public TACGIA() {
	}

	public TACGIA(String hoten, String gioitinh, String email) {
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.email = email;
	}

	public String getHoten() {
		return hoten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public String getEmail() {
		return email;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TACGIA [hoten=" + hoten + ", gioitinh=" + gioitinh + ", email=" + email + "]";
	}

}
