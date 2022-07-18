package structuraldesignpattern.adpapter;

// client
public class TestAdapterPattern {
	public static void main(String[] args) {
		AdapterElectricityCustomer adapterElectricityCustomer = new AdapterElectricityCustomer();
		adapterElectricityCustomer.storeDiscomDetails();
		System.out.println(adapterElectricityCustomer.getConnectionDetails());
	}
}

