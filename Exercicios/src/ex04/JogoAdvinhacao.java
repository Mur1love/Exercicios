package ex04;

import java.util.Arrays;
import java.util.Random;

public class JogoAdvinhacao {
	
	Random r = new Random();
	int [] tentativas = new int [2];
	
	int total = 0; 
	
	int aleatorio = r.nextInt(99);
	
	public String verificar (int numero) {
		
		if(this.total == this.tentativas.length) {
			aumentaVetor();
		}
		
		if(numero > this.aleatorio) {
			this.tentativas[total] = numero;
			this.total++;
			return "Numero MAIOR que o gerado";
		}
		
		if(numero < this.aleatorio) {
			this.tentativas[total] = numero;
			this.total++;
			return "Numero MENOR que o gerado";
		}else {
			this.tentativas[total] = numero;
			this.total++;
			return "Voce ACERTOU!";
		}
	}
	
	public String imprimirTentativas() {
		return "Suas Tentativas: " + Arrays.toString(this.tentativas);
	}

	private void aumentaVetor() {
		int [] newInt = new int[this.tentativas.length+1];
		System.arraycopy(this.tentativas, 0, newInt, 0, this.tentativas.length);
		this.tentativas = newInt;
	}
}
