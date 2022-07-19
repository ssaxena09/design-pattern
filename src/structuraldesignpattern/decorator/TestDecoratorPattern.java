package structuraldesignpattern.decorator;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		Food nonVegFood = new NonVegFood(new VegFood());
		nonVegFood.prepareFood();
		System.out.println(nonVegFood.totalPrice());
	}
}
