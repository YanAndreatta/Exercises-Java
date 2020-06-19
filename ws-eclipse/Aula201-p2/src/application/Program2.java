package application;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		/* Number x = myNums.get(0); // erro de compli��o
		 * 
		 * N�o permite, pois n�o se pode acessar dados dentro da lista <? super Number> 
		 * A lista pode ser um SUPERTIPO de Number e n�o um Number.
		 * 
		 * 	CONTRAVARI�NCIA
		 * Podendo apenas 'jogar' os dados dentro da lista (put). 
		 * 
		 * get - ERROR
		 * 
		 * put - Ok
		*/ 

	}

}
