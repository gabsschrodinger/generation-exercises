package introducaoJava;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		double coefA, coefB, coefC, coefD, coefE, coefF, coefX, coefY;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o coeficiente A: ");
		coefA = ler.nextDouble();
		System.out.println("Insira o coeficiente B: ");
		coefB = ler.nextDouble();
		System.out.println("Insira o coeficiente C: ");
		coefC = ler.nextDouble();
		System.out.println("Insira o coeficiente D: ");
		coefD = ler.nextDouble();
		System.out.println("Insira o coeficiente E: ");
		coefE = ler.nextDouble();
		System.out.println("Insira o coeficiente F: ");
		coefF = ler.nextDouble();

		coefX = ((coefC * coefE) - (coefB * coefF)) / ((coefA * coefE) - (coefB * coefD));
		coefY = ((coefA * coefF) - (coefC * coefD)) / ((coefA * coefE) - (coefB * coefD));
		
		System.out.println("Valor de X: "+ coefX+ "\nValor de Y: "+ coefY);
	}
}
