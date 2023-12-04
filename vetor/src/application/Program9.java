package application;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) +"o aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		for(int i = 0; i<n; i++) {
			media[i] = (nota1[i] + nota2[i])/2;
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i<n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
	}

}
