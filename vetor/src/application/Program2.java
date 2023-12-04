package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite o numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma =0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma/n;
		System.out.print("VALORES: ");
		for(int i=0; i<n; i++) {
			System.out.print(" " + vect[i]);
		}
		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MEDIA: " + media);

	}

}
