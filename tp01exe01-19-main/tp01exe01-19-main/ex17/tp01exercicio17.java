/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o 
  cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 
*/

import java.util.Scanner;

public class tp01exercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite X: ");
        double x = sc.nextDouble();
		
        System.out.print("Digite Y: ");
        double y = sc.nextDouble();
        
        double t = Math.pow(x,y);
		
        System.out.println("O resultado é " + t);
		
        sc.close();
    }
}
