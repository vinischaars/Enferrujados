package enf.eventos.strategy;

import org.springframework.stereotype.Component;

@Component("GOLD")
public class MembroGold implements CalcularDesconto {

	public double percentualDesconto = 0.75;
	
	@Override
	public double calcularValorDesconto(double valor) {
		return valor * (1 - percentualDesconto); 
	}

}
