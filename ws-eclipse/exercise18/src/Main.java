import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Maneira com gambiarra
		Scanner t = new Scanner(System.in);
		char resp = 's';
		while (resp != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = t.nextDouble();
			double f = 9f * c / 5f + 32f;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)");
			resp = t.next().charAt(0);
		}
		t.close();
		*/
		
		Scanner t = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = t.nextDouble();
			double f = 9f * c / 5f + 32f;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)");
			resp = t.next().charAt(0);
		} while (resp != 'n');
		
		t.close();
	}
	
}
