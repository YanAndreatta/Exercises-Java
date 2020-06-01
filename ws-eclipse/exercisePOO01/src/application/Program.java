package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = t.nextDouble();
		xB = t.nextDouble();
		xC = t.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = t.nextDouble();
		yB = t.nextDouble();
		yC = t.nextDouble();
		
		double p = (xA + xB + xC) / 2f;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2f;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		
		
		t.close();
	}

}
