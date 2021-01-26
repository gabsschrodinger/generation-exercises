package introducaoJava;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		int anos, meses, dias, total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a).\nPor favor, digite a sua idade exata.\nIsto é, digite os valores de anos, meses e dias, separando cada um com a tecla Enter: ");
		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();
		total = anos*365 + meses+30 + dias;
		
		System.out.println("Você está vivo há "+ total+ " dias!!!");
	}
}
