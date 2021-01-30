package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take three integers as input (number A, B and C) and will solve an equiation where R = (A + B) ^ 2; S = (B + C) ^ 2; and D = (R + S) / 2.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise4 {
	public static void main(String[] args) {
		int numberA, numberB, numberC;
		double numberD, numberR, numberS;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the number A: ");
		numberA = scan.nextInt();
		System.out.println("Insert the number B: ");
		numberB = scan.nextInt();
		System.out.println("Insert the number C: ");
		numberC = scan.nextInt();
		
		numberR = Math.pow((numberA + numberB), 2);
		numberS = Math.pow((numberB + numberC), 2);
		numberD = (numberR + numberS) / 2;
		
		System.out.println("Equation output (number D): "+ numberD);
	}
}
