package objects;

import objects.Cliente;
import objects.Ingresso;
 
public class Desconto {
	
	public Integer calcularDesconto (Cliente cliente, Ingresso ingresso) {
		System.out.println(ingresso.getValorIngresso());
		System.out.println(cliente.percentualDesconto(cliente));
		return ingresso.getValorIngresso()*(cliente.percentualDesconto(cliente)/100);
		
	}
	

}
