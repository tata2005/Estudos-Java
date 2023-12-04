package application;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos nomeros voce vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		int p = 0;
		for(int i = 0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				p++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + p);
	}

}
