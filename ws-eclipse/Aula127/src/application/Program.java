package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		
		
		Scanner t = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = t.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product # " + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = t.next().charAt(0);
			
			if(ch == 'i') {
				
				System.out.print("Name: ");
				t.nextLine();
				String name = t.nextLine();
				System.out.print("Price: ");
				double price = t.nextDouble();
				System.out.print("Customs fee: ");
				double fee = t.nextDouble();
				
				Product impP = new ImportedProduct(name, price, fee);
				list.add(impP);
				
			} else if(ch == 'u') {
				
				System.out.print("Name: ");
				t.nextLine();
				String name = t.nextLine();
				System.out.print("Price: ");
				double price = t.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date md = sdf.parse(t.next());
				
				Product usedP = new UsedProduct(name, price, md);
				list.add(usedP);
				
			} else {
				
				System.out.print("Name: ");
				t.nextLine();
				String name = t.nextLine();
				System.out.print("Price: ");
				double price = t.nextDouble();
				
				Product commonP = new Product(name, price);
				list.add(commonP);
			}
			
			
		}
		
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		t.close();

	}

}
