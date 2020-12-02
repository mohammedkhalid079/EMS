package Thantrick;

public class Client {
	private String name;
	private String dob;
	private Address address;

	public Client(String name, String dob, Address address) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", dob=" + dob + ", address=" + address + "]";
	}
	
}
