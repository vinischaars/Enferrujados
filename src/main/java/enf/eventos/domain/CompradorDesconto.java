package enf.eventos.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompradorDesconto {
	ESTUDANTE("ESTUDANTE"),
    IDOSO("IDOSO"),
    MEMBRO_GOLD("GOLD"),
    MEMBRO_SILVER("SILVER"),
    PUBLICO_GERAL("GERAL");

	private String comprador;
	
}
