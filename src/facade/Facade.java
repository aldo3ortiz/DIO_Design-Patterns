package facade;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facade {
	
	public void migrarCliente(String name, String cep) {
				
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(name, cep, cidade, estado);
		
		
	}

}
