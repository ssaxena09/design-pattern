package creationaldesignpattern.factorymethodpattern.cricketers;

import creationaldesignpattern.factorymethodpattern.model.Stats;

public class Rohit implements Cricketer {
	@Override
	public Stats getStats() {
		return new Stats(55, 350, 80);
	}
}
