package exercise08;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		
		Scanner t = new Scanner(System.in);
		a = t.nextInt();
		b = t.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println();
		}
		t.close();	
	}

}
