package creationaldesignpattern.builderpatter.veg;

import creationaldesignpattern.builderpatter.Item;

public abstract class VegItem implements Item {
	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}
}
