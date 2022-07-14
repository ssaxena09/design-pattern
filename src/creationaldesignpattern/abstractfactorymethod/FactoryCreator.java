package creationaldesignpattern.abstractfactorymethod;

public class FactoryCreator  {
	FurnishedHomeFactory getFactory(String factoryType) {
		if("furniture".equalsIgnoreCase(factoryType)) {
			return new ConcreteFurnitureFactory();
		} else if ("electricalAppliance".equalsIgnoreCase(factoryType)) {
			return new ConcreteElectricalApplianceFactory();
		} else {
			throw new RuntimeException("fsdjfhsjghfjsg");
		}
	}
}
