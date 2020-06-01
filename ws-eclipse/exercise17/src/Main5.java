import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			num *= i;
			
		}
		System.out.println(num);
		
		t.close();
	}

}
