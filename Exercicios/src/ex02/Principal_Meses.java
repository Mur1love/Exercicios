package ex02;

import java.util.Scanner;

public class Principal_Meses {
	
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numMes;
        
        System.out.print("Digite o numero do mes (1-12): ");
        numMes = input.nextInt();
        
        if (numMes >= 1 && numMes <= 12) {
            String nomeMes;
            switch(numMes) {
                case 1:
                    nomeMes = "Janeiro";
                    break;
                case 2:
                    nomeMes = "Fevereiro";
                    break;
                case 3:
                    nomeMes = "Marco";
                    break;
                case 4:
                    nomeMes = "Abril";
                    break;
                case 5:
                    nomeMes = "Maio";
                    break;
                case 6:
                    nomeMes = "Junho";
                    break;
                case 7:
                    nomeMes = "Julho";
                    break;
                case 8:
                    nomeMes = "Agosto";
                    break;
                case 9:
                    nomeMes = "Setembro";
                    break;
                case 10:
                    nomeMes = "Outubro";
                    break;
                case 11:
                    nomeMes = "Novembro";
                    break;
                case 12:
                    nomeMes = "Dezembro";
                    break;
                default:
                    nomeMes = "";
                    break;
            }
            if (!nomeMes.equals("")) {
                System.out.println("O mes correspondente ao numero " + numMes + " e " + nomeMes);
            } else {
                System.out.println("Mes invalido. Digite um numero de 1 a 12.");
            }
        } else {
            System.out.println("Mes invalido. Digite um numero de 1 a 12.");
        }
        
        input.close();
        
    }

}
