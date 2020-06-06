package application;

import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; //Padrão de nomes para constantes é tudo maiúsculo e dividido por _
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = t.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		t.close();
	}
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4f * PI * Math.pow(radius, 3)  / 3f;
	}
}
