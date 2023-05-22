package ex01;

import java.util.Scanner;

public class AntecessorESucessor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		System.out.println("Seu numero é: "+num);
		System.out.println("Antecessor: "+ (num - 1));
		System.out.println("Sucessor: "+(num + 1));
		
		sc.close();
		
	}

}
