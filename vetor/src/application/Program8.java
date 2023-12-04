package application;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vao ser digitadas: ");
		int n = sc.nextInt(); 
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maisvelho;
		int m;
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite os dados da " + i + "a Pessoa: ");
			
			System.out.print("Nome: ");
		    nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}
		maisvelho = idade[0];
		m=0;
		for (int i = 0; i<n; i++) {
			if(idade[i] > maisvelho) {
				maisvelho = idade[i];
				m = i;
			}		
		}
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[m]);

	}

}
