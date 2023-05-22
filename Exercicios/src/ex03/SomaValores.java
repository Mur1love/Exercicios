package ex03;

public class SomaValores {
	
public double somaValores(double[] valores) {
		
		double soma = 0;
		
		for (int i = 0; i < valores.length; i++) {
			
			soma = soma + valores[i];
		}
		
		return soma;
		
		}

}
