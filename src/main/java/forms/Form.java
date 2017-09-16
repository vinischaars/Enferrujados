package forms;

import java.text.DateFormat;
import javax.swing.JOptionPane;

import objects.Evento;
import objects.Ingresso;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Form {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Evento evento = new Evento();		
		Ingresso ingresso = new Ingresso();		
		String dataEvento;
		String nome;
		String data;		
		Scanner scn = new Scanner(System.in);
		
		try{
			nome = JOptionPane.showInputDialog(null, "Digite o nome do evento: ","Nome do Evento", JOptionPane.PLAIN_MESSAGE);
			evento.setNome(nome);
			evento.validaTamanhoNome(evento);		
			String retorno = JOptionPane.showInputDialog(null, "Digite a data do Evento: ","Data do Evento",JOptionPane.PLAIN_MESSAGE);
			evento.setData(df.parse(retorno));
			evento.validaDataEvento(evento);

			String tipoIngresso = JOptionPane.showInputDialog(null, "Digite o tipo do ingresso: ","Tipo Ingresso",JOptionPane.PLAIN_MESSAGE);
			ingresso.setTipoIngresso(tipoIngresso);
		
			JOptionPane.showMessageDialog(null, evento.getNome(), "Nome do Evento", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, evento.getData(), "Data do Evento", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, ingresso.getTipoIngresso(), "Tipo do Ingresso", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, ingresso.valorIngresso(ingresso), "Valor do Ingresso", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
