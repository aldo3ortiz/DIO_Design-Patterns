package singleton;


/**
 * Singleton lazy
 * Singleton lazy is that kind of class that call itself, not giving out any instance to the user
 * @author Andre
 *
 */
public class SingletonLazy {

	
	private static SingletonLazy instancia;
	
	// A private constructor is the key to make sure no one will instantiate this class
	private SingletonLazy() {
		super();
	}
	
	// This method assures we have access to this class. It give public access.
	public static SingletonLazy getInstancia() {
		
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
		
	}
	
	
	
}
