package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numeros de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numeros de colunas: ");
		int n  = sc.nextInt();
		
		int[][] vect = new int[m][n];
		
		
		for(int i=0; i<vect.length; i++) {
			for(int j=0; j<vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i=0; i<vect.length; i++) {
			for(int j=0; j<vect[i].length; j++) {
				if(vect[i][j]==x) {
					System.out.println("Posiçao " + i+","+j);
					if(i > 0) {
						System.out.println("cima: "+ vect[i-1][j]);
					}
					if(j > 0) {
						System.out.println("esquerda: "+ vect[i][j-1]);
					}
					if(i < vect.length-1) {
						System.out.println("baixo: "+ vect[i+1][j]);
					}
					if(j < vect[i].length-1) {
						System.out.println("direita: "+ vect[i][j+1]);
					}
				}
			}
		}
	}
}
