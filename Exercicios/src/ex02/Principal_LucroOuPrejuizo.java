package ex02;

import java.util.Scanner;

public class Principal_LucroOuPrejuizo {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o preco de custo do produto: ");
		double pCusto = input.nextDouble();
		
		System.out.println("Qual o preco de venda do produto: ");
		double pVenda = input.nextDouble();
		
		double lucroMin = Servicos.lucroMin(pCusto);
		
		if (pVenda >= lucroMin + pCusto) {
			
			System.out.println("Voce esta LUCRANDO!!");
			
		}else {
			
			System.out.println("Voce esta saindo no PREJUIZO!");
			
		}
		
		input.close();
	}

}