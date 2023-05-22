package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabetica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] nome = new String[10];
		
		System.out.println("Digite 10 Nomes: ");
		
		for(int i = 0; i < nome.length; i++) {
			nome[i] = sc.next();
		}
		System.out.println("Lista sem ordem: ");
		System.out.println(Arrays.toString(nome));
		
		System.out.println("Lista em Ordem Alfabetica: ");
		Arrays.sort(nome);
		System.out.println(Arrays.toString(nome));
		
		sc.close();
	}

}
