package creationaldesignpattern.singletonpattern;

public class LazySingletonClass {

	private static LazySingletonClass instance;

	private LazySingletonClass() {
	}

	static LazySingletonClass getInstance() {
		if (instance == null) {
			instance = new LazySingletonClass();
		}
		return instance;
	}

	static synchronized LazySingletonClass getInstanceWithLock() {
		if (instance == null) {
			instance = new LazySingletonClass();
		}
		return instance;
	}

	static LazySingletonClass getInstanceWithDoubleCheckLocking() {
		if (instance == null) {
			synchronized (LazySingletonClass.class) {
				if (instance == null) {
					instance = new LazySingletonClass();
				}
			}

		}
		return instance;
	}
}
