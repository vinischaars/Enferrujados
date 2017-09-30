package objects;

import java.util.Date;

public class Evento {

	private String nome;
	private Date data;
	private Date dataVendaInicio;
	private Date dataVendaFim;
	private String tipoIngressoValido;

	public final Integer NUMERO_MAXIMO_CARACTERES_EVENTO = 150;
	public final String MENSAGEM_ERRO_VALIDACAO_USUARIO = "O nome permite no maximo 150 caracteres";
	public final String MENSAGEM_DATA_NAO_PERMITIDA = "A data do evento deve ser igual ou maior que a de hoje";
	public final String MENSAGEM_PERIODO_NAO_PERMITIDO = "A data de inicio de venda deve ser inferior a data de fim";	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String evento) {
		this.nome = evento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getDataVendaInicio() {
		return dataVendaInicio;
	}
	public void setDataVendaInicio(Date dataVendaInicio) {
		this.dataVendaInicio = dataVendaInicio;
	}
	public Date getDataVendaFim() {
		return dataVendaFim;
	}
	public void setDataVendaFim(Date dataVendaFim) {
		this.dataVendaFim = dataVendaFim;
	}
	public String getTipoIngressoValido() {
		return tipoIngressoValido;
	}
	public void setTipoIngressoValido(String tipoIngressoValido) {
		this.tipoIngressoValido = tipoIngressoValido;
	}


	public void validaTamanhoNome (Evento evento) throws Exception{
		if(evento.getNome().length() > NUMERO_MAXIMO_CARACTERES_EVENTO){
			throw new Exception(MENSAGEM_ERRO_VALIDACAO_USUARIO);
		}
	}

	public void validaDataEvento (Evento evento) throws Exception{

		if(evento.getData().before(new Date())){
			throw new Exception(MENSAGEM_DATA_NAO_PERMITIDA);
		}
	}

	public void validaPeriodoEvento (Evento evento) throws Exception{

		if(evento.getDataVendaFim().before(evento.getDataVendaInicio())){
			throw new Exception(MENSAGEM_PERIODO_NAO_PERMITIDO);
		}
	}
	
}
