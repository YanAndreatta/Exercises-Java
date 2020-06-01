package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = t.nextLine();
		System.out.print("Price: ");
		product.price = t.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = t.nextInt();
		
		System.out.println();
		System.out.println("Product data:" + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = t.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = t.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		//System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		
		t.close();
	}

}
