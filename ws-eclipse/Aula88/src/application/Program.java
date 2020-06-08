package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t =new Scanner(System.in);
		
		int n = t.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			t.nextLine();
			String name = t.nextLine();
			double price = t.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0f;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		t.close();
	}

}
