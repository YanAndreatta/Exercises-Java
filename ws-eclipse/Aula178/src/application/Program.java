package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "D:\\temp\\in.txt";   //Caminho do arquivo.
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			/*
			 * Tamb�m pode ser feito desta maneira: br = new BufferedReader(new FileReader(path));
			 */
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}	
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}	
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}