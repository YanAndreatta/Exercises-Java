package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = t.nextInt();
		System.out.print("Holder: ");
		String name = t.nextLine();
		t.nextLine();
		System.out.print("Initial balance: ");
		double initialB = t.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawL = t.nextDouble();

		Account acc = new Account(number, name, initialB, withdrawL);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amountW = t.nextDouble();

			acc.withdraw(amountW);
			System.out.print(acc); 

		} 
		catch (DomainException e) {
			System.out.println(e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid caractere!");
		} 
		catch (RuntimeException e){
			System.out.println("Unexpected error ");
			e.printStackTrace();
		}

		t.close();
	}

}
