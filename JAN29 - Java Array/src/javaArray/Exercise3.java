package javaArray;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		double n1[][] = new double[4][6];
		double n2[][] = new double[4][6];
		double m1[][] = new double[4][6];
		double m2[][] = new double[4][6];
		int i, j;
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 2; i++) {
			System.out.printf("Insert the values of the first line of the N1 matrix: ");
			for(j = 0; j < 4; j++) {
				System.out.printf("N1["+ i+ "]["+ j+ "] = ");
				n1[i][j] = scan.nextDouble();
			}
		}
		
		for(i = 0; i < 2; i++) {
			System.out.printf("Insert the values of the first line of the N2 matrix: ");
			for(j = 0; j < 4; j++) {
				System.out.printf("N2["+ i+ "]["+ j+ "] = ");
				n2[i][j] = scan.nextDouble();
			}
		}
		
		for(i = 0; i < 2; i++) {
			for(j = 0; j < 4; j++) {
				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
			}
		}
		
		System.out.println("\nMatriz M1 (N1 + N2): ");
		for(i = 0; i < 2; i++) {
			System.out.printf("\n");
			for(j = 0; j < 4; j++) {
				System.out.println(m1[i][j]);
			}
		}
		
		System.out.println("\nMatriz M2 (N1 - N2): ");
		for(i = 0; i < 2; i++) {
			System.out.printf("\n");
			for(j = 0; j < 4; j++) {
				System.out.println(m2[i][j]);
			}
		}
	}
}
