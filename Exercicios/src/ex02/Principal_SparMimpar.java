package ex02;

public class Principal_SparMimpar {
	
	public static void main(String[] args) {
		
		int soma = 0;
		int multi = 0;
		int i;
		
		for(i = 1; i <= 30; i++) {
			
			if(i % 2 == 0) {
				
				
				multi = Servicos.multiPar(multi, i);
				
			} else {
				
				soma = Servicos.somaImpar(soma, i);
				
			}
			
		}
		
		System.out.println("A Soma dos impares e: "+soma);
		
		System.out.println("O Produto dos pares e: "+multi);
		
	}

}
