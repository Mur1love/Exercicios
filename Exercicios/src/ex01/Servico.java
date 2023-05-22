package ex01;

public class Servico {
	
	
		
		public static int calcularIdade(int anoNasc) {
			
			int idade = 2023 - anoNasc;
			
			System.out.println("Voce tem " +idade+ " anos de idade!");
			
			return 0;
		} 
		
		
		
		public static double calcularMedia(double n1, double n2, double n3) {
			
			double media = (n1 + n2 + n3) / 3;
			
			if(media > 6)
				System.out.println("Sua media é "+media+ " e voce PASSOU!!");
			else 
				System.out.println("Sua media é "+media+ " e voce NAO PASSOU!!");
			
			return 0;
			
		}
		
		public static double calcularVelocidadeMedia(double distancia, double tempo) {
			
			double velMedia = distancia / tempo;
			
			System.out.println("O veiculo teve uma velocidade media de "+velMedia+" km/h");
			
			return 0;
		}
		
		public static double calcularParcelas (double valor) {
			int qtdParcelas = 5;
			
			double valorParcela = valor / qtdParcelas;
			
			System.out.println("O seu produto ficou 5x de "+valorParcela+" R$");
			
			return 0;
		}
		
		
		
		
		
	} 

