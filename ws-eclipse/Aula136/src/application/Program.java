package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner t = null;

		try {
			t = new Scanner(file);
			while (t.hasNextLine()) {
				System.out.println(t.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally {
			if (t != null) {
				t.close();
			}
			System.out.println("Finally block executed");
		}
	}

}
