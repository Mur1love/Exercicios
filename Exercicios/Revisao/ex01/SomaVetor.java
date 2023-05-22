package ex01;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		int soma = somarNumerosDoVetor(numeros);
		System.out.println("A soma dos numeros do vetor e igual a "+soma);
		
		sc.close();
	}

	public static int somarNumerosDoVetor(int[] numeros) {
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
		}

		return soma;
	}
}
