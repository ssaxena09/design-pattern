package creationaldesignpattern.builderpatter.nonveg;

import creationaldesignpattern.builderpatter.Item;

public abstract class NonVegItem implements Item {

	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}

	public float price() {
		return 199.99f;
	}
}
