package ex01;

import java.util.Scanner;

public class VetorMinMax {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o ponto máximo dos numeros: ");
		int max = sc.nextInt();
		
		System.out.println("Digite o ponto minimo dos numeros: ");
		int min = sc.nextInt();
		
		int[] num = {4,1,2,7,4,3,6,7,8,6};
		
		for(int i = min; i <= max; i++) {
			System.out.println(num[i]);
			
		}
		
		sc.close();
	}
}
