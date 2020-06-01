package exercise15;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		int x = t.nextInt();
		int alc = 0, gas = 0, die = 0;
		while(x != 4) {			
			if (x == 1) {
				alc++;
			} else if(x == 2) {
				gas++;
			} else if(x == 3) {
				die++;
			} else {
				System.out.println("Código inválido");
			}
			x = t.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO%n Alcool:%d%n Gasolina:%d%n Diesel:%d", alc, gas, die);
		
		t.close();
	}

}
