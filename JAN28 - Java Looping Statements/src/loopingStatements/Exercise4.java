package loopingStatements;

import java.util.Scanner;

/**
 * Write a program that will take the peoples's age, sex and mood as input and will print the amount of people within specific groups.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise4 {
	public static void main(String[] args) {
		int i=1, calm=0, nervousWomen=0, aggressiveMen=0, calmOthers=0, nervousAbove40=0, calmUnder18=0, age, sex, mood;
		Scanner scan = new Scanner(System.in);
		
		while(i <= 5) {
			System.out.println("Insert your age: ");
			age = scan.nextInt();
			
			System.out.println("\n\nWhat is your sex?\n1--> Female\n2--> Male\n3--> Other\nInsert the corresponding number: ");
			sex = scan.nextInt();
			while(sex < 1 || sex > 3) {
				System.out.println("Invalid number. Please, insert an integer between 1 and 3: ");
				sex = scan.nextInt();
			}
			
			System.out.println("\n\nDo you consider yourself to be:\n1--> Calm;\n2--> Nervous; or\n3--> Aggressive\nInsert the corresponding number: ");
			mood = scan.nextInt();
			while(sex < 1 || sex > 3) {
				System.out.println("Invalid number. Please, insert an integer between 1 and 3: ");
				mood = scan.nextInt();
			}
			
			if(mood == 1) {
				calm++;
				if(sex == 3) {
					calmOthers++;
				}
				if(age < 18) {
					calmUnder18++;
				}
			} else if(mood == 2) {
				if(sex == 1) {
					nervousWomen++;
				}
				if(age >= 40) {
					nervousAbove40++;
				}
			} else {
				if(sex == 2) {
					aggressiveMen++;
				}
			}
			
			i++;
		}
		
		System.out.println("Number of calm people: "+ calm+ "\nNumber of nervous women: "+ nervousWomen+ "\nNumber of aggressive men: "+ aggressiveMen+ "\nNumber of calm others: "+ calmOthers+ "\nNumber of nervous people above 40 years old: "+ nervousAbove40+ "\nNumber of calm people under 18 years old: "+ calmUnder18);
	}
}
