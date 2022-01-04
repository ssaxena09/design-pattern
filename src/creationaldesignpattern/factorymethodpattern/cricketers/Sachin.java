package creationaldesignpattern.factorymethodpattern.cricketers;

import creationaldesignpattern.factorymethodpattern.model.Stats;

public class Sachin implements Cricketer {
	@Override
	public Stats getStats() {
		return new Stats(100, 663, 170);
	}
}
