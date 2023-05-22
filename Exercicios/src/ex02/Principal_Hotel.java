package ex02;

import java.util.Scanner;

public class Principal_Hotel {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas horas de trabalho: ");
		double hora = input.nextDouble();
		 
		System.out.println("O seu Salario e: "+Servicos.salario(hora)+ " R$"); 
		 	
		double salario = Servicos.salario(hora);
		
		if (salario <= 50) {
			
			System.out.println("Atencao, dirija-se a direcao do Hotel!");
			
		}
		input.close();
	}

}
