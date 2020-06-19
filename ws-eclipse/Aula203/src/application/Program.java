package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<>(); // Mais r�pido mas n�o garante ordem.
		//Set<String> set = new TreeSet<>(); // Mais lento mas mantem os dados ordenados, neste caso por ordem alfab�tica.
		Set<String> set = new LinkedHashSet<>(); // intermedi�rio em quest�o de rapidez e mantem a ordem em que forem inseridos.
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
		//System.out.println(set.contains("Notebook")); // Se existe este elemento no conjunto.
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
