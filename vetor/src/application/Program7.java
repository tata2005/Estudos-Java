package application;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0;i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		double media = 0;
		int soma = 0;
		int p = 0;
		for(int i=0; i<n;i++) {
			if(vect[i]%2==0) {
				soma += vect[i];
				p++;
			}
		}
		if (p == 0) {
			System.out.println("NENHUM NUMERO PAR");		
		}
		else {
			media = soma / p;
			System.out.println("MEDIA DOS NUMEROS PARES: "+ media);
		}
	}

}
