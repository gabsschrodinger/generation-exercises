package javaArray;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		double matrix[][] = new double[3][3];
		double sum=0, mainDiagonal;
		int i, j;
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.println("Insert the value for the matrix: ");
				matrix[i][j] = scan.nextDouble();
				sum += matrix[i][j];
			}
		}
		
		mainDiagonal = matrix[0][0] + matrix[1][1] + matrix[2][2];
		
		System.out.println("The sum of the matrix values is: "+ sum+ "\nThe main diagonal sum is: "+ mainDiagonal);
	}
}
