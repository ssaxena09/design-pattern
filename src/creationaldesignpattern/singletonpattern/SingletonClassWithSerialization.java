package creationaldesignpattern.singletonpattern;

import java.io.Serializable;

public class SingletonClassWithSerialization implements Serializable {

	private static SingletonClassWithSerialization instance;

	private SingletonClassWithSerialization() {
	}

	static SingletonClassWithSerialization getInstance() {
		if (instance == null) {
			synchronized (SingletonClassWithSerialization.class) {
				if (instance == null) {
					instance = new SingletonClassWithSerialization();
				}
			}

		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

}
