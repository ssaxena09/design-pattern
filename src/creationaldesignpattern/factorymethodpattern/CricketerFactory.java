package creationaldesignpattern.factorymethodpattern;

import creationaldesignpattern.factorymethodpattern.cricketers.Cricketer;
import creationaldesignpattern.factorymethodpattern.cricketers.Rohit;
import creationaldesignpattern.factorymethodpattern.cricketers.Sachin;
import creationaldesignpattern.factorymethodpattern.cricketers.Virat;

public class CricketerFactory {
	public static Cricketer getCricketer(String name) {
		switch (name.toUpperCase()) {
		case "SACHIN":
			return new Sachin();
		case "VIRAT":
			return new Virat();
		case "ROHIT":
			return new Rohit();
		default:
			throw new IllegalArgumentException("Unkown Player");
		}

	}
}
