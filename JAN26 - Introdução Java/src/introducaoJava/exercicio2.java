package introducaoJava;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int anos, meses, dias, total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Há quantos dias você está vivo? ");
		total = ler.nextInt();
		
		anos = total / 365;
		meses = (total % 365) / 30;
		dias = total - anos*365 - meses*30;
		
		System.out.println("Você está vivo há "+ anos+ " anos, "+ meses+ " meses e "+ dias+ " dias!!!");
	}
}
