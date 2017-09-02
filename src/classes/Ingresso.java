package classes;

import java.util.ArrayList;

public class Ingresso {

	private String tipo;
	private Double valor;
	
	public Ingresso() {
	}
	
	Ingresso(String tipo, Double valor){
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public ArrayList<Ingresso> criarIngressos(){
		ArrayList<Ingresso> ingressos = new ArrayList<>();
		
		ingressos.add(new Ingresso("VIP", new Double(1000)));		
		ingressos.add(new Ingresso("BACKSTAGE", new Double(800)));
		ingressos.add(new Ingresso("PLATEIA VIP", new Double(500)));
		ingressos.add(new Ingresso("PLATEIA", new Double(300)));
		
		return ingressos;
	}
	
}
