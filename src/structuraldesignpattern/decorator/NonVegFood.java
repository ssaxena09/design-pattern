package structuraldesignpattern.decorator;

public class NonVegFood extends FoodDecorator {
	NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public void prepareFood() {
		super.prepareFood();
		preapreSomething();

	}

	private void preapreSomething() {
		System.out.println("prepare someting shjhfjdhfkjdh");
	}

	@Override
	public float totalPrice() {
		return super.totalPrice() + 100f;
	}

}
