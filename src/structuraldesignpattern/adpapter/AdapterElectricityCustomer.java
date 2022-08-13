package structuraldesignpattern.adpapter;

public class AdapterElectricityCustomer extends SubDistributionCentre implements ElectricityConnectionDetails {

	@Override
	public void storeDiscomDetails() {
		setAddress("Vinay Na gar near Bhodapur");
		setName("Vinay Nagar Discom");
		setPhoneNumber("+91 9575643564");
		setPincode(474008);
	}

	@Override
	public String getConnectionDetails() {
		return "[ivrs: 1234353, customerName: test" + "discom: " + getName() + ",  " + getAddress();
	}
}