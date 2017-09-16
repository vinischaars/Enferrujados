package objects;

public class Cliente {
	
	private String tipoCliente;
	public final Integer ESTUDANTE = 50;
	public final Integer IDOSO = 50;
	public final Integer SILVER = 60;
	public final Integer GOLD = 75;

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public Integer percentualDesconto (Cliente cliente) {
		if(cliente.getTipoCliente().equals("ESTUDANTE")){			
			return ESTUDANTE;
		}
		if(cliente.getTipoCliente().equals("IDOSO")){			
			return IDOSO;
		}
		if(cliente.getTipoCliente().equals("SILVER")){			
			return SILVER;
		}
		if(cliente.getTipoCliente().equals("GOLD")){			
			return GOLD;
		}
		return 0;
	}


}
