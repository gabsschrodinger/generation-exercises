package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take 6 coefficient values (A to F) as input and will print the X and the Y value of an equation where: ax + by = c; and dx + ey = f.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise7 {
	public static void main(String[] args) {
		double coefficientA, coefficientB, coefficientC, coefficientD, coefficientE, coefficientF, xValue, yValue;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the coefficient A: ");
		coefficientA = scan.nextDouble();
		System.out.println("Insert the coefficient B: ");
		coefficientB = scan.nextDouble();
		System.out.println("Insert the coefficient C: ");
		coefficientC = scan.nextDouble();
		System.out.println("Insert the coefficient D: ");
		coefficientD = scan.nextDouble();
		System.out.println("Insert the coefficient E: ");
		coefficientE = scan.nextDouble();
		System.out.println("Insert the coefficient F: ");
		coefficientF = scan.nextDouble();
		
		xValue = ((coefficientC * coefficientE) - (coefficientB * coefficientF)) / ((coefficientA * coefficientE) - (coefficientB * coefficientD));
		yValue = ((coefficientA * coefficientF) - (coefficientC * coefficientD)) / ((coefficientA * coefficientE) - (coefficientB * coefficientD));
		
		System.out.println("X value: "+ xValue+ "\nY value: "+ yValue);
	}
}
