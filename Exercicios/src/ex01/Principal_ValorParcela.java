package ex01;

import java.util.Scanner;

public class Principal_ValorParcela {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor a vista do produto: ");
		double valor = input.nextDouble();
		
		System.out.println(Servico.calcularParcelas(valor));
		
		input.close();
		
	}

}
