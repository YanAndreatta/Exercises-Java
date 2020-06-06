package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = t.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amountValue = t.nextDouble(); 
		
		double payForIt = CurrencyConverter.dollarPrice(dollarPrice, amountValue);
		
		System.out.printf("Amount to be paid in reais = %.2f", payForIt);
		
		
		t.close();
	}

}
