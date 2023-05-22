package ex01;

import java.util.Scanner;

public class Principal_VelocidadeMedia {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a distancia percorrida: ");
		double distancia = input.nextDouble();
		
		System.out.println("Total de tempo em horas: ");
		double tempo = input.nextDouble();
		
		System.out.println(Servico.calcularVelocidadeMedia(distancia, tempo));
		
		input.close();
		
	}

}
