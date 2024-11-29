package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.nextLine().toUpperCase().charAt(0);
		while(bill.gender != 'F' && bill.gender != 'M') {
			System.out.print("Sexo: ");
			bill.gender = sc.nextLine().toUpperCase().charAt(0);
		}
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		double cover = bill.cover();
		double consumo = bill.feeding();
		double ticket = bill.ticket();
		double total = bill.total();
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n", consumo);
		if(consumo >= 30.0) {
			System.out.println("Insento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", cover);
		}
	
		System.out.printf("Ingresso = R$ %.2f%n", ticket);
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		
		sc.close();

	}

}
