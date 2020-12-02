package Thantrick;

public class Address {
	private String doorNo;
	private String area;
	private String landMark;
	private String city;
	private int pincode;
	private String state;
	private String country;

	public Address(String doorNo, String area, String landMark, String city,int pincode, String state, String country) {
		super();
		this.doorNo = doorNo;
		this.area = area;
		this.landMark = landMark;
		this.city = city;
		this.pincode=pincode;
		this.state = state;
		this.country = country;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", area=" + area + ", landMark=" + landMark + ", city=" + city + ", state="
				+ state + "]";
	}

}
