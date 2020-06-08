
package application;

import java.util.Scanner;

import entities.Rooms;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);

		Rooms[] r = new Rooms[9];
		System.out.print("How many rooms will be rented? ");
		int nrented = t.nextInt();
		for (int i = 0; i < nrented; i++) {
			System.out.printf("Rent #%d%n", i + 1);
			System.out.print("Name: ");
			t.nextLine();
			String name = t.nextLine();
			System.out.print("Email: ");
			String email = t.nextLine();
			System.out.print("Room: ");
			int positionr = t.nextInt();
			System.out.println();
			r[positionr] = new Rooms(name, email);
		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.printf("%d: %s%n", i, r[i]);
				// System.out.printf("%d: %s %s",i , r[i].getName(), r[i].getEmail());
			}
		}

		t.close();
	}

}
