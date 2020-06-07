package application;

import java.util.Scanner;

import entities.ContaBanco;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		System.out.print("Enter account holder: ");
		String name = t.nextLine();
		ContaBanco account = new ContaBanco(name); 
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = t.next().charAt(0);
		if(choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			account.deposit(t.nextDouble());
			System.out.println("");
			System.out.printf("Account data: %n%s%n", account);
			System.out.println("");
		} else {
			System.out.println("");
			System.out.printf("Account data: %n%s%n", account);
			System.out.println("");
		}
		
		System.out.print("Enter a deposit value: ");
		account.deposit(t.nextDouble());
		System.out.printf("Updated account data: %n%s%n", account);
		System.out.println("");
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(t.nextDouble());
		System.out.printf("Updated %n%s%n", account);
		
		
		t.close();
	}

}
