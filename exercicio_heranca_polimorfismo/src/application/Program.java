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

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		String name;
		Double price;
		Double customsFee;
		Date manufactureDate;
		
		List<Product> listaDeProdutos = new ArrayList<>();
		
		System.out.print("Enter the number of product: ");
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			System.out.print("Common, used, imported (c/u/i)? ");
			char y = sc.next().charAt(0);
			if(y == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				name= sc.nextLine();
				System.out.print("Price: ");
				price= sc.nextDouble();
				
				listaDeProdutos.add(new Product(name, price));
			}if(y == 'u') {
				System.out.print("Name: ");
				sc.nextLine();
				name= sc.nextLine();
				System.out.print("Price: ");
				price= sc.nextDouble();
				System.out.print("Manufacture date: (DD/MM/YYYY) ");
				manufactureDate = sdf.parse(sc.next());
				
				listaDeProdutos.add(new UsedProduct(name, price, manufactureDate));
			}if(y =='i') {
				System.out.print("Name: ");
				sc.nextLine();
				name= sc.nextLine();
				System.out.print("Price: ");
				price= sc.nextDouble();
				System.out.print("Customs fee: ");
				customsFee= sc.nextDouble();
				
				listaDeProdutos.add(new ImportedProduct(name, price, customsFee));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product lista : listaDeProdutos) {
			System.out.print(lista.priceTag());
		}
	}

}
