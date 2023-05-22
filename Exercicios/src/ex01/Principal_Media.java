package ex01;
import java.util.Scanner;

public class Principal_Media {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		double n2= entrada.nextDouble();
		
		System.out.println("Digite sua terceira nota: ");
		double n3 = entrada.nextDouble();
		
		System.out.println(Servico.calcularMedia(n1, n2, n3));
		
		entrada.close();
		
	}

}
