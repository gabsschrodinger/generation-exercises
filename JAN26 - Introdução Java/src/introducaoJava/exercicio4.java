package introducaoJava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		int numA, numB, numC;
		double numD, numR, numS;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		numA = ler.nextInt();
		System.out.println("Digite o número B: ");
		numB = ler.nextInt();
		System.out.println("Digite o número C: ");
		numC = ler.nextInt();
		
		numR = Math.pow((numA + numB), 2);
		numS = Math.pow((numB + numC), 2);
		numD = (numR + numS) / 2;
		
		System.out.println("O output da equação é: "+ numD);
	}
}
