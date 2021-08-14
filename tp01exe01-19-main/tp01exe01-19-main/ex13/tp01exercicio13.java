/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos 
  valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
  (em s) que serão digitados. 
*/

import java.util.Scanner;

public class tp01exercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a velocidade inicial do automóvel (em m/s): ");
        double vi = sc.nextDouble();
		
        System.out.print("Digite a aceleração do automóvel (em m/s):  ");
        double a = sc.nextDouble();
		
        System.out.print("Digite o tempo do percurso(em s):  ");
        double t = sc.nextDouble();
		
        double vf = (vi + (a * t)) * 3.6;
		
        System.out.println("A velocidade final do automóvel é: "+vf+"KM/H");
		
        sc.close();
    }
}
