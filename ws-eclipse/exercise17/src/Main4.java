import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		for (int i = 0; i < n; i++) {
			double num1 = t.nextDouble();
			double num2 = t.nextDouble();
			if(num2 == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = num1 / num2;
				System.out.println(div);
			}
			
		}
		
		t.close();
	}

}
