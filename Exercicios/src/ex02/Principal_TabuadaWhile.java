package ex02;

import java.util.Scanner;

public class Principal_TabuadaWhile {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero para fazer a tabuada: ");
		int num = input.nextInt();
		
		int x = 1;
		
		while (x <= 10) {
			
			int res = x * num;
			System.out.println(num + "x" +x+ "=" + res);
			x = x + 1;
			
		}
		
		System.out.println("Fim da tabuada!");
		
		input.close();
	}

}
