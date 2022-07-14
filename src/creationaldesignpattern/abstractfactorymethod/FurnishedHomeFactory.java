package creationaldesignpattern.abstractfactorymethod;


// abstract factory
public interface FurnishedHomeFactory {

	Furniture getFurniture(String type);
	ElectricalAppliance getAppliance(String type);
}
