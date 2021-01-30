package javaArray;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		int diceValues[] = new int[10];
		int i, highestValue=0, highestCount=0;
		double sum=0;
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 10; i++) {
			System.out.println("Insert the "+ (i + 1)+ "o. value of the dice: ");
			diceValues[i] = scan.nextInt();
			while(diceValues[i] < 1 || diceValues[i] > 6) {
				System.out.println("Invalid number. Please, insert an integer between 1 and 6: ");
				diceValues[i] = scan.nextInt();
			}
			sum += diceValues[i];
			if(diceValues[i] > highestValue) {
				highestValue = diceValues[i];
			}
		}
		
		System.out.println("\n\nList of dice values:");
		for(int value : diceValues) {
			if(value == highestValue) {
				highestCount++;
				System.out.println(value+ " <-- Highest value");
			} else {
				System.out.println(value);
			}
		}
		
		System.out.println("\nThere was "+ highestCount+ " occurrence(s) of the highest value.\nThe arithmetic mean of the dice values was "+ (sum/10));
	}
}
