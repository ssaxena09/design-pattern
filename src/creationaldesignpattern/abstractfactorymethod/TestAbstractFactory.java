package creationaldesignpattern.abstractfactorymethod;

public class TestAbstractFactory {

	public static void main(String[] args) {
		FactoryCreator fc = new FactoryCreator();
		FurnishedHomeFactory homeFactory = fc.getFactory("furniture");
		Furniture furniture = homeFactory.getFurniture("bed");
		System.out.println(furniture.type() + furniture.color());

		FurnishedHomeFactory homeFactory1 = fc.getFactory("electricalAppliance");

		ElectricalAppliance ec = homeFactory1.getAppliance("fridge");
		System.out.println(ec.power());
	}
}
