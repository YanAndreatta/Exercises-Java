package exercise08;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, impost;
		
		Scanner t = new Scanner(System.in);
		salario = t.nextDouble();
		
		if(salario <= 2000.0) {
			impost = 0.0;
		} else if (salario <= 3000.0) {
			impost = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			impost = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			impost = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			
		}
		
		if (impost == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", impost);
		}
	}

}
