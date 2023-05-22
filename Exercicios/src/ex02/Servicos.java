package ex02;

public class Servicos {
	
	public static int soma(int num1, int num2) {
		
		return (num1 + num2);
	}
	
	public static int multiplicacao(int num1, int num2) {
		
		return (num1 * num2);
	}
	
	public static int divisao(int num1, int num2) {
		
		return (num1 / num2);
	}
	
	public static int subtracao(int num1, int num2) {
		
		return (num1 - num2);
	}
	
	public static int somaImpar(int soma, int i) {
		
		return (soma + i);
	}
	
	public static int multiPar(int multi, int i) {
		
		return (multi * i);
	}
	
	public static double salario(double hora) {
		
		return (hora * 12.25);
	}
	
	public static double lucroMin(double pCusto) {
		double x = pCusto / 100;
		
		return( x * 50);
	}

}
