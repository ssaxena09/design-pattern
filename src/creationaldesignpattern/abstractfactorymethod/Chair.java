package creationaldesignpattern.abstractfactorymethod;

public class Chair implements Furniture{
	@Override
	public String color() {
		return "black";
	}

	@Override
	public String type() {
		return "chair";
	}
}
