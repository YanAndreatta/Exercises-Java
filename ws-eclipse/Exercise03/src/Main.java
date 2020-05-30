import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		/*String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		
		sc.close();
		*/
		
		/*
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		 */
		  
		/*
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();
		 */
		
		/*
		char x;
		x =sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();
		*/
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: " + "\n"+ x + "\n"+  y + "\n" + z);
		
		sc.close();
		
	}
}
