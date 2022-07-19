package structuraldesignpattern.decorator;

public abstract class FoodDecorator implements Food {
	protected Food newFood;

	FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public void prepareFood() {
		newFood.prepareFood();
	}

	@Override
	public float totalPrice() {
		return newFood.totalPrice();
	}
}
