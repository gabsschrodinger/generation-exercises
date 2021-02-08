package socialLibrary;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainLibrary {
public static void main(String args[]) throws InterruptedException {
		
		Library library = new Library();
		
			try (Scanner scan = new Scanner(System.in)) {
				int option;
				int bookId;
				int bookGenre;
				int idCounter = 0;
				int nextPerson = -1;
				String bookAuthor;
				String bookTitle;
				String name;
				
			while(nextPerson != 0) {
				
				System.out.println("\nHello! Welcome to the Social Inclusive Library.\nSelect one option:\n1 --> Open the library");
				System.out.println("0 --> Close the library");
				System.out.print("Insert the number of your option: ");
				nextPerson = scan.nextInt();
				
				while (nextPerson < 0 || nextPerson > 1) {
					System.out.print("Invalid entry. Please, insert an integer between 0 and 2: ");
					nextPerson = scan.nextInt();
				}
				if(nextPerson == 0) {
					System.out.println("\nClosing the library...");
					break;
				}
			
				System.out.println("------ WELCOME TO THE LIBRARY ------");
				Thread.sleep(500);
				System.out.println();
				System.out.println("The social inclusive library");
				Thread.sleep(500);
				System.out.println();
				System.out.print("Insert your name: ");
				name = scan.next();
				
				do {
					System.out.println("\n--------- Hello, " + name + "! ---------\nWhat would you like to do?");
					System.out.println("1 - Donate a book");
					System.out.println("2 - Adopt a book");
					System.out.println("3 - Show all books");
					System.out.println("4 - Show books by genre");
					System.out.println("0 - Logout");
					System.out.print("Insert the number of your option: ");
					option = scan.nextInt();
					if (option < 0 || option > 4) {
						System.out.print("Invalid entry. Please, insert an integer between 0 and 4: ");
					}
					
					switch(option) {
					
					case 1:
						idCounter++;
						bookId = idCounter;
	
						scan.nextLine();
						
						System.out.print("Insert the book title: ");
						bookTitle = scan.nextLine();
						
						System.out.print("Insert the book author: ");
						bookAuthor = scan.nextLine();
						
						System.out.print("\nInsert the book genre:\n1 --> LGBT+\n2 --> Children's\n3 --> Self-Help\n4 --> Social Science\nInsert the number of your option:");
						bookGenre = scan.nextInt();
						
						Book book = new Book(bookId, bookAuthor, bookGenre, bookTitle);
						library.bookDonation(book);
						
						System.out.println("\n" + name + ", thanks for your donation!\n");
						
						break;
					
					case 2:
						do {
						System.out.println("\nWhat would you like to do now?");
						System.out.println("1 - Show all books");
						System.out.println("2 - Show books by genre");
						System.out.println("3 - Adopt a book");
						System.out.print("Insert the number of your option: ");
						option = scan.nextInt();
						
						if (option < 1 || option > 3) 
						{
							System.out.print("Invalid entry. Please, insert an integer between 1 and 3: ");
						}	
							switch(option) {
						
							case 1:
								List<Book> allBooks = library.booksInTheLibrary();
								
								if(allBooks.isEmpty()) 
									{
									System.out.println("There is no book in the library.");
									}
								else 
								{
									System.out.println("Available book list: ");
									for(Book i : allBooks) 
									{
										System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
									}
	
								}
								
								library.booksInTheLibrary();
							
								break;
							
							case 2:
								List<Book> allBooks1 = library.booksInTheLibrary();
								
								System.out.println("Which genre would you like to show?\n1 --> LGBT+\n2 --> Children's\n3 --> Self-Help\n4 --> Social Science\nInsert the number of your option: ");
								bookGenre = scan.nextInt();
								
								switch(bookGenre) {
								case 1:
									for(Book i : allBooks1) {
										if(i.getGenre() == 1) {
											System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
										}
									}
									break;
								case 2:
									for(Book i : allBooks1) {
										if(i.getGenre() == 2) {
											System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
										}
									}
									break;
								case 3:
									for(Book i : allBooks1) 
									{
										if(i.getGenre() == 3) 
										{
											System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
										}
									}
									break;
								case 4:
									for(Book i : allBooks1) 
									{
										if(i.getGenre() == 4) 
										{
											System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
										}
									}
									break;
								}
							
								}
						} while (option != 3);
						
						
						System.out.print("Insert the chosen book's id: ");
						bookId = scan.nextInt();
						
						boolean adoptedBook = library.bookAdoption(bookId);
						
						if (adoptedBook == true) 
						{
							System.out.println("Adoption completed!\n" + name + ", thank you for giving a home for this book.");
						} else {
							System.out.println("We did not find this book id :(\n");
						}
						
						break;
					
					case 3:
						List<Book> allBooks = library.booksInTheLibrary();
						if(allBooks.isEmpty()) {
							System.out.println("There is no books in the library.");
						} else {
							System.out.println("Available book list: ");
							for(Book i : allBooks) {
								System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
							}
						}
						library.booksInTheLibrary();
						break;
					
					case 4:
						List<Book> allBooks1 = library.booksInTheLibrary();
						
						System.out.println("Which genre would you like to show?\n1 --> LGBT+\n2 --> Children's\n3 --> Self-Help\n4 --> Social Science\nInsert the number of your option: ");
						bookGenre = scan.nextInt();
						
						switch(bookGenre) {
						case 1:
							for(Book i : allBooks1) {
								if(i.getGenre() == 1) {
									System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
								}
							}
							break;
							
						case 2:
							for(Book i : allBooks1) {
								if(i.getGenre() == 2) {
									System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
								}
							}
							break;
							
						case 3:
							for(Book i : allBooks1) {
								if(i.getGenre() == 3) {
									System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
								}
							}
							break;
							
						case 4:
							for(Book i : allBooks1) {
								if(i.getGenre() == 4) {
									System.out.println("ID - " + i.getId() + " ***** Title - " + i.getTitle() + " ***** Author - " + i.getAuthor() + " ***** Genre - " + i.getGenreString());
								}
							}
							break;
						}
								
					}
				
					
				
				
			}while(option != 0);
		
		System.out.println(name + ", thanks for using the Social Inclusive Library!");
	
			}
		}
	}
}