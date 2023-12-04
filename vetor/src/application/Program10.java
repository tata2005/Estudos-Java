package application;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("gereno da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double maiorAltura = altura[0];
		double menorAltura = altura[0];
		for(int i = 0; i<n; i++) {
			if( altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if( altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		int m = 0;
		int h = 0;
		double soma = 0;
		for(int i = 0; i<n; i++) {
			if(genero[i] == 'M') {
				h++;
			}
			else {
				soma += altura[i];
				m++;
			}
		}
		double media = soma/m;
		
		System.out.println("Maior altura: " + maiorAltura);
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Media das alturas das mulhores: " + media);
		System.out.println("Numeros de homens: " + h);
	}

}
