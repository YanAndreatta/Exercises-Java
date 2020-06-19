package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		/*
		 * 
		 * Map<Key, Value> votes = new...
		 * 
		 * A Key quando chamada, por exemplo: votes.get(KEY) ela retornará o que foi associado com ela em Value.
		 * 
		 * Map<String, Integer> votes = new LinkedHashMap<>();
		 * 		Key     Value
		 * 
		 * votes.put("Maria", "31");
		 * votes.get(maria)    ------> isto retornará: 31, Pois a Key "Maria" está associado com 31. 
		 */
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if(votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {

					votes.put(name, count);
				}
			
				line = br.readLine();	
				
			}
			
			for (String key : votes.keySet()) { // votes.keySet() transforma a Key do Map em um Set<K>. Podendo assim pegar o valor da Key.
				System.out.println(key + ": " + votes.get(key)); // A KEY RETORNA O VALOR ASSOCIADO À ELA.
			}
			
			
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		
		
		sc.close();
	}

}
