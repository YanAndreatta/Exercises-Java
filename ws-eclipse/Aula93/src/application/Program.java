package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n_employees = t.nextInt();

		for (int i = 0; i < n_employees; i++) {
			System.out.printf("Employee #%d%n", i + 1);
			System.out.print("Id: ");
			int id = t.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = t.nextInt();
			}
			System.out.print("Name: ");
			t.nextLine();
			String name = t.nextLine();
			System.out.print("Salary: ");
			double salary = t.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println("");
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = t.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.print("This id does not exist!");
			System.out.println("");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = t.nextDouble();
			emp.IncreaseSalary(percentage);
		}
		
		System.out.println("");
		System.out.println("List of employees:");
		for (Employee x : list) {
			System.out.println(x);
		}

		t.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
