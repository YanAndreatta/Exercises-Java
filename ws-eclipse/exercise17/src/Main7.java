import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print((int)Math.pow(i, 2) + " ");
			System.out.println((int)Math.pow(i, 3)+ " ");
		}
		
		t.close();
	}

}
