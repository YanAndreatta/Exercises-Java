package exercise08;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		Scanner t = new Scanner(System.in);
		x = t.nextInt();
		
		if (x%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		
		t.close();
		
	}

}
