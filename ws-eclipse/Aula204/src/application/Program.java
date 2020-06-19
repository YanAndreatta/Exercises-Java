package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook", 1200.00));
		set.add(new Product("Tablet", 400.00));
		
		Product prod = new Product("Notebook", 1200.00); 
		/* Retorna false, mesmo sendo igual ao valor adicionado ao conjunto; 
		 * Pois a classe Product não implementa hascod e equals. 
		 * Então ele usa a referencia de ponteiros para comprar, comparando as referências em memória.
		 */
		System.out.println(set.contains(prod));
		
		/*
		 * Feita a implementação do HashCode e Equals na Classe Product,
		 * o contains passa a retornar True, pois agora ele compara por conteúdo e 
		 * não mais por referência em memória.
		 * 
		 */
	}

}
