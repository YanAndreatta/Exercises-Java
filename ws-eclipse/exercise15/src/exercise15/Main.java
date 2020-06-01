package exercise15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		Scanner t = new Scanner(System.in);
		
		while(x != 2002) {
			x = t.nextInt();
			if(x != 2002) {
			System.out.println("Senha Inválida");
			}
		}
		
		System.out.println("Acesso Permitido");
		t.close();
	}
}
