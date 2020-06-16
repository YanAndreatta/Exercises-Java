package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\temp\\in.txt";   //Caminho do arquivo.
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			/*
			 * Tamb�m pode ser feito desta maneira: br = new BufferedReader(new FileReader(path));
			 */
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}	
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}