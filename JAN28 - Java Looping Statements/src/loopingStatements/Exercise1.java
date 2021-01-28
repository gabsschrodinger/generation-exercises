package loopingStatements;

/**
 * Write a program that shows every number that leaves a remainder of 5 when divided by 11.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise1 {
	public static void main(String[] args) {
		int number;
		
		System.out.println("The following numbers leave a remainder of 5 when divided by 11: ");
		for(number = 1000; number <= 1999; number++) {
			if(number % 11 == 5) {
				System.out.println(number);
			}
		}
	}
}
