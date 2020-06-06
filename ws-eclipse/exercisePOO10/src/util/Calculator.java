package util;

public class Calculator {
	
	public static final double PI = 3.14159; // Constante
	
	public static double circumference(double radius) {
		return 2f * PI * radius; 
	}
	
	public static double volume(double radius) {
		return 4f * PI * Math.pow(radius, 3) / 3f;
	}
}
