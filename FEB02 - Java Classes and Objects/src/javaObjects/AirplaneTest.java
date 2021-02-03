package javaObjects;

import java.util.Scanner;

public class AirplaneTest {
	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		Airplane[] planeList = new Airplane[3];
		planeList[0] = new Airplane("", "", "", 0, 0, 0);
		planeList[1] = new Airplane("", "", "", 0, 0, 0);
		planeList[2] = new Airplane("", "", "", 0, 0, 0);
		
		while(i < 3) {
			System.out.println("\nInsert data for the airplane no. " + ( i+ 1));
			System.out.println("Insert the airplane registration: ");
			String stringInput = scan.next();
			planeList[i].setRegistration(stringInput);
			
			System.out.println("Insert the airplane origin: ");
			stringInput = scan.next();
			planeList[i].setFrom(stringInput);
			
			System.out.println("Insert the airplane destination: ");
			stringInput = scan.next();
			planeList[i].setTo(stringInput);
			
			System.out.println("Insert the month of the departure date: ");
			int intInput = scan.nextInt();
			planeList[i].setDepartMonth(intInput);
			
			System.out.println("Insert the day of the departure date: ");
			intInput = scan.nextInt();
			planeList[i].setDepartDay(intInput);
			
			i++;
		}
		
		for(Airplane j : planeList) {
			j.printInfo();
		}
	}
}