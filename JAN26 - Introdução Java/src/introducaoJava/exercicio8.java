package introducaoJava;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double custoConsumidor, custoFabrica, distribuidor, impostos;
		
		distribuidor = 0.28;
		impostos = 0.45;
		
		System.out.println("Insira o custo de fábrica do veículo: ");
		custoFabrica = ler.nextDouble();
		custoConsumidor = custoFabrica * (1 + distribuidor + impostos);
		
		System.out.println("Custo do veículo ao consumidor: "+ custoConsumidor);
	}
}
