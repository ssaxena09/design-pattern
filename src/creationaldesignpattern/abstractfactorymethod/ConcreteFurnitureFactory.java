package creationaldesignpattern.abstractfactorymethod;

public class ConcreteFurnitureFactory implements FurnishedHomeFactory {
	public Furniture getFurniture(String type) {
		if ("bed".equalsIgnoreCase(type)) {
			return new Bed();
		} else if ("chair".equalsIgnoreCase(type)) {
			return new Chair();
		} else {
			throw new RuntimeException("fsjghdf");
		}
	}

	@Override
	public ElectricalAppliance getAppliance(String type) {
		return null;
	}
}
