package javaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class StorageManagement {
	public static void main(String[] args) {
		int option;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> storage = new ArrayList();
		
		do {
			System.out.println("\n\nInsert an option:\n--------------------------------------------------------------------------------------------");
			System.out.println("1 --> Add items\n2 --> Delete items\n3 --> Modify items\n4 --> Show all items\n0 --> Close the program\n--------------------------------------------------------------------------------------------");
			option = scan.nextInt();
			
			switch (option) {
			case 1:
				scan.nextLine();
				System.out.println("What product do you want to add to the storage?");
				String addProduct = scan.nextLine();
				storage.add(addProduct);
				break;
			case 2:
				scan.nextLine();
				System.out.println("What product do you want to remove from the storage?");
				String removeProduct = scan.nextLine();
				if(storage.contains(removeProduct)) {
					storage.remove(removeProduct);
				} else {
					System.out.println("This product does not exist in the storage!");
				}
				break;
			case 3:
				scan.nextLine();
				System.out.println("What product do you want to modify?");
				String modifyProduct = scan.nextLine();
				if(storage.contains(modifyProduct)) {
					System.out.println("Insert the modified product:");
					String modifiedProduct = scan.nextLine();
					storage.remove(modifyProduct);
					storage.add(modifiedProduct);
				} else {
					System.out.println("This product does not exist in the storage!");
				}
				break;
			case 4:
				scan.nextLine();
				System.out.println("Products in the storage: " + storage);
				break;
			case 0:
				System.out.println("Closing the program...");
				break;
			default:
				System.out.println("Invalid entry. Please, insert an integer bewteen 0 and 4: ");
			}
		} while (option != 0);
	}
}
