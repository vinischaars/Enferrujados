package enf.eventos.strategy;

import org.springframework.stereotype.Component;

@Component("SILVER")
public class MembroSilver implements CalcularDesconto {

	private static final double percentualDesconto = 0.6; 
	
	@Override
	public double calcularValorDesconto(double valor) {
		return valor * (1 - percentualDesconto);
	}

}
