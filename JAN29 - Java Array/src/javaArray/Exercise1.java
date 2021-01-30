package javaArray;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		double scores[] = new double[5];
		int i;
		double highestScore;
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < 5; i++) {
			System.out.println("Insert the exam score: ");
			scores[i] = scan.nextDouble();
			while(scores[i] < 0 || scores[i] > 10) {
				System.out.println("Invalid entry. Please, insert a number between 0 and 10: ");
				scores[i] = scan.nextDouble();
			}
		}
		
		highestScore = scores[0];
		
		for(double score : scores) {
			if(score > highestScore) {
				highestScore = score;
			}
		}
		
		System.out.println("\n\nScores list: ");
		for(double score : scores) {
			if(score == highestScore) {
				System.out.println(score+ " <-- Highest score");
			} else {
				System.out.println(score);
			}
		}
	}
}
