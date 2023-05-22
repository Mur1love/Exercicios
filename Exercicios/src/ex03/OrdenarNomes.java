package ex03;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNomes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.println("Digite o nome " + (i+1) + ": ");
			nomes[i] = sc.nextLine();
		}
		
		Arrays.sort(nomes);;
		
		System.out.println("Ordem alfabetica: ");
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.println(nomes[i]);
		}
		
		sc.close();
		
	}

}
