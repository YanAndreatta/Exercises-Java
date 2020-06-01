package exercise08;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod, quant;
		double tot;
		
		Scanner t = new Scanner(System.in);
		cod = t.nextInt();
		quant = t.nextInt();
		
		if(cod == 1) {
			double p1 = 4.00;
			tot = quant * p1;
			System.out.printf("Total: R$ %.2f%n",tot);
		} else if (cod == 2) {
			double p2 = 4.50;
			tot = quant * p2;
			System.out.printf("Total: R$ %.2f%n", tot);
		} else if (cod == 3 ) {
			double p3 = 5f;
			tot = quant * p3;
			System.out.printf("Total: R$ %.2f%n", tot);
		} else if (cod == 4) {
			double p4 = 2f;
			tot = quant * p4;
			System.out.printf("Total: R$ %.2f", tot);
		} else {
			double p5 = 1.5f;
			tot = quant * p5;
			System.out.printf("Total: R$ %.2f", tot);
		}
		t.close();
	}

}
