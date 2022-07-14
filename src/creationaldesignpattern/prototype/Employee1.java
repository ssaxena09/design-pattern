package creationaldesignpattern.prototype;

public class Employee1 implements Prototype {

	private final String name;
	private final int age;

	Employee1(String name, int age) {
		this.age = age;
		this.name = name;
	}

	Employee1(Employee1 target) {
		this.age = target.age;
		this.name = target.name;
	}

	@Override
	public Prototype clone() {
		return new Employee1(this);
	}
}
