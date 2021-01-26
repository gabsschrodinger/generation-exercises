package introducaoJava;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		double x1, y1, x2, y2, dist;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o X do primeiro ponto: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o Y do primeiro ponto: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o X do segundo ponto: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o Y do segundo ponto: ");
		y2 = ler.nextDouble();
		
		dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Distância entre os pontos: "+ dist);
	}
}
