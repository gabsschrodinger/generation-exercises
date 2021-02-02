package bloodDonationSurvey;

import java.util.Scanner;

public class BloodDonation {
	public static void main(String args[]) {
		int option, age, nextPerson = 1, canDonatePeople = 0, cityPopulation = 0, sampleSize = 0, notInterested = 0, cantDonatePeople = 0, cantDonateYet = 0;
		String firstName, lastName, city, state;

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Hello!\nWe are applying a blood donation survey.\nSmall cities need resources transportation planning for blood donation.");

		System.out.println("Insert the city where the survey will be applied: ");
		city = scan.nextLine();

		System.out.println("Insert the state where the survey will be applied: ");
		state = scan.nextLine();

		System.out.println("What is the population of " + city + "?");
		cityPopulation = scan.nextInt();

		int ages[] = new int[cityPopulation];
		String firstNames[] = new String[cityPopulation], lastNames[] = new String[cityPopulation], emails[] = new String[cityPopulation];

		do {
			while (sampleSize < cityPopulation) {
				System.out.println("Insert your first name: ");
				firstName = scan.next();

				System.out.println("Insert your last name: ");
				lastName = scan.next();
				
				sampleSize++;

				System.out.println("Are you interested in donationg blood?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();
				
				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 2) {
					System.out.println("Thank you for your time! Please, share this survey and help us find blood donators around the country.");
					notInterested++;
					break;
				}

				System.out.println("Insert your age: ");
				age = scan.nextInt();

				if (age < 16) {
					System.out.println("You need to be above 16 years old to donate blood. Plese, come back in"+ (16-age) + " year(s)!");
					cantDonateYet++;
					break;
				} else if (age > 69) {
					System.out.println("You need to be under 69 years old to donate blood.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
					cantDonatePeople++;
					break;
				}

				System.out.println("Do you weight more than 50 kg?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();

				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 2) {
					System.out.println("You need to be over 50 kg to donate blood.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
					cantDonateYet++;
					break;
				}

				System.out.println("Do you have tattos?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();

				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 1) {
					System.out.println("Has it been over 1 year since you got tattooed?\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();

					while (option != 1 && option != 2) {
						System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
						option = scan.nextInt();
					}

					if (option == 2) {
						System.out.println("You can't donate blood if you got tattooed in the last 12 months.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
						cantDonateYet++;
						break;
					}
				}

				System.out.println("Have you had hepatitis?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();

				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 1) {
					System.out.println("You can't donate blood if you had hepatitis.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
					cantDonatePeople++;
					break;
				}

				System.out.println("Have you been diagnosed with any STIs or Chagas disease?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();

				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 1) {
					System.out.println("You can't donate blood you have been diagnosed with these deseases.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
					cantDonatePeople++;
					break;
				}

				System.out.println("Have you ever done drug injection?\nPress 1 for YES and 2 for NO.");
				option = scan.nextInt();

				while (option != 1 && option != 2) {
					System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
					option = scan.nextInt();
				}

				if (option == 1) {
					System.out.println("You can't donate blood if you have done drug injection.\nThank you for your time.\nPlease, share this survey and help us find blood donators around the country.");
					cantDonatePeople++;
					break;
				}

				System.out.println("That's great!!! You can donate blood! Please, insert your email address: ");
				String email = scan.next();

				firstNames[canDonatePeople] = firstName;
				lastNames[canDonatePeople] = lastName;
				ages[canDonatePeople] = age;
				emails[canDonatePeople] = email;
				
				canDonatePeople++;

				break;

			}

			System.out.println("\nContinue to the next person?\nPress 1 for YES and 2 for NO.");
			nextPerson = scan.nextInt();

			while (nextPerson != 1 && nextPerson != 2) {
				System.out.println("Invalid Entry.\nPress 1 for YES and 2 for NO.");
				nextPerson = scan.nextInt();
			}

			System.out.println("\n");

		} while (nextPerson != 2);

		System.out.println("This survey was applied in " + city + " - " + state + ", a city with a population of " + cityPopulation + " people. We got " + sampleSize + " answers.\nAmount of people who can and want to donate blood: " + canDonatePeople + "\nAmount of people that are not interested in donating blood: " + notInterested + "\nAmount of people who want to donate blood, but are not capable at this moment (temporary): " + cantDonateYet + "\nAmount of people who want to donate blood, but are not allowed by regulation (not temporary): " + cantDonatePeople + "\nThe survey indicates that it is possible to collect approximately " + ((float) canDonatePeople / 2) + " liters of blood (" + canDonatePeople + " bags) at the moment.");

		System.out.println("List of people who can and want to donate blood:\n");

		for (int i = 0; i < canDonatePeople; i++) {
			System.out.println(firstNames[i] + " " + lastNames[i] + ", " + ages[i] + " years old, " + emails[i]);
		}

		System.out.println(
				"\n\n\n\nProject developed by: \nFrancine Massaro \nGabriel Fernandes \nLeonardo Nogueira \nMariana Carvalho \nVinicius Menezes");
	}
}