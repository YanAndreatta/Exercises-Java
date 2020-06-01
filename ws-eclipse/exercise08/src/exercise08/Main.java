package exercise08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		Scanner t = new Scanner(System.in);
		
		x = t.nextInt();
		
		if (x >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
			
			
		t.close();
	}
}
