package application;

import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		Student stud = new Student();
		stud.setName(t.nextLine());
		stud.notes(t.nextDouble(), t.nextDouble(), t.nextDouble());
		
		System.out.printf("Final Grade = %.2f%n",stud.getNote());
		if (stud.getNote() < 60f) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points",stud.missingPoints());
		} else {
			System.out.println("Pass");
		}
		
		System.out.print("");
		
		t.close();
	}

}
