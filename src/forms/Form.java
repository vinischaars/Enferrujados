package forms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.Evento;

public class Form {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Evento evento = new Evento();
		String dataEvento;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe o nome do evento");
		System.out.println("Informe a data do evento");
		try{
			evento.setNome(scn.nextLine());
			evento.validaTamanhoNome(evento);
			dataEvento = scn.nextLine();
			evento.setData(df.parse(dataEvento));
			evento.validaDataEvento(evento);
			System.out.println(evento.getNome());
			System.out.println(evento.getData());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
