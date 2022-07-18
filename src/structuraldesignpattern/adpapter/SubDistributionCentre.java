package structuraldesignpattern.adpapter;

//Adaptee class: This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use
public class SubDistributionCentre {

	public void setName(String name) {
		this.name = name;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String name;
	private Integer pincode;
	private String address;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public Integer getPincode() {
		return pincode;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
