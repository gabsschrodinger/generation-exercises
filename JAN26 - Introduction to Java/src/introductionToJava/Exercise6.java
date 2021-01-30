package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take the values of X and Y of two points as input and will print the distance value between the two points.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise6 {
	public static void main(String[] args) {
		double firstPointX, firstPointY, secondPointX, secondPointY;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the X value of the first point: ");
		firstPointX = scan.nextDouble();
		System.out.println("Insert the Y value of the first point: ");
		firstPointY = scan.nextDouble();
		System.out.println("Insert the X value of the second point: ");
		secondPointX = scan.nextDouble();
		System.out.println("Insert the Y value of the second point: ");
		secondPointY = scan.nextDouble();
		
		System.out.println("Distance between the points: "+ (Math.sqrt((secondPointX - firstPointX) * (secondPointX - firstPointX) + (secondPointY - firstPointY) * (secondPointY - firstPointY))));
	}
}
