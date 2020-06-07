package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		int n = t.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i < n; i++) {
			vect[i] = t.nextDouble();
		}
		
		double sum  = 0f;
		for(int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		t.close();
	}

}
