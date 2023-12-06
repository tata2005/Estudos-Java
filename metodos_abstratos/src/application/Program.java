package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		Color color;
		Double width;
		Double height;
		Double radius;
		
		System.out.print("Enter the number of shape: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Retangle or Circle (r/c)? ");
			char y = sc.next().charAt(0);
			if(y == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				color = Color.valueOf(sc.next());
				System.out.print("Width: ");
				width = sc.nextDouble();
				System.out.print("Height: ");
				height = sc.nextDouble();
				
				list.add(new Retangle(color, width, height));
			}if(y == 'c') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				color = Color.valueOf(sc.next());
				System.out.print("Radius: ");
				radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for(Shape s: list) {
			System.out.printf("%.2f%n", s.area());
		}

	}

}
