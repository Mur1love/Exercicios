package ex02;

import java.util.Scanner;

public class Principal_Operacoes {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = input .nextInt();
		
		System.out.println("Qual Operacao deseja fazer?");
		System.out.println("1 = Soma");
		System.out.println("2 = Subtracao");
		System.out.println("3 = Multiplicacao");
		System.out.println("4 = Divisao");
		int opcao = input.nextInt(); 
		
		if(opcao == 1) {
			
			System.out.println("A soma de "+num1+" + "+num2+" e igual a "+Servicos.soma(num1, num2));
			
		}else if (opcao == 2){
			
			System.out.println("A subtracao de "+num1+" - "+num2+" e igual a "+Servicos.subtracao(num1, num2));
			
		}else if(opcao == 3) {
			
			System.out.println("A multiplicaco de "+num1+" x "+num2+" e igual a "+Servicos.multiplicacao(num1, num2));
		}else if (opcao == 4 ) {
			
			System.out.println("A divisao de "+num1+" / "+num2+" e igual a "+Servicos.divisao(num1, num2));
		}else{
			System.out.println("Opcao invalida! Tente Novamente.");
		}
		
		input.close();
		
	}

}
