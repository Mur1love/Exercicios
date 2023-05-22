package ex04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JogoAdvinhacao j = new JogoAdvinhacao();
		
		String teste = "";
		
		while (!teste.equals("Voce ACERTOU!")) {
			System.out.println("Digite um numero: ");
			teste = j.verificar(sc.nextInt());
			
			System.out.println(teste);
		}
		
		System.out.println(j.imprimirTentativas());
		
		sc.close();
		
	}
	
}
