package singleton;

/**
 * Singleton Lazy holder
 * It encapsulate the instance in a static intern class called holder. it creates a class inside the Singleton class
 * @author Andre
 *
 */

public class SingletonLazyHolder {

	private static class InstanciaHolder {
		// the inner class inside the 'holder' class
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanciaHolder.instancia;

	}

}
