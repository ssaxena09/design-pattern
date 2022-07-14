package creationaldesignpattern.abstractfactorymethod;

public class Bed implements Furniture{
	@Override
	public String color() {
		return "white";
	}

	@Override
	public String type() {
		return "Bed";
	}
}
