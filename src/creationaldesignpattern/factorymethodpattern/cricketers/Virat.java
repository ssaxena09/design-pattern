package creationaldesignpattern.factorymethodpattern.cricketers;

import creationaldesignpattern.factorymethodpattern.model.Stats;

public class Virat implements Cricketer {

	@Override
	public Stats getStats() {
		return new Stats(70, 400, 95);
	}
}
