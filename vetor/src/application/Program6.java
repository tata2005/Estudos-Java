package application;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i = 0; i<n; i++) {
			System.out.print("Digite um nummero: ");
			vect[i] = sc.nextDouble();
		}
		
		double media = 0;
		for(int i = 0; i<n; i++) {
			media += vect[i] / n;
		}
		System.out.println();
		System.out.printf("MEDIA DO VETOR: %.2f%n" , media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0;i<n;i++) {
			if(vect[i]<media) {
			System.out.println(vect[i]);
			}
		}
	}

}
