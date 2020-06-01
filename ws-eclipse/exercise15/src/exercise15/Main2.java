package exercise15;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		int x = t.nextInt();
		int y = t.nextInt();
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
				
			} else if(x < 0 && y > 0) {
				System.out.println("Segundo");
				
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
				
			} else {
				System.out.println("Quarto");
				
			}
			x = t.nextInt();
			y = t.nextInt();
			
		}
		
		
		
		t.close();
	}

}
