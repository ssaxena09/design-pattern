package structuraldesignpattern.decorator;

public class VegFood implements Food {
	@Override
	public void prepareFood() {
		System.out.println("prepare veg food ");
	}

	@Override
	public float totalPrice() {
		return 110f;
	}
}
