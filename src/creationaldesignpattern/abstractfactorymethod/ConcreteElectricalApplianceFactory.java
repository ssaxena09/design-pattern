package creationaldesignpattern.abstractfactorymethod;

public class ConcreteElectricalApplianceFactory implements FurnishedHomeFactory {

	@Override
	public Furniture getFurniture(String type) {
		return null;
	}

	@Override
	public ElectricalAppliance getAppliance(String type) {
		if (type.equalsIgnoreCase("microwave")) {
			return new Microwave();
		} else if (type.equalsIgnoreCase("fridge")) {
			return new Fridge();
		} else {
			throw new RuntimeException(";kfhg");
		}
	}
}
