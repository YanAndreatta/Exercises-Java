package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of shapes: ");
		int n = t.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = t.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(t.next());
			if(ch == 'r') {
				System.out.print("width: ");
				double width = t.nextDouble();
				System.out.print("Height: ");
				double height = t.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = t.nextDouble();
				list.add(new Circle(color, radius));
			}
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		t.close();

	}

}
