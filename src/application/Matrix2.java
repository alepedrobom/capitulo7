package application;

import java.util.Scanner;

public class Matrix2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();

		int z = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == z) {
					System.out.println("posição: " +i + ","+j);
					if(j > 0 ) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}
					if(j < mat[i].length - 1) {
						System.out.println("direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("acima: " + mat[i-1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		System.out.println();
		
		
		sc.close();
	}
}
