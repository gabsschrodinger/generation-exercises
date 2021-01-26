package introducaoJava;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		int total, horas, minutos, segundos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento? ");
		total = ler.nextInt();
		
		horas = total / 3600;
		minutos = (total % 3600) / 60;
		segundos = total - horas*3600 - minutos*60;
		
		System.out.println("Duração do evento: "+ horas+ " horas, "+ minutos+ " minutos e "+ segundos+ " segundos.");
	}
}
