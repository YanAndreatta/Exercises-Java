package application;


import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle1.setWidth(t.nextDouble());
		rectangle1.setHeight(t.nextDouble());
		
		System.out.printf("AREA = %.2f%n", rectangle1.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle1.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle1.diagonal());
		t.close();
		
		
	}

}
