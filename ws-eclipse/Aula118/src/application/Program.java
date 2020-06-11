package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner t = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.print("Enter Cliente data:");
		System.out.println();
		System.out.print("Name: ");
		String clientName = t.nextLine();
		System.out.print("Email: ");
		String email = t.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDay = sdf.parse(t.next());
		
		Client client = new Client(clientName, email, birthDay);
		
		System.out.print("Enter order data:");
		System.out.println();
		System.out.printf("Status: ");
		OrderStatus status = OrderStatus.valueOf(t.next());
		
		Order order = new Order(new Date(), status, client);
		
		
		System.out.print("How many items to this order? ");
		int n = t.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print("Enter # " + i + " item data:");
			System.out.println();
			System.out.print("Product name: ");
			t.nextLine();
			String productName = t.nextLine();
			System.out.print("Product price: ");
			double productPrice = t.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int quantity = t.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			
			order.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		t.close();
		
	}

}
