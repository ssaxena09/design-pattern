package creationaldesignpattern.prototype;

public class TestPrototype {
	public static void main(String[] args) {
		Prototype e11 = new Employee1("shyam", 37);
		Prototype e12 = new Employee1("ram", 45);
		Prototype e1Clone = e11.clone();
		Prototype e12Clone = e12.clone();

		System.out.println(e11.hashCode() + "--------------------->" + e1Clone.hashCode());
		System.out.println(e12.hashCode() + "--------------------->" + e12Clone.hashCode());
	}
}
