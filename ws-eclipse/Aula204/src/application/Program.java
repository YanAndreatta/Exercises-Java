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
		 * Pois a classe Product n�o implementa hascod e equals. 
		 * Ent�o ele usa a referencia de ponteiros para comprar, comparando as refer�ncias em mem�ria.
		 */
		System.out.println(set.contains(prod));
		
		/*
		 * Feita a implementa��o do HashCode e Equals na Classe Product,
		 * o contains passa a retornar True, pois agora ele compara por conte�do e 
		 * n�o mais por refer�ncia em mem�ria.
		 * 
		 */
	}

}
