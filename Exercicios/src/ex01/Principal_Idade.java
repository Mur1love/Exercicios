package ex01;
import java.util.Scanner;

public class Principal_Idade {
	
	
	public static void main(String[] args) {
		
		int anoNasc;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento: ");
		anoNasc = entrada.nextInt();
		
		System.out.println(Servico.calcularIdade(anoNasc));
		
		entrada.close();
		
	}

}
