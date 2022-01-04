package creationaldesignpattern.factorymethodpattern.model;

public class Stats {

	private int centuries;
	private int matches;
	private int halfCenturies;

	public Stats(int centuries, int matches, int halfCenturies) {
		this.centuries = centuries;
		this.matches = matches;
		this.halfCenturies = halfCenturies;
	}

	public int getCenturies() {
		return centuries;
	}

	public int getMatches() {
		return matches;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	@Override
	public String toString() {
		return "[ matches = " + this.getMatches() + " centuries = " + this.getCenturies() + " halfcenturies = "
				+ this.getHalfCenturies() + " ]";
	}

}
