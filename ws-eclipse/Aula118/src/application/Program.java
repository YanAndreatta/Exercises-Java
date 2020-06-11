package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner t = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	
		System.out.print("Enter Cliente data:");
		System.out.print("Name: ");
		String clientName = t.nextLine();
		System.out.print("Email: ");
		String email = t.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDay = sdf.parse(t.next());
		System.out.print("Enter order data:");
		System.out.printf("Status: ");
		String status = t.nextLine();
		System.out.print("How many items to this order? ");
		int n = t.nextInt();
		
		Order order1 = new Order(sdf(), OrderStatus.valueOf(status), new Client(clientName, email, birthDay));
		
		for(int i = 0; i < n; i++) {
			
		}
		
		
		
		t.close();
		
	}
	
	/*public static Date sdf() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date x1 = new Date(System.currentTimeMillis());
		Date x2 = Date.from(Instant.parse(sdf.format(x1)));
		return x2;
	}*/

}
