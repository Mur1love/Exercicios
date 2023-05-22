package ex01;

import java.util.Scanner;

public class SalariosMinimos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário");
		double sal = sc.nextDouble();
		
		double salMin = 1320.0;
		
		double qtdSal = sal / salMin;
		
		System.out.printf("Você recebe %.2f salario(s) minimo(s)", qtdSal);
		
		sc.close();
		
	}

}
