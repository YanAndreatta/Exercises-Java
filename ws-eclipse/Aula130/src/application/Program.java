package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.FisicalPerson;
import entities.LegalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = t.nextInt();
		List<Person> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company? (i/c)? ");
			char ch = t.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				t.nextLine();
				String name = t.nextLine();
				System.out.print("Annual income: ");
				double annualIncome = t.nextDouble();
				System.out.print("Health expenditures: ");
				double healthSpending = t.nextDouble();

				list.add(new FisicalPerson(name, annualIncome, healthSpending));

			} else if (ch == 'c') {
				System.out.print("Name: ");
				t.nextLine();
				String name = t.nextLine();
				System.out.print("Annual income: ");
				double annualIncome = t.nextDouble();
				System.out.print("Number of employee: ");
				int numberOfEmployee = t.nextInt();

				list.add(new LegalPerson(name, annualIncome, numberOfEmployee));

			}

		}
		
		System.out.println();
		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for (Person person : list) {
			double tax = person.tax();
			System.out.println(person.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.print(String.format("TOTAL TAXES: $ %.2f", sum));
		t.close();

	}

}
