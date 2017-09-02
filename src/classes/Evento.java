package classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Evento {

	private String nome;
	private Date data;

	public final Integer NUMERO_MAXIMO_CARACTERES_EVENTO = 150;
	public final String MENSAGEM_ERRO_VALIDACAO_USUARIO = "O nome permite no máximo 150 caracteres";
	public final String MENSAGEM_DATA_NÃO_PERMITIDA = "A data do evento deve ser igual ou maior que a de hoje";
	
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

	public void validaTamanhoNome (Evento evento) throws Exception{
		if(evento.getNome().length() > NUMERO_MAXIMO_CARACTERES_EVENTO){
			throw new Exception(MENSAGEM_ERRO_VALIDACAO_USUARIO);
		}
	}

	public void validaDataEvento (Evento evento) throws Exception{

		if(evento.getData().before(new Date())){
			throw new Exception(MENSAGEM_DATA_NÃO_PERMITIDA);
		}
	}
	
}
