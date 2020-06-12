package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = t.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = t.next().charAt(0);
			System.out.print("Name: ");
			t.nextLine();
			String name = t.nextLine();
			System.out.print("Hours: ");
			int hours = t.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = t.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = t.nextDouble();
				//Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				//list.add(emp);
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
				//Employee emp = new Employee(name, hours, valuePerHour);
				//list.add(emp);
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		t.close();

	}

}
