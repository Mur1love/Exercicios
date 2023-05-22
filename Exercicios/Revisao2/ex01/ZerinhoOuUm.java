package ex01;

import java.util.Arrays;
import java.util.Random;

public class ZerinhoOuUm {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] v = new int[3];
		
		int A = v[0] = r.nextInt(2);
		int B = v[1] = r.nextInt(2);
		int C = v[2] = r.nextInt(2);
		
		
		System.out.println(Arrays.toString(v));
		
		boolean ganhou = false;
		
		if(A == 1 && B == 0 && C == 0) {
			System.out.println("O Jogador A foi o vencedor!");
			ganhou = true;
		}
		if(A == 0 && B == 1 && C == 0) {
			System.out.println("O Jogador B foi o vencedor!");
			ganhou = true;
		}
		if(A == 0 && B == 0 && C == 1) {
			System.out.println("O Jogador C foi o vencedor!");
			ganhou = true;
		}
		if(!ganhou) {
			System.out.println("Nao ha nenhum vencedor...");
		}
		
		
		
	}

}
