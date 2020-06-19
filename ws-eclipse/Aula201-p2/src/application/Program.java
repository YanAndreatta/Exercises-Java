package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		/*list.add(20);  N�o permite, pois n�o se pode colocar dados dentro da lista <?> 
		 * 
		 * 	COVARI�NCIA.
		 * Podendo apenas 'ler' os dados dentro da lista (get). 
		 * 
		 * get - Ok
		 * 
		 * put - ERROR
		*/ 
		
		
	}

}
