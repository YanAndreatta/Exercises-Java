import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner t = new Scanner(System.in);
		
		int x = t.nextInt();
		int soma = 0;
		while(x != 0) {
			soma += x;
			x = t.nextInt();
			
		}
		
		System.out.println(soma);
		t.close();
	}

}
