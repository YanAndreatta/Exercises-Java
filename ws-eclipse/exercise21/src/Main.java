import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = t.nextInt();
		int b = t.nextInt();
		int c = t.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
		/*if (a > b && a > c) {
			System.out.println("higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}
		*/
		t.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x >z) {
			aux = x;
		} else if(y > z){
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
