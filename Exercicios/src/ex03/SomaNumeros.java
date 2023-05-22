package ex03;

import java.util.Scanner;

public class SomaNumeros {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[3];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Digite o numero " + (i+1) + ": ");
			num[i] = sc.nextDouble();
			
		}
		
		SomaValores soma = new SomaValores();
		double res = soma.somaValores(num);
		
		
		System.out.println("A Soma dos numeros e: " + res);
		sc.close();
	}
	
}
