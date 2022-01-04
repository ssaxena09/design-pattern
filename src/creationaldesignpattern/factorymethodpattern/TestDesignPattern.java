package creationaldesignpattern.factorymethodpattern;

import creationaldesignpattern.factorymethodpattern.cricketers.Cricketer;

public class TestDesignPattern {

	public static void main(String[] args) {
		Cricketer sachin = CricketerFactory.getCricketer("Sachin");
		Cricketer virat = CricketerFactory.getCricketer("virat");
		System.out.println(sachin.getStats().toString());
		System.out.println(virat.getStats().toString());
	}
}
