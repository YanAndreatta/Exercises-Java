package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>(); // Mais r�pido de todos. N�o importa a ordem de usu�rios de entrada de usu�rios.
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntry(username, moment)); // Se algum LogEntry tentar entrar neste SET e seja repedida ela n entrar�;
				
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		} 
		catch (FileNotFoundException e) {
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
		
		sc.close();
		
	}

}
