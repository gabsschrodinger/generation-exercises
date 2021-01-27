package javaConditions;

import java.util.Scanner;

/**
 * Write a program that will take a person's age between 10 and 25 as input and will print the person's category.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise3 {
	public static void main(String[] args) {
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert your age: ");
		age = scan.nextInt();
		System.out.println("Category: ");
		
		if(age >= 10 && age <=14) {
			System.out.println("Child");
		} else if(age >= 15 && age <= 17) {
			System.out.println("Juvenile");
		} else if(age >= 18 && age <=25) {
			System.out.println("Adult");
		} else {
			System.out.println("Out of range.\n\nPlease, insert an age between 10 and 25!");
		}
	}
}
