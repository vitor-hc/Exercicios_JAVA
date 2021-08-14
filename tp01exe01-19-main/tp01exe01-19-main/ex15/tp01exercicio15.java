/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de 
  dólares. Calcular e exibir o valor correspondente em Reais (R$).   
*/

import java.util.Scanner;

public class tp01exercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a cotação do dólar: ");
        double c = sc.nextDouble();
		
        System.out.print("Digite a quantidade que deseja converte em reais: ");
        double d = sc.nextDouble();
        
        double r = c * d;    
		
        System.out.println("Vale: " +"R$"+ r);
		
        sc.close();
    }
}
