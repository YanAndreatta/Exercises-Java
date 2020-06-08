package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int a, b, c;
		Scanner t = new Scanner(System.in);
		
		a = t.nextInt();
		b = t.nextInt();
		int[][] mat = new int[a][b];
		
		for (int i = 0; i < mat.length; i++) {  // i = 0; i < mat.length ( 3 ); i++
			for (int j = 0; j < mat[i].length; j++) { // i = 0; i < mat[0].length ( 4 ); i++
				mat[i][j] = t.nextInt();
			}
		}
		
		c = t.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 1; j < mat[i].length; j++) {
				if (mat[i][j] == c) {
					System.out.printf("Position: %d,%d%n",i , j);
					if(j > 0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);						
					}
					if(i > 0) {
						System.out.printf("Up: %d%n",mat[i-1][j]);
					}
					if(j < mat[i].length - 1) {
						System.out.printf("Right: %d%n", mat[i][j+1]);						
					}
					if (i < mat.length - 1) {
						System.out.printf("Down: %d%n", mat[i + 1][j]);						
					}
				}
			}
		}
		
		
		t.close();
	}

}
