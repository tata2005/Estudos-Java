package application;

import java.util.Scanner;

import entities.Quarto;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vect = new Quarto[10];
		
		System.out.print("Quantas reservas vai registrar: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Quarto " + (i+1) + "o : ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Numero do quarto: ");
			int room = sc.nextInt();
			vect[room] = new Quarto(name, email, room);

		}
		
		System.out.println("Quartos oculpados: " );
		for(int i=0; i<10; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}

	}

}
