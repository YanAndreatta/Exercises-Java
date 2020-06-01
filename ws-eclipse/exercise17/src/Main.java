import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int x = t.nextInt();				
		
		for (int i = 1; i < x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);			
			}
		}
		
		
		t.close();
	}

}
