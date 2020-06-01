package exercise07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner t = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = t.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");

		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		t.close();
	}
}