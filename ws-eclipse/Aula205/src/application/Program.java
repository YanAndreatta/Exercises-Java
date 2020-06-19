package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		/*
		 * Quando usando o TreeSet tem que implementar o Comparable<>
		 * para que o TreeSet ordene as coisas.
		 * 
		 */
		
		set.add(new Product("Tv", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
