import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		
		int n = t.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double a = t.nextDouble();
			double b = t.nextDouble();
			double c = t.nextDouble();
			
			double media = (a * 2f + b * 3f + c * 5f) / 10f;
			
			System.out.printf("%.1f%n", media);
		}
		
		t.close();
	}

}
