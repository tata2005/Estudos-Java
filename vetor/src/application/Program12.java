package application;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] vect = new int[6][6];
		
		for(int i=0; i < vect.length; i++) {
			for(int j=0; j < vect[i].length; j++) {
				if(i > j) {
					vect[i][j] = (i/4);
				}
				if(i == j) {
					vect[i][j] = 2;
				}
				if(j > i) {
					vect[i][j] = (j*3);
				}
			}
		}
		
		for(int i=0; i < vect.length; i++) {
			for(int j=0; j < vect[i].length; j++) {
				System.out.print(vect[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
