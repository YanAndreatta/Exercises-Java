package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("D:\\temp\\in.txt");
		Scanner t = null;
		try {
			t = new Scanner(file);
			while(t.hasNextLine()) {
				System.out.println(t.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (t != null) {
				t.close();				
			}
		}
	}

}
