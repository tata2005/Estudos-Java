package application;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vao ser digitadas: ");
		int n = sc.nextInt(); 
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite os dados da " + i + "a Pessoa: ");
			
			System.out.print("Nome: ");
			sc.next();
		    nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double media = 0;
		for(int i =0; i<n; i++) {
			media += altura[i]/n;
		}
		
		System.out.println("Altura media: " + media);
		
		int p = 0;
		for(int i = 0; i<n; i++) {
			if(idade[i]<16) {
				p++;
			}
		}
		double a = ((double)p / n)* 100;
		System.out.println("Pessoas com menos de 16 anos: " + a + "%");
		
		for(int i = 0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

	}

}
