package application;

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Driver {
	public static void main(String[] args) {

		///////////////////////////////////////////////////// SINGLETON

		System.out.println("SINGLETON ***********************************");
		System.out.println();

		//we cannot instantiate an object from it. We call the class itself
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);

		///////////////////////////////////////////////////// STRATEGY

		System.out.println();
		System.out.println("STRATEGY ***********************************");
		System.out.println();

		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();

		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();

		///////////////////////////////////////////////////// FACADE

		System.out.println();
		System.out.println("FACADE ***********************************");
		System.out.println();
		
		Facade facade = new Facade();
		facade.migrarCliente("andre", "123");

	}

}
