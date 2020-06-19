package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoce("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner sc = new ConcreteScanner("2003");
		sc.processDoce("My Email");
		System.out.println("Scan result: " + sc.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoce("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}	

}
