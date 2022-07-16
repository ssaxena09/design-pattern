package creationaldesignpattern.builderpatter.roti;

import creationaldesignpattern.builderpatter.Item;

public abstract class Roti implements Item {
	@Override
	public String name() {
		return this.getClass().getSimpleName();
	}
}
