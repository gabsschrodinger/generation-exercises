package introducaoJava;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = (nota1*2 + nota2*3 + nota3*5) / (2 + 3 + 5);
		
		System.out.println("Média ponderada: "+ media);
	}
}
