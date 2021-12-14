package aplicacao;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;
import model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
		 System.out.print("Entre com o número do quarto ");
		 int numero = sc.nextInt();
		 System.out.print("data checkin (dd/MM/yyyy)");
		 Date checkin  = sdf.parse(sc.next());
		 System.out.print("data checkout (dd/MM/yyyy)");
		 Date checkout = sdf.parse(sc.next());
		 
		 Reserva reserva = new Reserva(numero, checkin, checkout);
		 System.out.println("Reserva: " + reserva);
		 
		 System.out.println();
		 System.out.println("Entre com atualização ");		
		 System.out.print("data checkin (dd/MM/yyyy)");
		 checkin  = sdf.parse(sc.next());
		 System.out.print("data checkout (dd/MM/yyyy)");
		 checkout = sdf.parse(sc.next());
		 
		 reserva.updateDates(checkin, checkout);
		 System.out.println("Reserva " + reserva);
		 
		 
		}
		catch (ParseException e) {
			System.out.println("Digitado data inválida! ");
		}
		catch (DomainException e) {
			System.out.println("xxx: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("erro inesperado!");
		}
	
		sc.close();
	}
}
