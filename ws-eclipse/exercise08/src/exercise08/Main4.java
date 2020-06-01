package exercise08;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hi, hf, duracao;
		
		Scanner t = new Scanner(System.in);
		
		hi = t.nextInt();
		hf = t.nextInt();
		if (hi < hf) {
			duracao =  hf - hi;
		} else {
			duracao = 24 - hi + hf;
		}
			
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		
		t.close();
	}

}
