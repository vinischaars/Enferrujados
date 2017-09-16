package objects;

import objects.Cliente;
import objects.Ingresso;
 
public class Desconto {
	
	public Integer Desconto (Cliente cliente, Ingresso ingresso) {
		return ingresso.getValorIngresso()*(cliente.percentualDesconto(cliente)/100);		
	}
	

}
