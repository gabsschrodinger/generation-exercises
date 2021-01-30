package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take three exam scores as input and will print the weighted average of the scores, considering the weights to be 2, 3 and 5, respectively.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */


public class Exercise5 {
	public static void main(String[] args) {
		double firstScore, secondScore, thirdScore;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the first exam score: ");
		firstScore = scan.nextDouble();
		System.out.println("Insert the second exam score: ");
		secondScore = scan.nextDouble();
		System.out.println("Insert the third exam score: ");
		thirdScore = scan.nextDouble();
		
		System.out.println("Weighted average: "+ ((firstScore * 2 + secondScore* 3 + thirdScore * 5)/ (2 + 3 + 5)));
	}
}
