package jogodavelha;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		char[][] tabela = new char[3][3];
		for(int lin = 0; lin < tabela.length; lin++) {
			for(int col = 0; col < tabela[lin].length; col++) {
				tabela[lin][col] = ' ';
			}
		}
		
		char jogador = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner(System.in);
		
		while(!gameOver) {
			imprimirTabela(tabela);
			System.out.println("Jogador "+ jogador + " Sua jogada: ");
			int lin = sc.nextInt();
			int col = sc.nextInt();
			
			if(tabela[lin][col] == ' ') {
				tabela[lin][col] = jogador;
				gameOver = ganhou(tabela, jogador);
				if(gameOver) {
					System.out.println("O Jogador "+ jogador + " Ganhou!");
				}else {
					if(jogador == 'X') {
						jogador = 'O';
					}else {
						jogador = 'X';
					}
				}
			}else {
				System.out.println("Jogada invalida. Tente Novamente!");
			}
		}
		
		imprimirTabela(tabela);
		sc.close();
	}

	private static boolean ganhou(char[][] tabela, char jogador) {
		//verificar linhas
		for(int lin = 0; lin < tabela.length; lin++) {
			if(tabela[lin][0] == jogador && tabela[lin][1] == jogador && tabela[lin][2] == jogador) {
				return true;
			}
		}
		
		//verificar colunas
		for(int col = 0; col < tabela[0].length; col++) {
			if(tabela[0][col] == jogador && tabela[1][col] == jogador && tabela[2][col] == jogador) {
				return true;
			}
		}
		
		//verificar diagonais
		if(tabela[0][0] == jogador && tabela[1][1] == jogador && tabela[2][2] == jogador) {
			return true;
		}
		if(tabela[0][2] == jogador && tabela[1][1] == jogador && tabela[2][0] == jogador) {
			return true;
		}
		
		return false;
	}
	private static void imprimirTabela(char[][] tabela) {
		for(int lin = 0; lin < tabela.length; lin++) {
			for(int col = 0; col < tabela[lin].length; col++) {
				System.out.print(tabela[lin][col] + " | ");
			}
			System.out.println();
		}
	}
}
