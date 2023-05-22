package ex02;

import java.util.Scanner;

public class Principal_ParImparOuPrimo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = input.nextInt();
		
		int quantDiv = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				quantDiv++;
			}
			
		}
		
		if(quantDiv == 2) {
			System.out.println("O numero "+num+ " e PRIMO!");
			
		}else if(quantDiv >= 2 && num % 2 == 0) {
			
			System.out.println("O numero "+num+ " e PAR!");
			
		}else if(quantDiv >= 2 && num % 2 == 1) {
			
			System.out.println("O numero "+num+ " e IMPAR!");
			
		}
		input.close();
	}

}
