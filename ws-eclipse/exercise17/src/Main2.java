import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n = t.nextInt();
		int in = 0, out = 0;
		for (int i = 0; i < n; i++) {
			int num = t.nextInt();
			if(num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}
			
		}
		System.out.printf(in + " In%n" + out + " Out");
		t.close();
	}

}
