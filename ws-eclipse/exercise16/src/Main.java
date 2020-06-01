import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		int soma = 0;
		for(int i = 0; i < n; i++) {
			int x = t.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		t.close();
	}

}
