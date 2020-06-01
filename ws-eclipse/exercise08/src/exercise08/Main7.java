package exercise08;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;

		Scanner t = new Scanner(System.in);
		x = t.nextDouble();
		y = t.nextDouble();

		if (x == 0) {
			System.out.println("Eixo Y");
		}
		if (y == 0) {
			System.out.println("Eixo X");
		}

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		t.close();
	}

}
