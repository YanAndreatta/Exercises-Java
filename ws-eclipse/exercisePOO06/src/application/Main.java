package application;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		Employee employee1 = new Employee();
		System.out.print("Name: ");
		employee1.setName(t.nextLine());
		System.out.print("Gross salary: ");
		employee1.setGrossSalary(t.nextDouble());
		System.out.print("Tax: ");
		employee1.setTax(t.nextDouble());
		
		System.out.println("");
		System.out.println("Employee: " + employee1);
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		employee1.increaseSalary(t.nextDouble());
		
		System.out.printf("Updated data: " + employee1);
		
		t.close();
	}

}
