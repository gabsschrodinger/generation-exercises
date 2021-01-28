package loopingStatements;

import java.util.Scanner;

/**
 * Write a program that will take people's age as input and will print the amount of people under 21 years old and the amount of people above 50 years old. The program shall be closed when the age value is equal to -99.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise3 {
	public static void main(String[] args) {
		int age=1, under21=0, above50=0;
		Scanner scan = new Scanner(System.in);
		
		while(age != -99) {
			System.out.println("Insert your age: ");
			age = scan.nextInt();
			if(age < 0 && age != -99 || age > 130) {
				System.out.println("Invalid number. Please, insert an integer between 0 and 130.");
			} else if(age == -99) {
				System.out.println("Closing the program...");
			} else {
				if(age < 21) {
					under21++;
				} else if(age >= 50) {
					above50++;
				}
			}
		}
		
		System.out.println("Number of people under 21 years old: "+ under21+ "\nNumber of people above 50 years old: "+ above50);
	}
}
