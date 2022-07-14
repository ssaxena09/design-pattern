package creationaldesignpattern.singletonpattern;

public class EagerSingletonClass {
	private  static EagerSingletonClass instance = new EagerSingletonClass();

	private EagerSingletonClass() {
	}

	static EagerSingletonClass  getInstance() {
		return instance;
	}

}
