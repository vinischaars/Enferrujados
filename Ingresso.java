package classes;

public class Ingresso {
	
	private String tipoIngresso;
	private Integer valorIngresso;
	
	public final Integer VIP = 1000;
	public final Integer BACKSTAGE = 800;
	public final Integer PLATEIAVIP = 500;
	public final Integer PLATEIA = 300;
	
	
	public String getTipoIngresso() {
		return tipoIngresso;
	}
	public void setTipoimgresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	public Integer getValorIngresso() {
		return valorIngresso;
	}
	public void setValorIngresso(Integer valorIngresso) {
		this.valorIngresso = valorIngresso;
	}
	
	public Integer valorIngresso (Ingresso ingresso) {
		if(ingresso.getTipoIngresso().equals("VIP")){			
			return VIP;
		}
		if(ingresso.getTipoIngresso().equals("BACKSTAGE")){			
			return BACKSTAGE;
		}
		if(ingresso.getTipoIngresso().equals("PLATEIAVIP")){			
			return PLATEIAVIP;
		}
		if(ingresso.getTipoIngresso().equals("PLATEIA")){			
			return PLATEIA;
		}	
		
		return 0;
	}
	
}
