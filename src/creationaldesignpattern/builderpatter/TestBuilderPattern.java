package creationaldesignpattern.builderpatter;

import java.io.IOException;

public class TestBuilderPattern {
	public static void main(String[] args) throws IOException {
		MealBuilder mb = new MealBuilder();

		mb.orderItems();

	}
}
