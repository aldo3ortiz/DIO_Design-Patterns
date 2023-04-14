package strategy;

public class ComportamentoDefensivo implements Comportamento{

	//Here we have the implementation from the same strategy
	@Override
	public void mover() {
		System.out.println("Movendo-se defesivamente");
		
	}
}
