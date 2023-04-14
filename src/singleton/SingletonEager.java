package singleton;


/**
 * Singleton eager
 * Different than the lazy one the instance is create when it is called
 * @author Andre
 *
 */
public class SingletonEager {
	

	// The instance is create right away when it is called
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();		
	}
	
	public static SingletonEager getInstancia() {		
		return instancia;
		
	}
}
